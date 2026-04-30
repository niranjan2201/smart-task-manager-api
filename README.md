# Smart Task Manager API

A clean and minimal backend API for managing tasks with an AI-powered smart feature.

---

## Overview

This project is a Spring Boot-based backend service that allows users to:

* Create tasks
* Mark tasks as completed
* Retrieve all tasks

Additionally, it includes an **AI-powered task summarization feature** that automatically converts long descriptions into concise, actionable summaries.

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database 
* OpenAI API 

---

## Features

### Core Features

* Create a task
* Mark a task as completed
* Fetch all tasks

### AI Feature (Smart Summary)

* Automatically summarizes task descriptions
* Uses OpenAI API

---

## API Endpoints

### 1️⃣ Create Task

**POST** `/tasks`

Request:

```json
{
  "title": "Prepare report",
  "description": "Prepare a detailed quarterly sales performance report including charts and insights"
}
```

Response:

```json
{
  "id": 1,
  "title": "Prepare report",
  "description": "Create a quarterly sales report with insights",
  "status": "PENDING"
}
```

---

### 2️⃣ Mark Task as Completed

**PATCH** `/tasks/{id}`

Response:

```json
{
  "id": 1,
  "title": "Prepare report",
  "description": "Create a quarterly sales report with insights",
  "status": "COMPLETED"
}
```

---

### 3️⃣ Get All Tasks

**GET** `/tasks`

Response:

```json
[
  {
    "id": 1,
    "title": "Prepare report",
    "description": "Create a quarterly sales report with insights",
    "status": "PENDING"
  }
]
```

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/niranjan2201/smart-task-manager-api.git
cd smart-task-manager-api
```

---

### 2. Configure environment variables

Set your OpenAI API key:

#### Windows:

```bash
setx OPENAI_API_KEY "your_api_key_here"
```

---

### 3. Run the application

```bash
./mvnw spring-boot:run
```

---

### 4. Access APIs

* Base URL: `http://localhost:8081`
* H2 Console: `http://localhost:8081/h2-console`

---

## H2 Database Config

```
JDBC URL: jdbc:h2:mem:taskdb
Username: sa
Password: (empty)
```

---

## Author

**Niranjan Naik**  
B.Tech CSE, MIT ADT University, Pune  
Email: naikniranjan300305@gmail.com  
Contact No: 7378861795
