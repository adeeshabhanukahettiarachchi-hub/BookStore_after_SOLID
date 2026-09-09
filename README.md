# 📚 BookStore – After SOLID Principles

## 📖 Project Overview

The **BookStore After SOLID** project is the refactored version of the original BookStore application. The main purpose of this project is to improve the structure, maintainability, flexibility, and scalability of the application by applying **SOLID object-oriented design principles**.

The original implementation contained tightly coupled code and responsibilities within the same classes. In this improved version, the design is organized according to SOLID principles to make the system easier to understand, test, maintain, and extend.

---

## 🎯 Project Objectives

The main objectives of this project are:

* 🧩 Apply SOLID principles to an existing Java application
* 🏗️ Improve the overall software architecture
* 🔄 Reduce unnecessary dependencies between components
* 🛠️ Make the system easier to modify and maintain
* 🧪 Improve testability
* 📈 Make the application easier to extend with new features
* 💻 Demonstrate good Object-Oriented Programming practices

---

## 🧠 SOLID Principles Applied

The project focuses on the five major SOLID principles:

| Principle  | Description                     |
| ---------- | ------------------------------- |
| 🟢 **SRP** | Single Responsibility Principle |
| 🔵 **OCP** | Open/Closed Principle           |
| 🟡 **LSP** | Liskov Substitution Principle   |
| 🟠 **ISP** | Interface Segregation Principle |
| 🔴 **DIP** | Dependency Inversion Principle  |

### 🟢 Single Responsibility Principle (SRP)

Each class should have a clear and focused responsibility.

Instead of placing all bookstore operations inside one large class, responsibilities can be separated into appropriate components.

**Benefits:**

* Easier maintenance
* Easier testing
* Better code organization

---

### 🔵 Open/Closed Principle (OCP)

The system should be **open for extension but closed for modification**.

New functionality can be added without unnecessarily changing existing working code.

**Benefits:**

* Reduces the possibility of introducing bugs
* Makes future feature development easier
* Improves system flexibility

---

### 🟡 Liskov Substitution Principle (LSP)

Objects of a derived class should be usable wherever objects of their base class are expected without breaking the application.

This helps maintain correct relationships between parent and child classes.

**Benefits:**

* More reliable inheritance
* Better polymorphism
* Reduced unexpected behaviour

---

### 🟠 Interface Segregation Principle (ISP)

Classes should not be forced to depend on methods that they do not need.

Large interfaces can be divided into smaller, more focused interfaces.

**Benefits:**

* Cleaner interfaces
* Reduced unnecessary dependencies
* Easier implementation

---

### 🔴 Dependency Inversion Principle (DIP)

High-level modules should depend on abstractions rather than directly depending on low-level implementation classes.

**Benefits:**

* Loose coupling
* Easier testing
* Easier replacement of implementations
* Improved flexibility

---

## 🛠️ Technologies Used

* ☕ **Java**
* 🏗️ **Object-Oriented Programming**
* 🧩 **SOLID Design Principles**
* 📦 **Maven**
* 💡 **IntelliJ IDEA**
* 🔧 **Git & GitHub**

---

## 📂 Project Structure

```text
BookStore_after_SOLID/
│
├── 📁 .idea/
│
├── 📁 src/
│   └── 📁 main/
│       └── 📁 java/
│           └── 📁 org/
│               └── 📁 example/
│
├── 📄 pom.xml
├── 📄 .gitignore
└── 📄 README.md
```

> The package structure may contain additional classes as the SOLID refactoring is developed.

---

## ⚙️ How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/adeeshabhanukahettiarachchi-hub/BookStore_after_SOLID.git
```

### 2️⃣ Open the Project

Open the project using **IntelliJ IDEA**.

### 3️⃣ Load Maven Dependencies

Allow IntelliJ IDEA to load the dependencies defined in:

```text
pom.xml
```

### 4️⃣ Run the Application

Locate the `Main` class and run the application.

---

## 📚 Main BookStore Functions

The application is designed around common bookstore operations such as:

* ➕ Adding books
* 📖 Managing book information
* 👤 Managing customer-related operations
* 🛒 Purchasing books
* 💰 Handling book prices
* 📋 Displaying available books

The exact functionality can be extended as additional SOLID-based classes and services are introduced.

---

## 🔄 Before vs After SOLID

### ❌ Before SOLID

The original application used a more tightly coupled design.

```text
Main
 ├── Book Data
 ├── Customer Data
 ├── Purchase Logic
 ├── Display Logic
 └── Business Logic
```

This approach can become difficult to maintain as the application grows.

### ✅ After SOLID

The refactored application aims to separate responsibilities and reduce dependencies.

```text
                📚 BookStore
                     │
        ┌────────────┼────────────┐
        │            │            │
     📖 Book      👤 Customer   🛒 Purchase
        │            │            │
        └────────────┼────────────┘
                     │
              🔌 Abstractions
                     │
             ⚙️ Implementations
```

This structure provides better separation of concerns and makes the application easier to extend.

---

## 🌟 Advantages of the Refactored System

Applying SOLID principles provides several improvements:

* 🧹 Cleaner code structure
* 🔗 Lower coupling
* 🧩 Better separation of responsibilities
* 🛠️ Easier maintenance
* 🧪 Improved testability
* 🔄 Easier feature modification
* 📈 Better scalability
* 👨‍💻 Improved readability
* ♻️ Greater code reusability

---

## 🎓 Academic Purpose

This project was developed as part of the **Pearson BTEC International Level 3 in Information Technology – Unit 20: Applied Programming and Design Principles**.

The project demonstrates the practical application of:

* Object-Oriented Programming
* SOLID principles
* Software design principles
* Refactoring
* Maintainable software development

---

## 📌 Project Status

🚧 **Status:** Completed / Under Development

The project can be further extended with additional features, unit tests, database integration, and improved user interfaces.

---

## 👨‍💻 Author

**BookStore – SOLID Principles Project**

📌 Developed for academic and learning purposes.

---

## 📄 License

This project is intended for **educational purposes**.
