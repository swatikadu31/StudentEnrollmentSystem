# StudentEnrollmentSystem

# 🎓 Student-Course Enrollment System

This is a mini project built with **Spring Boot** that demonstrates a basic **student-course enrollment system**, supporting core CRUD operations and student-course assignments using RESTful APIs.

## 🚀 Features

- ➕ Add new students and courses
- 📃 List all students and courses
- 🔗 Enroll students into multiple courses (Many-to-Many relationship)
- 🔍 Fetch enrolled students/courses
- 📦 REST APIs tested using Postman

---

## 🛠️ Tech Stack

| Technology       | Description                    |
|------------------|--------------------------------|
| Java             | Programming Language           |
| Spring Boot      | Backend Framework              |
| Spring Data JPA  | ORM & database interaction     |
| MySQL            | Relational Database            |
| Postman          | API testing tool               |

---

## 🧩 Entity Relationship

- **Student ↔ Course**: Many-to-Many  
- A student can enroll in many courses  
- A course can have many students

### 🔗 ER Model Overview:

Student
└─ id
└─ name
└─ email
└─ List<Course>

Course
└─ id
└─ name
└─ description
└─ List<Student>


---

## 📁 Project Structure

src/
└── main/
├── java/
│ └── com.code2java.enroll
│ ├── models/
│ ├── controllers/
│ ├── services/
│ ├── repository/
│ └── EnrollApplication.java
└── resources/
├── application.properties

---

## 📬 API Endpoints

### 📘 Courses
- `POST /api/courses` → Add a new course
- `GET /api/courses` → List all courses

### 🧑‍🎓 Students
- `POST /api/students` → Add a new student
- `GET /api/students` → List all students

### 🔗 Enrollment
- `POST /api/students/{studentId}/enroll/{courseId}` → Enroll a student in a course

---

## 🧪 Sample API Test with Postman

### Add Course
```json
POST /courses/add
{
  "title": "Spring Boot",
  "description": "Intro to Spring Boot"
}

POST /students/add
{
  "name": "abc",
  "email": "abc@example.com"
}

POST /api/students/1/enroll/1

Swati Kadu
Aspiring Full Stack Java Developer | www.linkedin.com/in/swatikadu

🌱 Learning by building one project every day

