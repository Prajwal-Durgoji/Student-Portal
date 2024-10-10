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
![user-register](https://github.com/user-attachments/assets/6647fc64-2c94-4806-817b-47bdf4ddee72)
![user-register db](https://github.com/user-attachments/assets/32380b5b-9b8f-4da4-9dfb-bbf1d872194a)


POST /users/login - User login.
Request Parameters: username, password
![user-login](https://github.com/user-attachments/assets/d37c7b33-9988-4308-86d5-d8dea54e0469)


POST /users/upload
![user-upload](https://github.com/user-attachments/assets/89705775-4515-4690-a9b4-c3bbf147d87e)
![user-upload db](https://github.com/user-attachments/assets/d166b2b4-75b2-41e2-820b-48201a487a4b)

Admin Endpoints:
POST /admin/register - Register a new admin.
![admin-register](https://github.com/user-attachments/assets/1172213b-bc55-487c-9c1f-3b11ea3de6ad)
![admin-register db](https://github.com/user-attachments/assets/f4d90b5c-e667-4ccd-82e8-6dc436e13be2)


POST /admin/login - Admin login.
![admin-login](https://github.com/user-attachments/assets/82bef990-1b75-4c48-9976-b0893190f544)


GET /admin/assignments?adminId=Negan - View assignments tagged to the admin.
![assignment](https://github.com/user-attachments/assets/dba81189-56b1-4414-8adc-0c317324506f)


POST /admin/assignments/{id}/accept - Accept an assignment.
![assignment-accept](https://github.com/user-attachments/assets/117c6a8f-8096-482b-b07c-923f7205f214)

POST /admin/assignments/{id}/reject - Reject an assignment.
![assignment-reject](https://github.com/user-attachments/assets/e77f88ca-9898-4fd0-ae79-d9fcd6c354c3)

