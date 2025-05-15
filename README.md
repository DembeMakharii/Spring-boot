# Spring Boot User Management Demo

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen)
![Java](https://img.shields.io/badge/Java-17-blue)

A simple Spring Boot application demonstrating MVC architecture, Dependency Injection, and in-memory data storage.

## Features

- **Layered Architecture**:
  - Model (`User` class)
  - Repository (`FakeRepo` with in-memory storage)
  - Service (`UserServiceImpl` with business logic)
  
- **Core Spring Boot Concepts**:
  - Dependency Injection (Constructor-based)
  - IoC (Inversion of Control)
  - Annotation-based configuration (`@SpringBootApplication`, `@Autowired`)

- **Console Operations**:
  - Add user: Prints `[name] added`
  - Get user: Prints `Hello [name]`
  - Remove user: Prints `[name] removed`

## Project Structure
spring-boot-user-demo/ <br />
├── src/ <br />
│ ├── main/ <br />
│ │ └── java/com/example/demo/ <br />
│ │ ├── model/User.java <br />
│ │ ├── repo/FakeRepo.java <br />
│ │ ├── service/UserServiceImpl.java <br />
│ │ └── DemoApplication.java <br />
│ └── test/ <br />
│ └── java/com/example/demo/service/UserServiceTests.java <br />
├── build.gradle <br />
└── README.md <br />


## Technologies

- Java 17
- Spring Boot 2.7.0
- JUnit 5 (for testing)
- Gradle (build tool)

## Getting Started

### Prerequisites
- JDK 17+
- Gradle 7+

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring-boot-user-demo.git
Navigate to project directory:

bash
cd spring-boot-user-demo
Running the Application
bash
./gradlew bootRun
Running Tests
bash
./gradlew test
Code Standards
Follows Java camelCase/PascalCase conventions

Constructor-based Dependency Injection

Unit tests for all service methods

Gitflow workflow with semantic commit messages

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
Email: dmakhari6@gmail.com <br />
GitHub: https://github.com/DembeMakharii/Spring-boot <br />
