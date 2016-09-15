logLevel := Level.Warn

resolvers in ThisBuild ++= Seq(
  Resolver.mavenLocal
)

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
