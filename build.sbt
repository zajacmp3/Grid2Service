name := "grid2service"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.projectlombok" % "lombok" % "1.16.8",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.apache.kafka" % "kafka_2.10" % "0.9.0.1",
  "org.apache.kafka" % "kafka-clients" % "0.9.0.1",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.21",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.3",
  "org.seleniumhq.selenium" % "selenium-java" % "2.53.0",
  "org.seleniumhq.selenium" % "selenium-remote-driver" % "2.53.0",
  "org.seleniumhq.selenium" % "selenium-server" % "2.53.0"
)
