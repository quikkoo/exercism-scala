organization in ThisBuild := "quikkoo.exercism"
name := "exercism"
version := "1.0.0"

scalaVersion in ThisBuild := "2.11.8"

resolvers in ThisBuild ++= Seq(
  Resolver.mavenLocal
)

lazy val anagram = project
lazy val bob = project
lazy val etl = project
lazy val hello_world = project in file("hello-world")
lazy val word_count = project in file("word-count")

lazy val root = project.
  in(file(".")).
  aggregate(
    anagram,
    bob,
    etl,
    hello_world,
    word_count)

import org.scalastyle.sbt.ScalastylePlugin._
scalastyleFailOnError := true

import scoverage.ScoverageKeys._
coverageMinimum := 80
coverageFailOnMinimum := true
