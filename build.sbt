import scalapb.compiler.Version.{grpcJavaVersion, scalapbVersion}

name := "scalagrpcapi"

version := "0.1"

scalaVersion := "2.13.3"



val commonSettings: Seq[Def.Setting[_]] = Seq[Def.Setting[_]](
  scalaVersion := "2.12.8",
  libraryDependencies += "io.grpc" % "grpc-netty" % grpcJavaVersion,
  libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf"
)


lazy val scalagrpcapi = BuildSettings.BaseProject("scala-grpc-api").settings(
  commonSettings,
  libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapbVersion,
  PB.targets in Compile := Seq(
    scalapb.gen(lenses = false, javaConversions = false, grpc = true) -> baseDirectory.value / "src/main/scala/com/knoldus/generated"
  )
)