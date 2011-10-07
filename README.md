# Tiny Dropwizard Example

This project exists to show the minimum work required to setup a dropwizard service.
This frees up codahale/dropwizard-example to show off features you won't always need.

To build dropwizard into your own scala app, do these things (which you can follow along with in commits):

I've moved the example to maven because that's what I'm using now.

1. Create a Service class (see [src/main/scala/TinyExampleService.scala](src/main/scala/TinyExampleService.scala)). Define name and configure.
2. Create a configuration file. example.conf is from the template in dropwizard-example.
3. Drop a pom like the one in the toplevel directory into your project
   root. Update names and add dependencies if needed. Though there
   aren't tests in the example, I've left configuration for Surefire at
   the bottom of the pom that you can probably just take wholesale. I'm
   also using maven-shade for creating a single executable jar, and
   you'll need to update the main class (TinyExampleService in this case)
   for your application.

Run with `mvn scala:run`. See [the maven scala plugin](http://scala-tools.org/mvnsites/maven-scala-plugin/) for more goodies (including mvn scala:console).

`mvn package` will create a single jar.

