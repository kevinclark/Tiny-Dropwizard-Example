# Tiny Dropwizard Example

This project exists to show the minimum work required to setup a dropwizard service.
This frees up codahale/dropwizard-example to show off features you won't always need.


To build dropwizard into your own scala app, do these things (which you can follow along with in commits):

(These directions assume sbt scaffolding already exists. If not, just `sbt` it.)

1. Add plugins to sbt in [project/plugins/Plugins.scala][plugin]
2. Use the plugins and require dropwizard in [project/build/MyProject.scala][project]
3. Run `sbt update` - this will download project dependencies.
3. Create a Service class (see src/main/scala/TinyExampleService.scala). Define name and configure.
4. Create a configuration file. example.conf is from the template in dropwizard-example.

Build with `sbt compile`. If you add the `server` task used in TinyExampleProject you can start with `sbt server`.
You can also run `sbt assembly` and run the jar by hand.

[plugin](https://github.com/kevinclark/Tiny-Dropwizard-Example/blob/master/project/plugins/Plugins.scala)
[project](https://github.com/kevinclark/Tiny-Dropwizard-Example/blob/master/project/plugins/MyProject.scala)
[service](https://github.com/kevinclark/Tiny-Dropwizard-Example/blob/master/src/main/scala/TinyExampleService.scala)
