## Kotlin Spring Boot Application
+ This is a simple Kotlin Spring Boot application that demonstrates basic CRUD (Create, Read, Update, Delete) operations for managing employees.
 ### Getting Started
These instructions will help you set up and run the project on your local machine.

### Prerequisites
Make sure you have the following installed on your machine:

+ Java Development Kit (JDK)
+ Spring Boot
+ IntelliJ IDEA (or any preferred Kotlin/Java IDE)

### Running the Application
Run the application using the following command:

```/gradlew bootRun```

### Usage
The application provides a RESTful API for managing employees. Here are the available endpoints:

- **GET /api/v1/employees**: Get a list of all employees.
- **GET /api/v1/employees/{id}**: Get details for a specific employee.
- **POST /api/v1/employees**: Create a new employee.
- **PUT /api/v1/employees/{id}**: Update an existing employee.
- **DELETE /api/v1/employees/{id}**: Delete an employee.