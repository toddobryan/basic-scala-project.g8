name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.5" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

