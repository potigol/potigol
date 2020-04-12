name := "potigol"
organization := "potigol"

version := "1.0"

scalaVersion := "2.12.11"

javacOptions in Compile ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")
scalacOptions in Compile ++= Seq("-deprecation")

mainClass in (Compile, packageBin) := Some("br.edu.ifrn.potigol.Principal")

assemblyOutputPath in assembly := file("jar/potigol.jar")

libraryDependencies ++= Seq(
  ("org.antlr" % "antlr4" % "4.8-1").
    exclude("com.ibm.icu", "icu4j").
    exclude("org.abego.treelayout", "org.abego.treelayout.core").
    exclude("org.antlr", "ST4").
    exclude("org.glassfish", "javax.json"),
  "org.antlr" % "antlr4-runtime" % "4.8-1" ,
  "org.scala-lang" % "scala-library" % "2.12.11" ,
  ("org.scala-lang" % "scala-compiler" % "2.12.11").
    exclude("org.scala-lang.modules", "scala-xml_2.12"),
  "org.scala-lang" % "scala-reflect" % "2.12.11"
)

enablePlugins(Antlr4Plugin)

antlr4Version in Antlr4 := "4.8-1"
antlr4PackageName in Antlr4 := Some("br.edu.ifrn.potigol.parser")
antlr4GenListener in Antlr4 := true
antlr4GenVisitor in Antlr4 := true

EclipseKeys.withSource in ThisBuild := true
EclipseKeys.withJavadoc in ThisBuild := true
EclipseKeys.createSrc in ThisBuild := EclipseCreateSrc.Default + EclipseCreateSrc.ManagedClasses
