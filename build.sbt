name := "potigol"

ThisBuild / organization := "potigol"
ThisBuild / version      := "1.0-RC2"
ThisBuild / scalaVersion := "2.13.16"

// Compilar visando Java 21
Compile / javacOptions  ++= Seq("--release", "21", "-Xlint")
Compile / scalacOptions ++= Seq("-deprecation")

// Main class para JAR e para o assembly
Compile  / packageBin / mainClass := Some("br.edu.ifrn.potigol.Principal")
assembly / mainClass              := Some("br.edu.ifrn.potigol.Principal")

// Caminho de saída do fat-jar do sbt-assembly
assembly / assemblyOutputPath := file("jar/potigol.jar")

libraryDependencies ++= Seq(
  ("org.antlr" % "antlr4" % "4.13.2")
    .exclude("com.ibm.icu", "icu4j")
    .exclude("org.abego.treelayout", "org.abego.treelayout.core")
    .exclude("org.antlr", "ST4")
    .exclude("org.glassfish", "javax.json"),
  "org.antlr"      % "antlr4-runtime" % "4.13.2",
  // scala-library é gerenciado pelo sbt via scalaVersion; não é necessário declarar explicitamente
  ("org.scala-lang" % "scala-compiler" % "2.13.16")
    .exclude("org.scala-lang.modules", "scala-xml_2.13"),
  "org.scala-lang" % "scala-reflect"  % "2.13.16"
)

// Plugins
enablePlugins(Antlr4Plugin, GraalVMNativeImagePlugin)

// Configuração do ANTLR4
Antlr4 / antlr4Version      := "4.13.2"
Antlr4 / antlr4PackageName  := Some("br.edu.ifrn.potigol.parser")
Antlr4 / antlr4GenListener  := true
Antlr4 / antlr4GenVisitor   := true

// Dica: defina JAVA_HOME para um JDK 21 antes de rodar o sbt
// export JAVA_HOME=/caminho/do/jdk-21
