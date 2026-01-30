# Java, JUnit, and Maven Guide

## Introduction

This README provides an overview of Java, JUnit, and Maven, key technologies used in Java development for building, testing, and managing projects.

## Java

Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is designed to be platform-independent, meaning code written in Java can run on any device that has a Java Virtual Machine (JVM) installed.

### Key Features of Java:
- **Platform Independence**: "Write once, run anywhere" due to the JVM.
- **Object-Oriented**: Everything is an object, promoting modularity and reusability.
- **Robust and Secure**: Includes features like automatic memory management (garbage collection) and strong type checking.
- **Multithreaded**: Supports concurrent programming.
- **Rich API**: Extensive standard library for various tasks.

### Basic Java Program Example:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## JUnit

JUnit is a unit testing framework for Java. It allows developers to write and run repeatable tests to ensure code quality and catch bugs early.

### Key Features of JUnit:
- **Annotations**: Uses annotations like `@Test`, `@Before`, `@After` to define test methods and setup/teardown.
- **Assertions**: Provides methods like `assertEquals`, `assertTrue` to verify expected outcomes.
- **Test Runners**: Supports running tests in various environments.
- **Integration**: Easily integrates with build tools like Maven.

### Example JUnit Test:
```java
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
}
```

## Maven

Maven is a build automation and project management tool primarily used for Java projects. It simplifies the build process, manages dependencies, and provides a standard project structure.

### Key Features of Maven:
- **Dependency Management**: Automatically downloads and manages project dependencies from repositories.
- **Project Structure**: Enforces a standard directory layout (e.g., `src/main/java` for source code).
- **Build Lifecycle**: Defines phases like compile, test, package, install.
- **Plugins**: Extensible through plugins for tasks like testing, packaging, and deployment.
- **POM (Project Object Model)**: Uses an XML file (`pom.xml`) to configure the project.

### Example pom.xml:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>calculator</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

## How They Work Together

In a typical Java project:
1. **Java** is the programming language used to write the application code.
2. **JUnit** is used to write unit tests for the Java code to ensure functionality.
3. **Maven** manages the project, including compiling Java code, running JUnit tests, and packaging the application.

To get started:
- Install Java JDK
- Install Maven
- Create a Maven project with `mvn archetype:generate`
- Write Java code in `src/main/java`
- Write JUnit tests in `src/test/java`
- Run tests with `mvn test`
- Build the project with `mvn package`

## Running the Calculator Project

This directory contains a simple Java calculator project demonstrating Java, JUnit, and Maven integration.

### Prerequisites
- Java JDK 8 or higher
- Maven 3.6 or higher

### Project Structure
```
Calculator/
├── pom.xml                    # Maven configuration
├── src/
│   ├── main/java/Calculator.java    # Main calculator class
│   └── test/java/CalculatorTest.java # JUnit tests
└── README.md                 # This file
```

### Commands to Run

1. **Compile the project**:
   ```bash
   mvn compile
   ```

2. **Run the tests**:
   ```bash
   mvn test
   ```

3. **Run the calculator application**:
   ```bash
   mvn exec:java
   ```

4. **Package the application**:
   ```bash
   mvn package
   ```

5. **Clean the project**:
   ```bash
   mvn clean
   ```

### How to Use the Calculator
When you run `mvn exec:java`, the program will prompt you to:
- Enter the first number
- Enter the second number
- Choose an operation (1 for Add, 2 for Subtract, 3 for Multiply)

The result will be displayed on the console.

### Testing
The JUnit tests cover all three operations with multiple test cases. Run `mvn test` to execute them and ensure everything works correctly.