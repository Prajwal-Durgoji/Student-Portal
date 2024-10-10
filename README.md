# Assignment Management System

## Overview
This project implements a simple Assignment Management System using Spring Boot and MongoDB.

## Features
- User registration and login
- Admin registration and login
- Users can upload assignments
- Admins can view, accept, or reject assignments

## Technologies Used
- Spring Boot
- Spring Data MongoDB
- MongoDB

## Setup Instructions

### Prerequisites
- Java 8 or higher
- Maven
- MongoDB

Endpoints

User Endpoints:

POST /users/register - Register a new user.

Request Body Example:

json

Copy
{
    "id": 1,
    "username": "Soumik",
    "password": "password123",
    "role": "USER"
}
POST /users/login - User login.

Request Parameters: username, password

POST /users/upload - Upload an assignment.

Request Body Example:

{
    "id": 1,
    "userId": "Anand",
    "task": "Hello world",
    "adminId": "Alok"
}
Admin Endpoints:

POST /admin/register - Register a new admin.

Request Body Example:
{
    "id": 1,
    "username": "Alok",
    "password": "password123",
    "role": "ADMIN"
}
POST /admin/login - Admin login.

Request Parameters: username, password

GET /admin/assignments?adminId=Alok - View assignments tagged to the admin.

POST /admin/assignments/{id}/accept - Accept an assignment.

POST /admin/assignments/{id}/reject - Reject an assignment.
