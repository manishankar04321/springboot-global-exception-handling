Global Exception Handling using @ControllerAdvice

## Overview
This project demonstrates how to handle exceptions globally in a Spring Boot REST API using **@ControllerAdvice**.
The application returns clear and user-friendly error messages when invalid student data is requested.

## Features
* Custom exception for invalid student ID
* Global exception handling using **@ControllerAdvice**
* Structured JSON error responses
* Proper HTTP status codes

## Technologies Used
* Java
* Spring Boot
* Spring Web (REST API)
* Maven

## API Endpoint

### Get Student by ID
GET /student/{id}

Example:
http://localhost:8080/student/1
=>Exception Handling
=>StudentNotFoundException

Thrown when a student ID does not exist.

Example Response:
{
"timestamp": "2026-03-10T18:00:00",
"message": "Student not found with ID: 5",
"statusCode": 404
}

=>InvalidInputException

Thrown when an invalid student ID is entered.

Example Response:
{
"timestamp": "2026-03-10T18:01:00",
"message": "Invalid student ID format",
"statusCode": 400
}

## Testing
APIs were tested using **Postman** with both valid and invalid inputs.
