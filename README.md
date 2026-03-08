![Project Cover](images/kenny-eliason-uEcSKKDB1pg-unsplash.jpg)

# 🧪 TestMe Java Project

![Java](https://img.shields.io/badge/Language-Java-blue)
![JUnit](https://img.shields.io/badge/Testing-JUnit5-green)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen)

## 📖 Overview

The **TestMe Java Project** demonstrates basic Java programming concepts and **unit testing using JUnit 5**.
The project contains a simple utility class (`TestMe`) that performs arithmetic operations and logical/string checks.

Unit tests are included to verify that each method behaves correctly. A `Main` class is also provided to demonstrate the functionality of the methods through console output.

This project is intended for educational purposes and illustrates:

* Basic Java class design
* Writing reusable methods
* Unit testing with JUnit
* Simple program execution using a `main` method
* Code documentation and project structure

---

## 📂 Project Structure

```
brcc.edu
│
├── Main.java
├── TestMe.java
└── TestMeUnitTest.java
```

### Main.java

The **entry point** of the program.
This class demonstrates how to create a `TestMe` object and call its methods. The results are printed to the console.

### TestMe.java

A **utility class** containing several methods:

* Integer addition
* Integer subtraction
* Integer multiplication
* Division using double values
* Even number detection
* Substring detection in strings

### TestMeUnitTest.java

Contains **JUnit 5 unit tests** that validate the correctness of each method in `TestMe`.

---

## ⚙️ Features

| Method                                               | Description                                     |
| ---------------------------------------------------- | ----------------------------------------------- |
| `add(int a, int b)`                                  | Returns the sum of two integers                 |
| `subtract(int a, int b)`                             | Returns the difference of two integers          |
| `multiply(int a, int b)`                             | Returns the product of two integers             |
| `divide(double a, double b)`                         | Returns the quotient of two numbers             |
| `isEven(int a)`                                      | Returns `true` if the number is even            |
| `containsSubstring(String string, String subString)` | Returns `true` if a string contains a substring |

---

## 💻 Requirements

To run this project you will need:

* **Java JDK 25 or newer**
* **JUnit 6**
* A Java IDE such as:

    * IntelliJ IDEA
    * Eclipse
    * Visual Studio Code

---

## ▶️ Running the Program

1. Compile the project.
2. Run the `Main` class.

Example console output:

```
add 6 + 7: 13
subtract 15 - 12: 3
multiply 4 * 5: 20
divide 10.0 / 2.0: 5.0
isEven 60: true
Does the message contain 'Java'? true
```

---

## 🧪 Running Unit Tests

1. Open the project in your IDE.
2. Run the `TestMeUnitTest` class using the **JUnit test runner**.

The tests will verify that all methods return the correct results.

---

## 📚 Concepts Demonstrated

* Java classes and objects
* Method creation and reuse
* Basic arithmetic operations
* Boolean logic
* String manipulation
* Unit testing with JUnit
* Software documentation

---

## 👨‍💻 Author

**Karriem Lang**
Blue Ridge Community College
Course: CSC222 Java Programming

---

## 📄 License

This project is intended for **educational use** as part of coursework and programming practice.
