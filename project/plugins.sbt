resolvers += Classpaths.sbtPluginReleases
resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.github.sbt"            % "sbt-ci-release" % "1.5.10")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"   % "0.3.1")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"     % "5.7.0")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"   % "2.4.6")
addSbtPlugin("com.47deg"                 % "sbt-microsites" % "1.3.4")
addSbtPlugin("org.scalameta"             % "sbt-mdoc"       % "2.3.2")
addSbtPlugin("com.scalapenos"            % "sbt-prompt"     % "1.0.2")
