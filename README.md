# Student Management REST API

A Spring Boot REST API project for managing student records.

## Features
- Add Student
- Get All Students
- Get Student By ID
- Update Student
- Delete Student

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

## API Endpoints

### Add Student
POST /students

### Get All Students
GET /students

### Get Student By ID
GET /students/{id}

### Update Student
PUT /students

### Delete Student
DELETE /students/{id}

## Architecture

Controller → Service → Repository → MySQL Database

## Future Enhancements
- Validation
- Exception Handling
- DTO Pattern
- Authentication
- Custom Queries