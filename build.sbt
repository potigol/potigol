name := "potigol"

version := "0.9.14"

scalaVersion := "2.11.12"

javacOptions in Compile ++= Seq("-source", "1.6", "-target", "1.6", "-Xlint")
scalacOptions in Compile += "-target:jvm-1.6"

mainClass in (Compile, packageBin) := Some("br.edu.ifrn.potigol.Principal")

assemblyOutputPath in assembly := file("jar/potigol.jar")

libraryDependencies ++= Seq(
  "org.antlr" % "antlr4" % "4.5.3",
  "org.antlr" % "antlr4-runtime" % "4.5.3",
  "org.scala-lang" % "scala-library" % "2.11.12",
  "org.scala-lang" % "scala-compiler" % "2.11.12",
  "org.scala-lang" % "scala-reflect" % "2.11.12"
)

enablePlugins(Antlr4Plugin)

antlr4Version in Antlr4 := "4.5.3"
antlr4PackageName in Antlr4 := Some("br.edu.ifrn.potigol.parser")
antlr4GenListener in Antlr4 := true
antlr4GenVisitor in Antlr4 := true

EclipseKeys.withSource in ThisBuild := true
EclipseKeys.withJavadoc in ThisBuild := true
EclipseKeys.createSrc in ThisBuild := EclipseCreateSrc.Default + EclipseCreateSrc.ManagedClasses

