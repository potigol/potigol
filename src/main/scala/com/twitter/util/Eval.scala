/*
 * Copyright 2010 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twitter.util

import com.twitter.conversions.string._
import com.twitter.io.StreamIO
import java.io.{ File, FileWriter, InputStream, FileInputStream }
import java.math.BigInteger
import java.net.URLClassLoader
import java.security.MessageDigest
import java.util.Random
import java.util.jar.JarFile
import scala.collection.mutable
import scala.io.Source
//import scala.collection.JavaConverters._
import scala.collection.immutable.StringOps
//import scala.reflect.api.Position
import scala.reflect.internal.util.{ BatchSourceFile, Position }
import scala.reflect.internal.util.AbstractFileClassLoader
import scala.tools.nsc.io.{ AbstractFile, VirtualDirectory }
import scala.tools.nsc.reporters.{ Reporter, AbstractReporter}
import scala.tools.nsc.{ Global, Settings }
import scala.util.matching.Regex

/**
 * Evaluate a file or string and return the result.
 */
@deprecated("use a throw-away instance of Eval instead", "1.8.1")
object Eval extends Eval {
  private val jvmId = java.lang.Math.abs(new Random().nextInt())
  val classCleaner: Regex = "\\W".r
}

/**
 * Evaluates files, strings, or input streams as Scala code, and returns the result.
 *
 * If `target` is `None`, the results are compiled to memory (and are therefore ephemeral). If
 * `target` is `Some(path)`, the path must point to a directory, and classes will be saved into
 * that directory.
 *
 * Eval also supports a limited set of preprocessors. Currently, "limited" means "exactly one":
 * directives of the form `#include <file>`.
 *
 * The flow of evaluation is:
 * - extract a string of code from the file, string, or input stream
 * - run preprocessors on that string
 * - wrap processed code in an `apply` method in a generated class
 * - compile the class
 * - construct an instance of that class
 * - return the result of `apply()`
 */
class Eval(target: Option[File]) {
  /**
   * empty constructor for backwards compatibility
   */
  def this() = {
    this(None)
  }

  import Eval.jvmId

  private lazy val compilerPath = try {
    classPathOfClass("scala.tools.nsc.Interpreter")
  } catch {
    case e: Throwable =>
      throw new RuntimeException("Unable to load Scala interpreter from classpath (scala-compiler jar is missing?)", e)
  }

  private lazy val libPath = try {
    classPathOfClass("scala.AnyVal")
  } catch {
    case e: Throwable =>
      throw new RuntimeException("Unable to load scala base object from classpath (scala-library jar is missing?)", e)
  }

  /**
   * Preprocessors to run the code through before it is passed to the Scala compiler.
   * if you want to add new resolvers, you can do so with
   * new Eval(...) {
   *   lazy val preprocessors = {...}
   * }
   */
  protected lazy val preprocessors: Seq[Preprocessor] =
    Seq(
      new IncludePreprocessor(
        Seq(
          new ClassScopedResolver(getClass),
          new FilesystemResolver(new File(".")),
          new FilesystemResolver(new File("." + File.separator + "config"))) ++ (
            Option(System.getProperty("com.twitter.util.Eval.includePath")) map { path =>
              new FilesystemResolver(new File(path))
            })))

  private[this] val STYLE_INDENT = 2
  private[this] lazy val compiler = new StringCompiler(STYLE_INDENT, target)

  /**
   * run preprocessors on our string, returning a String that is the processed source
   */
  def sourceForString(code: String): String = {
    preprocessors.foldLeft(code) { (acc, p) =>
      p(acc)
    }
  }

  /**
   * write the current checksum to a file
   */
  def writeChecksum(checksum: String, file: File): Unit = {
    val writer = new FileWriter(file)
    writer.write("%s".format(checksum))
    writer.close()
  }

  /**
   * val i: Int = new Eval()("1 + 1") // => 2
   */
  def apply[T](code: String, resetState: Boolean = true): T = {
    val processed = sourceForString(code)
    applyProcessed(processed, resetState)
  }

  /**
   * val i: Int = new Eval()(new File("..."))
   */
  def apply[T](files: File*): T = {
    if (target.isDefined) {
      val targetDir = target.get
      val unprocessedSource = files.map { scala.io.Source.fromFile(_).mkString }.mkString("\n")
      val processed = sourceForString(unprocessedSource)
      val sourceChecksum = uniqueId(processed, None)
      val checksumFile = new File(targetDir, "checksum")
      val lastChecksum = if (checksumFile.exists) {
        Source.fromFile(checksumFile).getLines().take(1).toList.head
      } else {
        -1
      }

      if (lastChecksum != sourceChecksum) {
        compiler.reset()
        writeChecksum(sourceChecksum, checksumFile)
      }

      // why all this nonsense? Well.
      // 1) We want to know which file the eval'd code came from
      // 2) But sometimes files have characters that aren't valid in Java/Scala identifiers
      // 3) And sometimes files with the same name live in different subdirectories
      // so, clean it hash it and slap it on the end of Evaluator
      val cleanBaseName = fileToClassName(files(0))
      val className = "Evaluator__%s_%s".format(
        cleanBaseName, sourceChecksum)
      applyProcessed(className, processed, resetState = false)
    } else {
      apply(files.map { scala.io.Source.fromFile(_).mkString }.mkString("\n"))
    }
  }

  /**
   * val i: Int = new Eval()(getClass.getResourceAsStream("..."))
   */
  def apply[T](stream: InputStream): T = {
    apply(sourceForString(Source.fromInputStream(stream).mkString))
  }

  /**
   * same as apply[T], but does not run preprocessors.
   * Will generate a classname of the form Evaluater__<unique>,
   * where unique is computed from the jvmID (a random number)
   * and a digest of code
   */
  def applyProcessed[T](code: String, resetState: Boolean): T = {
    val id = uniqueId(code)
    val className = "Evaluator__" + id
    applyProcessed(className, code, resetState)
  }

  /**
   * same as apply[T], but does not run preprocessors.
   */
  def applyProcessed[T](className: String, code: String, resetState: Boolean): T = {
    val cls = compiler(wrapCodeInClass(className, code), className, resetState)
    cls.getConstructor().newInstance().asInstanceOf[() => Any].apply().asInstanceOf[T]
  }

  /**
   * converts the given file to evaluable source.
   * delegates to toSource(code: String)
   */
  def toSource(file: File): String = {
    toSource(scala.io.Source.fromFile(file).mkString)
  }

  /**
   * converts the given file to evaluable source.
   */
  def toSource(code: String): String = {
    sourceForString(code)
  }

  /**
   * Compile an entire source file into the virtual classloader.
   */
  def compile(code: String): Unit = {
    compiler(sourceForString(code))
  }

  /**
   * Like `Eval()`, but doesn't reset the virtual classloader before evaluating. So if you've
   * loaded classes with `compile`, they can be referenced/imported in code run by `inPlace`.
   */
  def inPlace[T](code: String): T = {
    apply[T](code, resetState = false)
  }

  /**
   * Check if code is Eval-able.
   * @throws CompilerException if not Eval-able.
   */
  def check(code: String): Unit = {
    val id = uniqueId(sourceForString(code))
    val className = "Evaluator__" + id
    val wrappedCode = wrapCodeInClass(className, code)
    compile(wrappedCode) // may throw CompilerException
  }

  /**
   * Check if files are Eval-able.
   * @throws CompilerException if not Eval-able.
   */
  def check(files: File*): Unit = {
    val code = files.map { scala.io.Source.fromFile(_).mkString }.mkString("\n")
    check(code)
  }

  /**
   * Check if stream is Eval-able.
   * @throws CompilerException if not Eval-able.
   */
  def check(stream: InputStream): Unit = {
    check(scala.io.Source.fromInputStream(stream).mkString)
  }

  def findClass(className: String): Class[_] = {
    compiler.findClass(className).getOrElse { throw new ClassNotFoundException("no such class: " + className) }
  }

  private[util] def uniqueId(code: String, idOpt: Option[Int] = Some(jvmId)): String = {
    val digest = MessageDigest.getInstance("SHA-1").digest(code.getBytes())
    val sha = new BigInteger(1, digest).toString(16)
    idOpt match {
      case Some(_) => sha + "_" + jvmId
      case _ => sha
    }
  }

  private[util] def fileToClassName(f: File): String = {
    // HOPE YOU'RE HAPPY GUYS!!!!
    /*          __
     *    __/|_/ /_  __  ______ ________/|_
     *   |    / __ \/ / / / __ `/ ___/    /
     *  /_ __/ / / / /_/ / /_/ (__  )_ __|
     *   |/ /_/ /_/\__,_/\__, /____/ |/
     *                  /____/
     */
    val fileName = f.getName
    val baseName = fileName.lastIndexOf('.') match {
      case -1 => fileName
      case dot => fileName.substring(0, dot)
    }
    baseName.regexSub(Eval.classCleaner) { m =>
      "$%02x".format(m.group(0).charAt(0).toInt)
    }
  }

  /*
   * Wraps source code in a new class with an apply methods.
   */
  private[this] def wrapCodeInClass(className: String, code: String) = {
    "class " + className + " extends (() => Any) {\n" +
      "  def apply() = {\n" +
      code + "\n" +
      "  }\n" +
      "}\n"
  }

  /*
   * For a given FQ classname, trick the resource finder into telling us the containing jar.
   */
  private def classPathOfClass(className: String) = {
    val resource = className.split('.').mkString("/", "/", ".class")
    val path = getClass.getResource(resource).getPath
    if (path.indexOf("file:") >= 0) {
      val indexOfFile = path.indexOf("file:") + 5
      val indexOfSeparator = path.lastIndexOf('!')
      List(path.substring(indexOfFile, indexOfSeparator))
    } else {
      require(path.endsWith(resource))
      List(path.substring(0, path.length - resource.length + 1))
    }
  }

  /*
   * Try to guess our app's classpath.
   * This is probably fragile.
   */
  lazy val impliedClassPath: List[String] = {
    @scala.annotation.tailrec
    def getClassPath(cl: ClassLoader, acc: List[List[String]] = List.empty): List[List[String]] = {
      val cp = cl match {
        case urlClassLoader: URLClassLoader => urlClassLoader.getURLs.filter(_.getProtocol == "file").
          map(u => new File(u.toURI).getPath).toList
        case _ => Nil
      }
      cl.getParent match {
        case null => (cp :: acc).reverse
        case parent => getClassPath(parent, cp :: acc)
      }
    }

    val classPath = getClassPath(this.getClass.getClassLoader)
    val currentClassPath = classPath.head

    // if there's just one thing in the classpath, and it's a jar, assume an executable jar.
    currentClassPath ::: (if (currentClassPath.size == 1 && currentClassPath.head.endsWith(".jar")) {
      val jarFile = currentClassPath.head
      val relativeRoot = new File(jarFile).getParentFile
      val nestedClassPath = new JarFile(jarFile).getManifest.getMainAttributes.getValue("Class-Path")
      if (nestedClassPath eq null) {
        Nil
      } else {
        nestedClassPath.split(" ").map { f => new File(relativeRoot, f).getAbsolutePath }.toList
      }
    } else {
      Nil
    }) ::: classPath.tail.flatten
  }

  trait Preprocessor {
    def apply(code: String): String
  }

  trait Resolver {
    def resolvable(path: String): Boolean
    def get(path: String): InputStream
  }

  class FilesystemResolver(root: File) extends Resolver {
    private[this] def file(path: String): File =
      new File(root.getAbsolutePath + File.separator + path)

    def resolvable(path: String): Boolean =
      file(path).exists

    def get(path: String): InputStream =
      new FileInputStream(file(path))
  }

  class ClassScopedResolver(clazz: Class[_]) extends Resolver {
    private[this] def quotePath(path: String) =
      "/" + path

    def resolvable(path: String): Boolean =
      clazz.getResourceAsStream(quotePath(path)) != null

    def get(path: String): InputStream =
      clazz.getResourceAsStream(quotePath(path))
  }

  class ResolutionFailedException(message: String) extends Exception

  /*
   * This is a preprocesor that can include files by requesting them from the given classloader
   *
   * Thusly, if you put FS directories on your classpath (e.g. config/ under your app root,) you
   * mix in configuration from the filesystem.
   *
   * @example #include file-name.scala
   *
   * This is the only directive supported by this preprocessor.
   *
   * Note that it is *not* recursive. Included files cannot have includes
   */
  class IncludePreprocessor(resolvers: Seq[Resolver]) extends Preprocessor {
    def maximumRecursionDepth = 100

    def apply(code: String): String =
      apply(code, maximumRecursionDepth)

    def apply(code: String, maxDepth: Int): String = {
      val lines = new StringOps(code).lines.map { line: String =>
        val tokens = line.trim.split(' ')
        if (tokens.length == 2 && tokens(0).equals("#include")) {
          val path = tokens(1)
          resolvers find { resolver: Resolver =>
            resolver.resolvable(path)
          } match {
            case Some(r: Resolver) =>
              // recursively process includes
              if (maxDepth == 0) {
                throw new IllegalStateException("Exceeded maximum recusion depth")
              } else {
                apply(StreamIO.buffer(r.get(path)).toString, maxDepth - 1)
              }
            case _ =>
              throw new IllegalStateException("No resolver could find '%s'".format(path))
          }
        } else {
          line
        }
      }
      lines.mkString("\n")
    }
  }

  /**
   * Dynamic scala compiler. Lots of (slow) state is created, so it may be advantageous to keep
   * around one of these and reuse it.
   */
  private class StringCompiler(lineOffset: Int, targetDir: Option[File]) {
    val target: AbstractFile = targetDir match {
      case Some(dir) => AbstractFile.getDirectory(dir)
      case None => new VirtualDirectory("(memory)", None)
    }

    val cache = new mutable.HashMap[String, Class[_]]()

    val settings = new Settings
    settings.nowarnings.value = true // warnings are exceptions, so disable
    settings.outputDirs.setSingleOutput(target)

    val pathList: List[String] = compilerPath ::: libPath
    settings.bootclasspath.value = pathList.mkString(File.pathSeparator)
    settings.classpath.value = (pathList ::: impliedClassPath).mkString(File.pathSeparator)

    object reporter extends AbstractReporter {
      val settings: Settings = StringCompiler.this.settings
      val messages = new mutable.ListBuffer[List[String]]

      def display(pos: Position, message: String, severity: Severity): Unit = {
        severity.count += 1
        val severityName = severity match {
          case ERROR => "error: "
          case WARNING => "warning: "
          case _ => ""
        }
        // the line number is not always available
        val lineMessage =
          try {
            "line " + (pos.line - lineOffset)
          } catch {
            case _: Throwable => ""
          }
        messages += (severityName + lineMessage + ": " + message) ::
          (if (pos.isDefined) {
            pos.finalPosition.lineContent.stripLineEnd ::
              (" " * (pos.column - 1) + "^") ::
              Nil
          } else {
            Nil
          })
      }

      def displayPrompt: Unit = {
        // no.
      }

      override def reset: Unit = {
        super.reset
        messages.clear()
      }
    }

    val global = new Global(settings, reporter)

    /*
     * Class loader for finding classes compiled by this StringCompiler.
     * After each reset, this class loader will not be able to find old compiled classes.
     */
    var classLoader = new AbstractFileClassLoader(target, this.getClass.getClassLoader)

    def reset(): Unit = {
      targetDir match {
        case None =>
          target.asInstanceOf[VirtualDirectory].clear()
        case Some(_) =>
          target.foreach { abstractFile =>
            if (abstractFile.file == null || abstractFile.file.getName.endsWith(".class")) {
              abstractFile.delete()
            }
          }
      }
      cache.clear()
      reporter.reset()
      classLoader = new AbstractFileClassLoader(target, this.getClass.getClassLoader)
    }

    object Debug {
      val enabled: Boolean =
        System.getProperty("eval.debug") != null

      def printWithLineNumbers(code: String): Unit ={
        printf("Code follows (%d bytes)\n", code.length)

        var numLines = 0
        new StringOps(code).lines.foreach { line: String =>
          numLines += 1
          println(numLines.toString.padTo(5, ' ') + "| " + line)
        }
      }
    }

    def findClass(className: String): Option[Class[_]] = {
      synchronized {
        cache.get(className).orElse {
          try {
            val cls = classLoader.loadClass(className)
            cache(className) = cls
            Some(cls)
          } catch {
            case _: ClassNotFoundException => None
          }
        }
      }
    }

    /**
     * Compile scala code. It can be found using the above class loader.
     */
    def apply(code: String): Unit = {
      import scala.language.reflectiveCalls
      if (Debug.enabled)
        Debug.printWithLineNumbers(code)

      // if you're looking for the performance hit, it's 1/2 this line...
      val compiler = new global.Run
      val sourceFiles = List(new BatchSourceFile("(inline)", code))
      // ...and 1/2 this line:
      compiler.compileSources(sourceFiles)

      if (reporter.hasErrors || reporter.WARNING.count > 0) {
        throw new CompilerException(reporter.messages.toList)
      }
    }

    /**
     * Compile a new class, load it, and return it. Thread-safe.
     */
    def apply(code: String, className: String, resetState: Boolean = true): Class[_] = {
      synchronized {
        if (resetState) reset()
        findClass(className).getOrElse {
          apply(code)
          findClass(className).get
        }
      }
    }
  }

  class CompilerException(val messages: List[List[String]]) extends Exception(
    "Compiler exception " + messages.map(_.mkString("\n")).mkString("\n"))
}