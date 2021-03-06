resolvers += "staged dependency-graph" at "https://oss.sonatype.org/content/repositories/netvirtual-void-1001"

resolvers += "oss snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// eclipse support
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")

// to generate dependency graph of the libraries
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")

// check latest updates form maven
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")

// generates build information, timestamp
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")

// generate fat jar
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7")

// code coverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

// Gerolf's release plugin
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.8")

// github publishing
addSbtPlugin("ohnosequences" % "sbt-github-release" % "0.7.0")

// Library to fetch dependencies from Maven / Ivy repositories super fast - 1.1.0-M4
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")
