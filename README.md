# Student Management System

A simple Student Management System implemented in Java with Spring Boot, using CRUD operations.

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)

## Description

This project provides a basic implementation of a Student Management System with CRUD operations. It uses Spring Boot, JPA/Hibernate for data persistence, and exposes RESTful APIs for managing student records.

## Features

- **Create:** Add a new student to the system.
- **Read:** Retrieve student details based on ID or list all students.
- **Update:** Modify existing student records.
- **Delete:** Remove a student from the system.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 11 or higher
- Maven
- Your preferred IDE (IntelliJ IDEA, Eclipse, etc.)

## Installation

1. Clone the repository: `git clone https://github.com/yourusername/student-management-system.git`
2. Open the project in your preferred IDE.
3. Build the project using Maven: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Usage

The application runs on `http://localhost:8080`. You can use tools like Postman or cURL to interact with the RESTful endpoints.

## Endpoints

- **GET /v1/studentById/{id}:** Retrieve details of a specific student by ID.
- **GET /v1/studentByName/{fullName}:** Retrieve details of a specific student by Name.
- **GET /v1/students:** Retrieve a list of all students.
- **POST /v1/add:** Add a new student.
- **POST /v1/bunch:** Adds a list of new students.
- **PUT /v1/update:** Update an existing student.
- **DELETE /v1/delete/{id}:** Delete a student by ID.

## Contributing

Feel free to contribute to the project. Fork the repository, make your changes, and submit a pull request.
