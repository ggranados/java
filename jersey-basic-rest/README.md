# The (very) Basic - RESTful Web services with JAX-RS

This tutorial will show you how to create RESTfull Web services using JAX-RS

Implemented a very basic endpoint at:

~~~
GET http://localhost:8080/api/rest/sayhi
~~~

Using: 

   - JAX-RS implementation [Eclipse Jersey](https://eclipse-ee4j.github.io/jersey/) latest stable version 2.45 (excluding jakarta.activation.api)
   - [Jetty Maven Plugin](https://wiki.eclipse.org/Jetty/Feature/Jetty_Maven_Plugin) version 9.4.44.v20210927 (Jetty application server running along)
   - Maven Compiler Plugin version 3.8.0
   - Web Application Descriptor version 4.0


Run it with:

~~~
mvn jetty:run
~~~
