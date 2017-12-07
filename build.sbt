name := "potigol"

version := "0.9.14"

scalaVersion := "2.11.11"

javacOptions in Compile ++= Seq("-source", "1.6", "-target", "1.6", "-Xlint")
scalacOptions in Compile += "-target:jvm-1.6"

mainClass in (Compile, packageBin) := Some("br.edu.ifrn.potigol.Principal")

assemblyOutputPath in assembly := file("jar/potigol.jar")

libraryDependencies ++= Seq(
  "org.antlr" % "antlr4" % "4.5.3",
  "org.antlr" % "antlr4-runtime" % "4.5.3",
  "org.scala-lang" % "scala-library" % "2.11.11",
  "org.scala-lang" % "scala-compiler" % "2.11.11",
  "org.scala-lang" % "scala-reflect" % "2.11.11"
)
