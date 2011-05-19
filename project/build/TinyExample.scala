import sbt._
import assembly._
import maven._

class TinyExampleProject(info: ProjectInfo) extends DefaultProject(info)
                                        with AssemblyBuilder
                                        with MavenDependencies
{
  val codaRepo = "Coda Hale's Repository" at "http://repo.codahale.com/"

  val dropWizard = "com.yammer" %% "dropwizard" % "0.0.6"

  // A nice to have, but not essential.
  lazy val server = runTask(
    getMainClass(true), runClasspath, List("server", "example.conf")
  ) dependsOn(compile) describedAs("Runs Example Service with example.conf")
}
