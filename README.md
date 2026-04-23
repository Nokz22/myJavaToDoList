📝 My To-Do List — Java MVC Console App

A simple console-based To-Do List application built in Java, following the MVC (Model-View-Controller) architecture.

This project marks the beginning of my Java learning journey, with a strong focus on writing clean, maintainable, and well-structured code.

🚀 Overview

This application allows users to manage tasks directly from the console, demonstrating core programming concepts such as:

Separation of concerns using MVC
Object-Oriented Programming (OOP) principles
Clean code practices and project organization
🎯 Key Learnings
MVC Architecture — clear separation between Model, View, and Controller
OOP Concepts — classes, encapsulation, constructors
Enums — handling fixed states in a type-safe way
Collections — working with ArrayList
Control Flow — for-each loops and switch expressions
Dependency Injection — basic implementation
Git & GitHub — version control and workflow
🛠️ Tech Stack
Java 17+
IntelliJ IDEA
Git & GitHub
📦 Project Structure
src/
├── model/
│   ├── Task.java          # Task entity with encapsulation
│   └── TaskState.java     # Enum (PENDING, IN_PROGRESS, COMPLETED)
├── service/
│   └── TaskService.java   # Business logic layer
├── ui/
│   └── TaskUI.java        # Console interface (input/output)
└── Main.java              # Application entry point
⚙️ Getting Started
1. Clone the repository
git clone https://github.com/Nokz22/myJavaToDoList.git
2. Open in your IDE

Import the project into IntelliJ IDEA (or any Java IDE).

3. Run the application

Execute:

Main.java
💡 Features
✅ Add new tasks (title + description)
📋 List all tasks
🔄 Update task status
PENDING → IN_PROGRESS → COMPLETED
❌ Remove tasks by ID
⚠️ Input validation with safe fallbacks
🗺️ Roadmap

This project is part of a structured learning path:

To-Do List — MVC + OOP fundamentals (current)
Student Grade Manager — Inheritance & Abstract Classes
Vehicle Workshop — Interfaces & Custom Exceptions
Bank System — Layered architecture
REST API — Spring Boot
👨‍💻 Author

Nokz22
Aspiring Java developer focused on clean architecture and professional development practices.
