lazy val versions = new {
  val `amqp-client` = "3.6.5"
}

lazy val root = (project in file(".")).
  settings(
    name := "rabbitmq-tutorial-scala",
    version := "1.0",
    scalaVersion := "2.11.8",

    libraryDependencies ++= Seq(
      "com.rabbitmq" % "amqp-client" % versions.`amqp-client`
    )
  )
