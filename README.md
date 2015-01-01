# Unit-Testing

The project helps add unit testing dependencies to a project - JUnit, Hamcrest, Mockito and PowerMock. The Project's POM ensures that you will not have duplicate dependencies (such as hamcrest-core and hamcrest-all) which may lead to class loading issues.

In addition, the project contains a jar with various helper methods.

# Usage

In order to use the project, include the following dependency in your pom.xml:

```xml
<dependency>
  <groupId>com.github.davidrabinowitz.unittesting</groupId>
  <artifactId>unit-testing</artifactId>
  <version>0.1-SNAPSHOT</version>
  <scope>test</scope>
</dependency>
```