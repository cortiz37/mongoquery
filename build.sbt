lazy val root = project in file(".") aggregate(core, casbah, reactivemongo, tepkin) settings(
  Common.settings,
  publish := {},
  publishLocal := {}
)

lazy val core = project in file("core") disablePlugins(CoverallsPlugin)

lazy val casbah = project in file("casbah") dependsOn(core % "test->test ; compile->compile") disablePlugins(CoverallsPlugin)

lazy val reactivemongo = project in file ("reactivemongo") dependsOn(core % "test->test ; compile->compile") disablePlugins(CoverallsPlugin)

lazy val tepkin = project in file("tepkin") dependsOn(core % "test->test ; compile->compile") disablePlugins(CoverallsPlugin)
