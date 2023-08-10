ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "cribbage",
    libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.15" % "test",
    libraryDependencies += "org.scalatest" %% "scalatest-featurespec" % "3.2.15" % "test"
  )


