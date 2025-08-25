name := "potigol"
organization := "potigol"

version := "1.0-RC2"

scalaVersion := "2.13.14"

// Compile para Java 21
Compile / javacOptions ++= Seq("-source", "21", "-target", "21", "-Xlint")
Compile / scalacOptions ++= Seq("-deprecation")

mainClass in (Compile, packageBin) := Some("br.edu.ifrn.potigol.Principal")

assemblyOutputPath in assembly := file("jar/potigol.jar")

libraryDependencies ++= Seq(
  ("org.antlr" % "antlr4" % "4.13.1").
    exclude("com.ibm.icu", "icu4j").
    exclude("org.abego.treelayout", "org.abego.treelayout.core").
    exclude("org.antlr", "ST4").
    exclude("org.glassfish", "javax.json"),
  "org.antlr" % "antlr4-runtime" % "4.13.1",
  "org.scala-lang" % "scala-library" % "2.13.14",
  ("org.scala-lang" % "scala-compiler" % "2.13.14").
    exclude("org.scala-lang.modules", "scala-xml_2.13"),
  "org.scala-lang" % "scala-reflect" % "2.13.14"
)

enablePlugins(Antlr4Plugin)
enablePlugins(GraalVMNativeImagePlugin)

Antlr4 / antlr4Version := "4.13.1"
Antlr4 / antlr4PackageName := Some("br.edu.ifrn.potigol.parser")
Antlr4 / antlr4GenListener := true
Antlr4 / antlr4GenVisitor := true

// Para garantir compilação com Java 21, defina JAVA_HOME para o JDK 21 antes de rodar o sbt:
// export JAVA_HOME=/caminho/do/jdk-21

//EclipseKeys.withSource in ThisBuild := true
//EclipseKeys.withJavadoc in ThisBuild := true
//EclipseKeys.createSrc in ThisBuild := EclipseCreateSrc.Default + EclipseCreateSrc.ManagedClasses
