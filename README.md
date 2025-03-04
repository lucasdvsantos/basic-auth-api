# Basic Authentication API

This is a simple learning project focused on implementing Spring Security in a basic authentication API. It is designed to help understand authentication, password encryption, and securing endpoints using Spring Boot and MySQL.

## Features

- User registration with encrypted passwords
- Basic Authentication for securing endpoints

## Technologies Used

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- BCrypt (for password hashing)

## Getting Started
### Prerequisites

- Java 17+
- MySQL installed and running
- Maven

### Installation
1. Clone the repository:
```  
  git clone https://github.com/lucasdvsantos/basic-auth-api.git
  cd basic-auth-api
```
2. Update application-dev.properties with your MySQL credentials:
```
  spring.datasource.url=jdbc:mysql://localhost:3306/authdb?createDatabaseIfNotExist=true
  spring.datasource.username=mysql_user
  spring.datasource.password=mysql_password

  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
  spring.jpa.show-sql=true
```
3. Build and run the application:
```
  mvn spring-boot:run
```
4. The API will be available at:
```
  http://localhost:8080
```

## API Endpoints
| Method       | Endpoint                  | Description                             |
| ------------ | ------------------------- | --------------------------------------- |
| ```POST```   | ```/users/register```     | Register a new user                     |
| ```GET```    | ```/users```              | Retrieve users (requires authentication)|

## Example JSON Request (Create Task)
```
  {
    "username": "testuser",
    "password": "password123"
  }
```
## Future Improvements

- Improve logging and monitoring
- Implement code testing
- Implement user roles and permissions
- Add JWT authentication
