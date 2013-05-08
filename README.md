eric
====

example for Eric G.

# WS Client Example

In this example we use the [cxf](http://cxf.apache.org/docs/maven-cxf-codegen-plugin-wsdl-to-java.html) maven plugin to generate WS artifacts.

## Instructions

1. Clone or Fork this project using Git.

2. import this project in Eclipse using the import new Project Maven option


# Simple JDBC Example

In this example we use the light weight [H2](http://www.h2database.com/) database that can be manipulated in memory.
This is convenient for testing and demonstrating jdbc capabilities without the burden of setting up a traditional RDBMS.

The tests are present in the class TestDB under the Maven directory src/test/java. All classes in this directory won't be packaged in the final jar. Tests
will be automatically ran by Maven during the [test phase](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html). 

Test can also be ran individually during development time. In Eclipse, select the class and choose Run As > JUnit Test.

### Configuration file

The example also provides a Config class that simply reads properties from a config.properties file. This class is used during JDBC testing to provide
the different needed parameters.

