# Java-OOPs

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)](https://www.java.com)

A comprehensive collection of Java examples demonstrating Object-Oriented Programming (OOP) concepts with practical implementations. This repository serves as an educational resource for understanding core OOP principles in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
- [Usage Instructions](#usage-instructions)
- [Java Best Practices](#java-best-practices)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

This repository contains hands-on examples of Object-Oriented Programming concepts in Java. Each directory focuses on a specific OOP principle or design pattern, providing clear, well-commented code that demonstrates real-world applications of these concepts.

**Key Learning Objectives:**
- Master fundamental OOP concepts (Inheritance, Polymorphism, Encapsulation, Abstraction)
- Understand different types of associations and relationships between objects
- Learn method overriding and inheritance hierarchies
- Explore advanced features like sealed classes for controlled inheritance

## 📂 Repository Structure

The repository is organized into the following directories, each focusing on a specific OOP concept:

### Core Concepts

#### **Inheritance**
Demonstrates the fundamental concept of inheritance where classes inherit properties and methods from parent classes. Covers single-level, multi-level, and hierarchical inheritance patterns.

#### **inheritance-car-example**
A practical example of inheritance using a car hierarchy, showing how specialized vehicle types inherit common properties and behaviors from a base Car class.

#### **inheritance-method-overriding**
Illustrates method overriding in inheritance hierarchies, demonstrating runtime polymorphism where child classes provide specific implementations of parent class methods.

#### **Controlled-Inherintance-Sealed-Classes**
Explores Java's sealed classes feature (Java 15+) that allows you to control which classes can extend or implement a given class or interface, providing more control over inheritance hierarchies.

### Association Types

#### **Aggregation-Composition(Types of Assosiation)**
Demonstrates the difference between aggregation ("has-a" relationship with independent lifecycle) and composition ("part-of" relationship with dependent lifecycle). Examples show how objects relate to each other in different ways.

#### **One-to-one-assosiation(using setter injection)**
Shows one-to-one object relationships established through setter methods, demonstrating dependency injection using setter-based approach.

#### **One-to-one-association(Using constructor injection)**
Illustrates one-to-one object relationships established through constructors, showing dependency injection at object creation time for tighter coupling.

#### **Many-to-many-assosiation(uni-directional)**
Demonstrates many-to-many relationships between objects where multiple instances of one class can be associated with multiple instances of another class, with navigation in one direction.

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher (Java 15+ required for sealed classes)
- **IDE**: IntelliJ IDEA, Eclipse, or any Java-compatible IDE
- **Build Tool** (Optional): Maven or Gradle

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/vikasreddy148/Java-OOPs.git
   cd Java-OOPs
   ```

2. Open the project in your preferred IDE

3. Ensure your JDK is properly configured

## 💻 Usage Instructions

### Running Individual Examples

1. Navigate to the desired concept directory
2. Locate the `Launch.java` or main class file
3. Right-click and select "Run" in your IDE, or compile and run from command line:

   ```bash
   # Navigate to the specific example directory
   cd inheritance-method-overriding/src/animal
   
   # Compile the Java files
   javac *.java
   
   # Run the Launch class
   java Launch
   ```

### Exploring the Code

- Each directory contains self-contained examples with clear class hierarchies
- Start with the `Launch.java` or main class to understand the entry point
- Read through the class definitions to understand relationships and inheritance
- Modify and experiment with the code to deepen your understanding

## ✨ Java Best Practices

This repository follows industry-standard Java best practices:

1. **Package Organization**: Classes are organized into logical packages (e.g., `animal`, `car`)

2. **Naming Conventions**:
   - Classes use PascalCase (e.g., `Animal`, `Launch`)
   - Methods and variables use camelCase (e.g., `makeSound()`, `vehicleName`)
   - Constants use UPPER_SNAKE_CASE

3. **Encapsulation**: Proper use of access modifiers (private, protected, public) to control visibility

4. **Code Reusability**: Demonstrates DRY (Don't Repeat Yourself) principle through inheritance and composition

5. **Single Responsibility**: Each class has a clear, focused purpose

6. **Method Overriding**: Proper use of `@Override` annotation for clarity and compile-time checking

7. **Dependency Injection**: Examples of constructor and setter injection for loose coupling

8. **Modern Java Features**: Utilization of newer Java features like sealed classes where applicable

## 🤝 Contributing

Contributions are welcome! If you'd like to improve the examples or add new OOP concepts:

1. **Fork** the repository
2. **Create** a new branch for your feature:
   ```bash
   git checkout -b feature/new-oop-concept
   ```
3. **Make** your changes with clear, well-commented code
4. **Commit** your changes:
   ```bash
   git commit -m "Add: New example for [concept]"
   ```
5. **Push** to your branch:
   ```bash
   git push origin feature/new-oop-concept
   ```
6. **Submit** a Pull Request with a clear description of your changes

### Contribution Guidelines

- Follow existing code structure and naming conventions
- Include clear comments explaining complex concepts
- Provide a `Launch.java` or main class demonstrating the concept
- Update this README if adding new directories or major features
- Ensure code compiles and runs without errors

## 📄 License

This project is open source and available for educational purposes. Feel free to use these examples for learning and teaching OOP concepts in Java.

**Note**: If you use or reference this repository in your own projects or educational materials, attribution is appreciated but not required.

---

**Maintained by**: [vikasreddy148](https://github.com/vikasreddy148)

**Last Updated**: October 2025

For questions, suggestions, or issues, please open an issue in the repository.
