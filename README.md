Pasted text(1).txt
Document
give readme full code without broken 
i am saking cod not file 
see it is broken the code i want full code 
again it is broken 

You're right. I see the issue now. Do not copy the previous version. It contained extra id="..." values generated around the code blocks, which can corrupt the README when copied.

This time I will use four backticks for the outer ChatGPT code block and normal three-backtick fences inside the README. When you press the Copy button, the outer four backticks will not be copied, and your README will contain the correct Markdown.

# 🎓 Project 69 – LearnSphere – Premium LMS

<p align="left">
  <img src="https://img.shields.io/badge/Java-21-E76F00?logo=openjdk&logoColor=white" alt="Java 21">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-6DB33F?logo=springboot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/H2-Database-0040C0?logo=h2&logoColor=white" alt="H2 Database">
  <img src="https://img.shields.io/badge/Spring%20Security-Bypass-7C3AED" alt="Spring Security">
  <img src="https://img.shields.io/badge/Frontend-Vanilla%20JavaScript-F7DF1E?logo=javascript&logoColor=black" alt="Vanilla JavaScript">
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven&logoColor=white" alt="Maven">
  <img src="https://img.shields.io/badge/Status-Completed-20B000" alt="Completed">
</p>

---

## 📖 Project Overview

LearnSphere is a Premium Learning Management System developed as **Project 69** of the 100 Java Full Stack Development Projects.

The project is built using Spring Boot, Spring Data JPA, Hibernate, H2 Database, Spring Security and a Vanilla JavaScript frontend.

The application follows a **Bypass Full Stack Architecture**, where the frontend and backend are served by the same Spring Boot application.

---

## 🚀 Bypass Full Stack Architecture

This project uses a **BYPASS FULL STACK architecture**:

- Frontend and Backend run on the **same port `9292`**
- No CORS issues
- No separate React build
- Single `static/index.html` with Vanilla JavaScript
- Backend serves the frontend directly
- Deploy as one JAR
- Authentication with STUDENT / INSTRUCTOR role selector
- Simple Base64 Token + BCrypt
- Login required for enrollment
- Role-based UI
- My Learning Drawer
- Progress tracking

---

# ✨ Main Features

## 🔐 Authentication

Users can create an account using:

- Full Name
- Email
- Password
- Role

Available roles:

- STUDENT
- INSTRUCTOR

Passwords are protected using BCrypt.

After login, a simple Base64 token is generated.

The application stores the login information in browser `localStorage`.

### Token Format

```text
email:role:timestamp
```

---

## 📚 Courses Feed

Courses are loaded dynamically from the backend.

API:

```text
GET /api/courses
```

Each course card displays:

- Course image
- ₹ Price
- Level
- Course title
- Instructor
- Category
- Duration
- Description
- Preview button
- Enroll Now button

### Sample Courses

| Course | Price | Level | Duration |
|---|---:|---|---|
| Java Full Stack Mastery | ₹2999 | Advanced | 40 Hours |
| React 18 + Tailwind Pro | ₹1999 | Beginner | 25 Hours |
| AWS DevOps + Docker | ₹3999 | Intermediate | 30 Hours |

---

# 🔎 Search and Filters

## Category Filters

The application supports:

- All
- Java
- Frontend
- DevOps
- AI

## Search

Users can search courses by:

- Course title
- Category

The course list updates dynamically.

---

# 🎒 My Learning

Students can access the:

```text
My Learning
```

section after enrolling in courses.

The application calls:

```text
GET /api/enrollments/my/{email}
```

The My Learning drawer displays:

- Course thumbnail
- Course title
- Category
- Enrollment date
- Enrollment status
- Progress percentage
- Progress bar

### Default Progress

```text
15%
```

### Example

```text
Java Full Stack Mastery

ENROLLED

Progress: 15%
████░░░░░░░░░░░░░░░░
```

---

# 📈 Progress Tracking

The My Learning section provides:

- Total enrolled courses
- Average progress
- Individual course progress
- Visual progress bars

Example:

```text
Progress: 15%
```

---

# ➕ Instructor Dashboard

Only users with the `INSTRUCTOR` role can access instructor features.

The instructor dashboard contains:

```text
+ Add Course
```

### Add Course Fields

1. Title
2. Category
3. Instructor Name
4. Price INR
5. Duration
6. Level
7. Description
8. Image URL

### Categories

- Java
- Frontend
- DevOps
- AI

### Levels

- Beginner
- Intermediate
- Advanced

After successfully adding a course:

```text
Course added!
```

The course appears in the course grid immediately.

---

# 🗑️ Delete Course

Instructors can delete courses.

API:

```text
DELETE /api/courses/{id}
```

After deletion, the course list is refreshed.

---

# 👨‍🎓 Student Enrollment

Only STUDENT users can enroll in courses.

Enrollment flow:

```text
Student Login
      ↓
View Courses
      ↓
Click Enroll Now
      ↓
Find User by Email
      ↓
Get User ID
      ↓
Create Enrollment
      ↓
Enrollment Saved
      ↓
My Learning Updated
```

Successful enrollment displays:

```text
Enrolled successfully!
```

The My Learning counter is updated:

```text
My Learning (1)
```

---

# 🛡️ Role Protection

## STUDENT

Students can:

- View courses
- Search courses
- Filter courses
- Enroll
- Open My Learning
- View progress

---

## INSTRUCTOR

Instructors can:

- View courses
- Add courses
- Delete courses
- Access Instructor Dashboard

Instructors cannot enroll.

Message:

```text
Only STUDENT can enroll.
Logout & login as Student
```

---

# 🔗 Backend REST APIs

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/api/auth/register` | Register user |
| POST | `/api/auth/login` | Login |
| GET | `/api/users/by-email?email=` | Get user |
| GET | `/api/courses` | Get all courses |
| POST | `/api/courses` | Add course |
| DELETE | `/api/courses/{id}` | Delete course |
| POST | `/api/enrollments` | Enroll student |
| GET | `/api/enrollments` | Get all enrollments |
| GET | `/api/enrollments/my/{email}` | Get student's enrollments |

---

# 🛠️ Technologies Used

| Technology | Version | Purpose |
|---|---|---|
| Java | 21 | Backend programming |
| Spring Boot | 3.2.5 | Backend framework |
| Spring Data JPA | 3.2.5 | Database access |
| Hibernate | 6.x | ORM |
| Spring Security | 6.x | Security |
| H2 Database | 2.x | Database |
| BCrypt | - | Password hashing |
| HTML5 | - | Frontend structure |
| CSS3 | - | Frontend styling |
| JavaScript | Vanilla | Frontend logic |
| Maven | 3.9+ | Build tool |

---

# 🎨 UI Design

The application uses a premium LMS-style interface.

### Fonts

```text
Outfit
Inter
```

### Gradient

```text
#7C3AED → #06B6D4
```

### Dark Background

```text
#0F0F13
```

The UI includes:

- Glassmorphism
- Gradient buttons
- Course cards
- Responsive layout
- Toast notifications
- Sliding My Learning drawer
- Authentication modal
- Instructor dashboard

---

# 📂 Project Structure

```text
69-lms-mini/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── lms/
│       │           │
│       │           ├── Application.java
│       │           │
│       │           ├── config/
│       │           │   ├── SecurityConfig.java
│       │           │   └── DataLoader.java
│       │           │
│       │           ├── security/
│       │           │   └── JwtUtil.java
│       │           │
│       │           ├── controller/
│       │           │   ├── AuthController.java
│       │           │   ├── CourseController.java
│       │           │   ├── EnrollmentController.java
│       │           │   └── UserController.java
│       │           │
│       │           ├── entity/
│       │           │   ├── User.java
│       │           │   ├── Course.java
│       │           │   └── Enrollment.java
│       │           │
│       │           └── repository/
│       │               ├── UserRepository.java
│       │               ├── CourseRepository.java
│       │               └── EnrollmentRepository.java
│       │
│       └── resources/
│           ├── static/
│           │   └── index.html
│           │
│           └── application.properties
│
├── screenshots/
│   ├── 01-auth-student.png
│   ├── 02-courses-3-live.png
│   ├── 03-enrolled-success-toast.png
│   ├── 04-my-learning-drawer-1-course.png
│   ├── 05-filter-java.png
│   ├── 06-filter-frontend.png
│   ├── 07-filter-devops.png
│   ├── 08-search-java.png
│   ├── 09-add-course-modal.png
│   ├── 10-add-course-fail-long-url.png
│   ├── 11-5-courses-after-add.png
│   ├── 12-api-courses-json.png
│   ├── 13-api-enrollments-json.png
│   └── 14-my-learning-progress.png
│
├── pom.xml
├── .gitignore
└── README.md
```

---

# ▶️ How to Run

## 1. Clone Repository

```bash
git clone https://github.com/raviteja-dev950/69-lms-mini.git
```

Move into the project:

```bash
cd 69-lms-mini
```

---

# 2. Configure Application

Open:

```text
src/main/resources/application.properties
```

Use:

```properties
server.port=9292

spring.datasource.url=jdbc:h2:mem:lmsdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=false

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

# 3. Build the Project

```bash
mvn clean install -DskipTests
```

---

# 4. Run the Application

```bash
mvn spring-boot:run
```

---

# 🌐 Application URLs

## Frontend

```text
http://localhost:9292/
```

## Courses API

```text
http://localhost:9292/api/courses
```

## Enrollments API

```text
http://localhost:9292/api/enrollments
```

## H2 Console

```text
http://localhost:9292/h2-console
```

### H2 JDBC URL

```text
jdbc:h2:mem:lmsdb
```

### Username

```text
sa
```

### Password

```text

```

---

# 💻 Frontend API Examples

## Register

```javascript
fetch('/api/auth/register', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        name: name,
        email: email,
        password: password,
        role: role
    })
});
```

---

## Login

```javascript
fetch('/api/auth/login', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        email: email,
        password: password
    })
});
```

---

## Load Courses

```javascript
fetch('/api/courses')
    .then(response => response.json())
    .then(data => {
        renderCourses(data);
    });
```

---

## Add Course

```javascript
fetch('/api/courses', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        title: title,
        category: category,
        instructor: instructor,
        price: price,
        duration: duration,
        level: level,
        description: description,
        imageUrl: imageUrl
    })
});
```

---

## Enroll

```javascript
const userResponse = await fetch(
    '/api/users/by-email?email=' +
    localStorage.getItem('ls_user')
);

const user = await userResponse.json();

await fetch('/api/enrollments', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        user: {
            id: user.id
        },
        course: {
            id: courseId
        }
    })
});
```

---

## My Learning

```javascript
fetch('/api/enrollments/my/' + user.email)
    .then(response => response.json())
    .then(data => {
        renderMyLearning(data);
    });
```

---

# 🔄 Application Flow

```text
                         Browser
                            |
                            v
              http://localhost:9292/
                            |
                            v
                 static/index.html
                            |
              +-------------+-------------+
              |                           |
              v                           v
          Auth Box                    Main App
              |                           |
       +------+-------+              +----+----+
       |              |              |         |
    Register        Login         STUDENT   INSTRUCTOR
       |              |              |         |
       v              v              v         v
 POST /api/auth/register          Enroll    Add Course
 POST /api/auth/login                |         |
       |                             |         |
       +-------------+---------------+         |
                     |                         |
                     v                         v
                Base64 Token             POST /api/courses
                     |                         |
                     v                         v
                localStorage             Course Added
                     |
                     v
              GET /api/courses
                     |
                     v
                Course Grid
                     |
             +-------+-------+
             |               |
          Student        Instructor
             |               |
           Enroll         Add Course
             |
             v
      POST /api/enrollments
             |
             v
       My Learning Drawer
             |
             v
GET /api/enrollments/my/{email}
             |
             v
        Progress: 15%
```

---

# 🧪 API Testing

## Get Courses

```bash
curl http://localhost:9292/api/courses
```

---

## Register Student

```bash
curl -X POST http://localhost:9292/api/auth/register \
-H "Content-Type: application/json" \
-d "{\"name\":\"Ravi Teja\",\"email\":\"hero@gmail.com\",\"password\":\"1234\",\"role\":\"STUDENT\"}"
```

---

## Register Instructor

```bash
curl -X POST http://localhost:9292/api/auth/register \
-H "Content-Type: application/json" \
-d "{\"name\":\"Ravi Teja\",\"email\":\"instructor@gmail.com\",\"password\":\"1234\",\"role\":\"INSTRUCTOR\"}"
```

---

## Login

```bash
curl -X POST http://localhost:9292/api/auth/login \
-H "Content-Type: application/json" \
-d "{\"email\":\"hero@gmail.com\",\"password\":\"1234\"}"
```

---

## Get User

```bash
curl "http://localhost:9292/api/users/by-email?email=hero@gmail.com"
```

---

## Add Course

```bash
curl -X POST http://localhost:9292/api/courses \
-H "Content-Type: application/json" \
-d "{\"title\":\"Python + AI Mastery\",\"category\":\"AI\",\"instructor\":\"Ravi Teja\",\"price\":3499.0,\"duration\":\"35 Hours\",\"level\":\"Beginner\",\"description\":\"Python for AI\",\"imageUrl\":\"https://images.unsplash.com/photo-1526379095098-d400fd0bf935\"}"
```

---

## Enroll

```bash
curl -X POST http://localhost:9292/api/enrollments \
-H "Content-Type: application/json" \
-d "{\"user\":{\"id\":2},\"course\":{\"id\":1}}"
```

---

## My Learning

```bash
curl http://localhost:9292/api/enrollments/my/hero@gmail.com
```

---

## All Enrollments

```bash
curl http://localhost:9292/api/enrollments
```

---

# 🗄️ Database Structure

## Users Table

```text
users
├── id
├── email
├── name
├── password
└── role
```

Roles:

```text
STUDENT
INSTRUCTOR
```

---

## Course Table

```text
course
├── id
├── title
├── description
├── instructor
├── category
├── price
├── duration
├── image_url
└── level
```

---

## Enrollment Table

```text
enrollment
├── id
├── enrolled_at
├── status
├── progress
├── user_id
└── course_id
```

Default status:

```text
ENROLLED
```

Default progress:

```text
15
```

---

# 🖼️ Image URL Handling

The project supports long image URLs.

The `Course` entity uses:

```java
@Column(length = 2000)
private String imageUrl;
```

This allows image URLs up to 2000 characters.

### Recommended Image URL

```text
https://images.unsplash.com/...
```

### Avoid

```text
data:image/...
```

especially extremely large Base64 image data.

---

# ⚠️ H2 Database Note

The default configuration uses an in-memory H2 database:

```properties
spring.datasource.url=jdbc:h2:mem:lmsdb
```

Therefore, database data is removed when the application restarts.

After restarting:

- Users are removed
- Enrollments are removed
- Courses are loaded again by DataLoader

---

# 💾 Persistent H2 Database

If you want H2 data to remain after restarting the application, use:

```properties
server.port=9292

spring.datasource.url=jdbc:h2:file:./data/lmsdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

# 📸 Screenshots

## 1. Authentication – Student

![Authentication](./screenshots/01-auth-student.png)

---

## 2. Courses Dashboard – 3 Courses Live

![Courses Dashboard](./screenshots/02-courses-3-live.png)

---

## 3. Enrollment Successfully

![Enrollment Success](./screenshots/03-enrolled-success-toast.png)

---

## 4. My Learning Drawer – 1 Course

![My Learning](./screenshots/04-my-learning-drawer-1-course.png)

---

## 5. Java Filter

![Java Filter](./screenshots/05-filter-java.png)

---

## 6. Frontend Filter

![Frontend Filter](./screenshots/06-filter-frontend.png)

---

## 7. DevOps Filter

![DevOps Filter](./screenshots/07-filter-devops.png)

---

## 8. Java Search

![Java Search](./screenshots/08-search-java.png)

---

## 9. Instructor Add Course Modal

![Add Course Modal](./screenshots/09-add-course-modal.png)

---

## 10. Long Image URL Issue

![Long Image URL](./screenshots/10-add-course-fail-long-url.png)

---

## 11. Five Courses After Adding Courses

![Five Courses](./screenshots/11-5-courses-after-add.png)

---

## 12. Courses API JSON

![Courses API](./screenshots/12-api-courses-json.png)

---

## 13. Enrollments API JSON

![Enrollments API](./screenshots/13-api-enrollments-json.png)

---

## 14. My Learning Progress

![My Learning Progress](./screenshots/14-my-learning-progress.png)

---

# 🔐 Security Approach

This project intentionally uses a simplified authentication approach for learning purposes.

```text
Spring Security
       |
       v
   permitAll()
       |
       v
Simple Base64 Token
       |
       v
   localStorage
```

Passwords are protected using:

```text
BCrypt
```

Token format:

```text
email:role:timestamp
```

> This authentication implementation is intended for learning and demonstration purposes and is not production-grade security.

---

# 🎯 Learning Outcomes

This project helped practice:

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- REST APIs
- H2 Database
- Entity relationships
- Repository pattern
- Controller layer
- BCrypt
- Spring Security
- Base64 token
- localStorage
- Role-based UI
- Student enrollment
- Instructor course management
- My Learning
- Progress tracking
- Search functionality
- Category filtering
- Responsive frontend
- Toast notifications
- Image URL handling
- Maven
- API testing
- Full Stack Integration

---

# 🚀 Future Enhancements

- Real JWT authentication
- JWT authentication filter
- Authorization Bearer token
- MySQL database
- PostgreSQL database
- Course video player
- Course lessons
- Progress update API
- Course completion
- Certificate generation
- Course ratings
- Course reviews
- Wishlist
- Pagination
- Admin dashboard
- AWS S3 image storage
- React frontend
- Production deployment

---

# 👤 Test Accounts

## STUDENT

```text
Email: hero@gmail.com
Password: 1234
Role: STUDENT
```

Student features:

```text
Enroll
My Learning
Progress
```

---

## INSTRUCTOR

```text
Email: instructor@gmail.com
Password: 1234
Role: INSTRUCTOR
```

Instructor features:

```text
Add Course
Delete Course
Instructor Dashboard
```

> With H2 in-memory mode, these accounts need to be registered again after restarting the application.

---

# 📚 Sample Courses

| Course | Price | Level | Duration | Description |
|---|---:|---|---|---|
| Java Full Stack Mastery | ₹2999 | Advanced | 40 Hours | Spring Boot + React + Microservices |
| React 18 + Tailwind Pro | ₹1999 | Beginner | 25 Hours | Modern frontend with hooks |
| AWS DevOps + Docker | ₹3999 | Intermediate | 30 Hours | Deploy Spring Boot apps to AWS |
| Python + AI Mastery | ₹3499 | Beginner | 35 Hours | Python for AI |
| Google Cloud Computing Foundations | ₹3499 | Beginner | 40 Hours | Cloud Computing |

---

# 🎓 Demo Flow

## Student Flow

```text
Register Student
       ↓
Login
       ↓
View Courses
       ↓
Click Enroll Now
       ↓
Enrolled Successfully
       ↓
My Learning
       ↓
View Progress
```

---

## Instructor Flow

```text
Register Instructor
       ↓
Login
       ↓
Open Instructor Dashboard
       ↓
Click Add Course
       ↓
Enter Course Details
       ↓
Add Course
       ↓
Course Added Successfully
       ↓
Course Appears in Course Grid
```

---

# 🏆 Project 69 Completed

```text
╔══════════════════════════════════════════════╗
║              LEARNSPHERE LMS                 ║
║                                              ║
║  Spring Boot + H2 + JPA + Hibernate         ║
║  Spring Security + Vanilla JavaScript       ║
║                                              ║
║  Student Enrollment                          ║
║  Instructor Course Management               ║
║  My Learning + Progress                     ║
║  Search + Filters                            ║
║  REST APIs                                   ║
║  Premium Responsive UI                       ║
║                                              ║
║              PROJECT 69 / 100                ║
╚══════════════════════════════════════════════╝
```

---

# 👨‍💻 Author

## Ravi Teja

**Java Full Stack Developer**

### 100 Java Full Stack Projects Challenge

```text
Project 69 / 100
Tier 7 – Full Stack Integration
LearnSphere – Premium LMS
Bypass Full Stack Track
Single Port: 9292
```

---

# ⭐ GitHub Repository

```text
https://github.com/raviteja-dev950/69-lms-mini
```

If you found this project helpful, please give the repository a ⭐ Star.

---

# 📸 Screenshot Folder

Make sure the GitHub repository has this exact structure:

```text
69-lms-mini/
│
├── README.md
│
└── screenshots/
    ├── 01-auth-student.png
    ├── 02-courses-3-live.png
    ├── 03-enrolled-success-toast.png
    ├── 04-my-learning-drawer-1-course.png
    ├── 05-filter-java.png
    ├── 06-filter-frontend.png
    ├── 07-filter-devops.png
    ├── 08-search-java.png
    ├── 09-add-course-modal.png
    ├── 10-add-course-fail-long-url.png
    ├── 11-5-courses-after-add.png
    ├── 12-api-courses-json.png
    ├── 13-api-enrollments-json.png
    └── 14-my-learning-progress.png
```

**Important:** The screenshot filenames must match the names above exactly.

Pasted markdown.md
File
what is this you are giving i am sharing reference to you follow the same exact readme no more extra adding exactly copy the samestyle for 69 readme 

Yes. I understand now. You want Project 69 README in exactly the same structure, formatting, section order, and style as your Project 68 README—only the Project 69/LearnSphere content should change. No extra sections or rewritten style.

I’ll follow the exact Project 68 pattern, including the same:

Title + badges
Project Overview
Features
Technologies Used table
Project Structure
How to Run
Frontend Logic
Application Flow
API Testing
API Endpoints
Database Note
Screenshots
Learning Outcomes
Future Enhancements
Author
Test Accounts
Support
Repo
Run
Open
Register examples

And I’ll use the actual Project 69 details from your reference, not add my own content.

One important correction

Your Project 69 reference already has the correct screenshot names:

screenshots/01-auth-student.png
screenshots/02-courses-3-live.png
screenshots/03-enrolled-success-toast.png
screenshots/04-my-learning-drawer-1-course.png
screenshots/05-filter-java.png
screenshots/06-filter-frontend.png
screenshots/07-filter-devops.png
screenshots/08-search-java.png
screenshots/09-add-course-modal.png
screenshots/10-add-course-fail-long-url.png
screenshots/11-5-courses-after-add.png
screenshots/12-api-courses-json.png
screenshots/13-api-enrollments-json.png
screenshots/14-my-learning-progress.png

I will not change those names or add anything extra.

demo1-14

Yes — understood. You want the 14 demo screenshots named demo1 through demo14, not the 01-auth-student style.

I will use exactly:

demo1.png
demo2.png
demo3.png
demo4.png
demo5.png
demo6.png
demo7.png
demo8.png
demo9.png
demo10.png
demo11.png
demo12.png
demo13.png
demo14.png

And in the README:

![Demo 1](./screenshots/demo1.png)
![Demo 2](./screenshots/demo2.png)
![Demo 3](./screenshots/demo3.png)
![Demo 4](./screenshots/demo4.png)
![Demo 5](./screenshots/demo5.png)
![Demo 6](./screenshots/demo6.png)
![Demo 7](./screenshots/demo7.png)
![Demo 8](./screenshots/demo8.png)
![Demo 9](./screenshots/demo9.png)
![Demo 10](./screenshots/demo10.png)
![Demo 11](./screenshots/demo11.png)
![Demo 12](./screenshots/demo12.png)
![Demo 13](./screenshots/demo13.png)
![Demo 14](./screenshots/demo14.png)

No extra screenshot names.

yes now give correct readme 

Yes. I now have the exact Project 68 README reference and the Project 69 content. I’m following the same style, section order, wording pattern, and formatting—only changing it to LearnSphere and demo1.png through demo14.png.

Copy everything inside this code block directly into README.md:

# 🎓 Project 69 – LearnSphere – Premium LMS | Spring Boot + H2 + Bypass Full Stack

<p align="left">
<img src="https://img.shields.io/badge/Java-21-E76F00?logo=openjdk&logoColor=white" alt="Java 21">
<img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-6DB33F?logo=springboot&logoColor=white" alt="Spring Boot">
<img src="https://img.shields.io/badge/H2-Database-0040C0?logo=h2&logoColor=white" alt="H2">
<img src="https://img.shields.io/badge/Security-Bypass_permitAll-7C3AED" alt="Bypass">
<img src="https://img.shields.io/badge/Frontend-Single_HTML_Vanilla_JS-000000?logo=html5&logoColor=white" alt="Bypass Static">
<img src="https://img.shields.io/badge/Theme-LearnSphere_Real_App_Gradient-7C3AED" alt="LearnSphere">
<img src="https://img.shields.io/badge/Status-Completed-20B000" alt="Completed">
</p>

## 📖 Project Overview

LearnSphere is Project 69 of Tier 7 – Full Stack Integration, built with Spring Boot 3.2.5, H2 Database, Spring Data JPA, Hibernate, Spring Security (Bypass Mode – permitAll) and Single File Premium Frontend served from `src/main/resources/static/`.

This project uses BYPASS FULL STACK architecture:

- Frontend and Backend run on SAME port 9292 – http://localhost:9292/
- No CORS issues, No separate React build – Single static/index.html with Vanilla JS
- Backend serves frontend directly – Deploy as 1 JAR
- Auth with STUDENT / INSTRUCTOR role selector + Simple Base64 Token + BCrypt
- Login required to Enroll – Role based UI – My Learning Drawer + Progress

Backend provides REST endpoints:

- POST /api/auth/register – Register STUDENT/INSTRUCTOR
- POST /api/auth/login – Login
- GET /api/users/by-email?email= – Get user by email for enrollment FK
- GET /api/courses – List all courses live
- POST /api/courses – Add new course (INSTRUCTOR UI)
- DELETE /api/courses/{id} – Delete course (INSTRUCTOR)
- POST /api/enrollments – Enroll a course (STUDENT)
- GET /api/enrollments – All enrollments JSON
- GET /api/enrollments/my/{email} – My Learning feature

Frontend displays:

- LearnSphere header with gradient logo • Learn without limits hero
- Login / Create Account – Glassmorphism auth card – Role selector STUDENT / INSTRUCTOR
- Search bar + Filters All / Java / Frontend / DevOps / AI
- Premium course cards: image, ₹2999 badge, level badge Advanced/Beginner/Intermediate, title, instructor, category, duration, description, Preview + Enroll Now
- INSTRUCTOR Dashboard – + Add Course violet gradient button – Modal with 8 fields – Add Course to LMS
- STUDENT Dashboard – Enroll Now with green toast Enrolled successfully! – My Learning (1) counter
- My Learning drawer – PROGRESS • Courses • Avg % – Progress bar – Enrolled course card with ENROLLED • 15% + bar
- Role protection – INSTRUCTOR can't enroll – Only STUDENT can enroll toast
- API verification pages – /api/courses and /api/enrollments JSON

## ✨ Features

### 🔐 Authentication – Bypass Simple

- Register with Full Name, Email, Password, Role (STUDENT / INSTRUCTOR) – BCrypt hashed in H2
- Login returns simple Base64 token email:role:timestamp
- Token + role + email stored in localStorage – Auto login on refresh
- On H2 mem restart data is wiped – Need to re-register – Can switch to file H2 for persistence

### 📚 Courses Feed – Real App

- Fetches all courses from H2 via /api/courses
- Premium cards: image, ₹ price badge top-right black, level white pill top-left, title Outfit font, meta instructor • category • duration, description, Preview + Enroll Now dark button
- 3 sample courses auto-added on start via DataLoader – Java Full Stack 2999 Advanced, React 18 1999 Beginner, AWS DevOps 3999 Intermediate
- Filters – All, Java, Frontend, DevOps – Active black pill
- Search – title + category contains – Live filter
- Responsive grid – 3 columns desktop, 1 column mobile
- Status badge – ● 3 courses live green

### ➕ Instructor Dashboard – Add New Course

- Violet gradient + Add Course button – Top right – INSTRUCTOR only – STUDENT hidden
- Modal – Add New Course - Instructor Only – 8 inputs: Title *, Category * (Java, Frontend, DevOps, AI), Instructor Name, Price INR *, Duration, Level (Beginner, Intermediate, Advanced), Description *, Image URL (Unsplash link)
- Add Course to LMS button – Black – Green toast Course added! – Grid grows instantly
- Tested 3 to 5 courses – Python 3499 Beginner, Google Cloud 3499 Beginner – Proves scalability
- ImageUrl column length 2000 – Supports long Unsplash / gstatic URLs – Fix for base64 fail

### 🎒 My Learning – Main Feature

- Top-right My Learning (1) button – Beside All Courses, Java, Frontend, DevOps and Logout
- Drawer slide from right with Close – Fetches via /api/enrollments/my/{email}
- Uses custom query EnrollmentRepository.findByUser_Email(email)
- Progress card – PROGRESS – Courses • Avg % – Gradient bar – Black card
- Each enrollment: thumbnail 46px, title, category • enrolledAt, ENROLLED • 15%, progress bar gradient
- Empty state – 📚 No enrollments yet
- Enrollment creation links user FK – Uses /api/users/by-email?email= to get user id before POST – Progress 15% default – status ENROLLED

### 🛡️ Role Protection

- INSTRUCTOR sees + Add Course – Can add courses – Cannot enroll – Shows toast Only STUDENT can enroll. Logout & login as Student
- STUDENT sees Enroll Now – Can enroll – Toast Enrolled successfully! – Can open My Learning – Counter increments My Learning (1) -> (2)

## 🛠 Technologies Used

| Technology | Version | Purpose |
|---|---|---|
| Java | 21.0.10 | Backend language |
| Spring Boot | 3.2.5 | REST APIs, Embedded Tomcat |
| Spring Data JPA / Hibernate | 6.4.4.Final | ORM – User, Course, Enrollment |
| Spring Security | 6.2.4 | Bypass – permitAll() – No JWT filter |
| H2 Database | 2.2.x | In-memory / file DB – No setup – h2-console enabled |
| PasswordEncoder | BCrypt | Password hashing |
| Frontend | Single static/index.html – Vanilla JS | No React build – Bypass full stack |
| CSS | Pure CSS – Outfit + Inter fonts – Gradient #7C3AED -> #06B6D4 + Dark #0F0F13 | Real App Premium |
| Maven | 3.9+ | Build |

## 📂 Project Structure

```text
69-lms-mini/
│
├── src/main/java/com/lms/
│   ├── Application.java – SpringBoot main + DataLoader Sample courses added!
│   ├── config/
│   │   ├── SecurityConfig.java – Bypass permitAll + BCrypt PasswordEncoder
│   │   └── DataLoader.java – 3 courses auto-add if count==0 – Java, React, AWS
│   ├── security/
│   │   └── JwtUtil.java – Simple Base64 token – No external JJWT lib
│   ├── controller/
│   │   ├── AuthController.java – /api/auth/register, /api/auth/login
│   │   ├── CourseController.java – /api/courses GET, POST, DELETE
│   │   ├── EnrollmentController.java – /api/enrollments POST, GET, /my/{email} GET
│   │   └── UserController.java – /api/users/by-email?email= – For enrollment FK mapping
│   ├── entity/
│   │   ├── User.java – id, name, email(unique), password, role STUDENT/INSTRUCTOR
│   │   ├── Course.java – id, title, description length 1000, instructor, category, price, duration, imageUrl length 2000, level
│   │   └── Enrollment.java – id, enrolledAt LocalDate now, status ENROLLED, progress 15, ManyToOne User, ManyToOne Course
│   ├── repository/
│   │   ├── UserRepository.java – findByEmail(String email)
│   │   ├── CourseRepository.java
│   │   └── EnrollmentRepository.java – findByUser_Email(String email) – My Learning query
│
├── src/main/resources/
│   ├── static/
│   │   └── index.html – Full Real App in ONE file – Auth + Filters + Search + Enroll + My Learning Drawer + Add Course Modal + Toasts
│   └── application.properties – port 9292, H2 mem/file, ddl-auto create, h2-console, show-sql
│
├── screenshots/ – 14 premium images
│   ├── demo1.png
│   ├── demo2.png
│   ├── demo3.png
│   ├── demo4.png
│   ├── demo5.png
│   ├── demo6.png
│   ├── demo7.png
│   ├── demo8.png
│   ├── demo9.png
│   ├── demo10.png
│   ├── demo11.png
│   ├── demo12.png
│   ├── demo13.png
│   └── demo14.png
│
├── pom.xml – spring-boot-starter-web, data-jpa, security, H2
├── .gitignore – target/, data/, .idea/, *.db
└── README.md
```

## ▶ How to Run

### 1. Clone

```bash
git clone https://github.com/raviteja-dev950/69-lms-mini.git
cd 69-lms-mini
```

### 2. Application Properties

Current (in-memory – wipes on restart):

```properties
server.port=9292
spring.datasource.url=jdbc:h2:mem:lmsdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=false
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

For persistence (recommended for demo):

```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:h2:file:./data/lmsdb
```

### 3. Run – Single Command

```bash
mvn clean install -DskipTests
mvn spring-boot:run
```

Open:

- http://localhost:9292/ – Frontend + Backend Same Port – LearnSphere
- http://localhost:9292/api/courses – Courses JSON – 3 to 5 courses
- http://localhost:9292/api/enrollments – Enrollments JSON
- http://localhost:9292/h2-console – H2 console – JDBC URL jdbc:h2:mem:lmsdb – User sa – No password

### 4. Frontend Logic (Inside index.html)

```javascript
// Register
fetch('/api/auth/register', {method:'POST', headers:{'Content-Type':'application/json'}, body: JSON.stringify({name,email,password,role})})

// Login
fetch('/api/auth/login', {method:'POST', body: JSON.stringify({email,password})})

// Load courses
fetch('/api/courses?nocache='+Date.now()).then(r=>r.json()).then(render)

// Add Course – Instructor Only – imageUrl must be short Unsplash, not base64
fetch('/api/courses', {method:'POST', body: JSON.stringify({title,category,instructor,price,duration,level,description,imageUrl})})

// Enroll – Get user id first for FK
let userRes = await fetch('/api/users/by-email?email='+localStorage.getItem("ls_user"));
let user = await userRes.json();
fetch('/api/enrollments', {method:'POST', body: JSON.stringify({user:{id: user.id}, course:{id: courseId})})

// My Learning
fetch('/api/enrollments/my/'+user.email)
```

## 🔄 Application Flow

```text
Browser
 │
 ▼
http://localhost:9292/ – static/index.html – REAL APP
 │
 ├── Auth Box – Login / Create Account – Role STUDENT / INSTRUCTOR – Full Name, Email, Password – Black button
 │   ├── POST /api/auth/register – BCrypt save – Return Base64 token – Save to localStorage ls_user
 │   └── POST /api/auth/login – findByEmail – BCrypt matches – Return token + role
 │
 ├── MainApp – if token exists – LearnSphere header – Search + All Courses / Java / Frontend / DevOps – My Learning (0) + email • Logout + Add Course (Instructor only)
 │   ├── Hero – Learn without limits – Master Java, React, DevOps – 4.9 RATED • 10K+ STUDENTS – ● 3 courses live
 │   ├── Filters – All (active black), Java, Frontend, DevOps – count – 3 courses found
 │   ├── Grid – /api/courses – Cards – Preview + Enroll Now – Enroll -> Toast Enrolled successfully!
 │   ├── STUDENT:
 │   │   ├── Enroll Now -> POST /api/enrollments – Toast Enrolled successfully! – My Learning counter (1)
 │   │   └── My Learning drawer – GET /api/enrollments/my/email – PROGRESS • 1 Courses • 15% Avg – ENROLLED • 15% bar
 │   └── INSTRUCTOR:
 │       ├── + Add Course violet gradient – Modal – 8 fields – Image URL must be Unsplash short, not base64/data:image – POST /api/courses – Course added! – Grid grows to 5
 │       └── Enroll click – Toast Only STUDENT can enroll. Logout & login as Student
 │
 └── Logout – localStorage.clear() – Back to Login
 │
 ▼
Spring Boot 9292 – Single JAR – permitAll
 │
 ▼
H2 – tables: users, course, enrollment – Sample courses added! on start – 3 to 5
```

## 🧪 API Testing

```bash
curl http://localhost:9292/api/courses

curl -X POST http://localhost:9292/api/auth/register -H "Content-Type: application/json" -d "{\"name\":\"Vemula Leela Venkata Ravi Teja\",\"email\":\"hero@gmail.com\",\"password\":\"1234\",\"role\":\"STUDENT\"}"

curl -X POST http://localhost:9292/api/auth/register -H "Content-Type: application/json" -d "{\"name\":\"Ravi Teja\",\"email\":\"instructor@gmail.com\",\"password\":\"1234\",\"role\":\"INSTRUCTOR\"}"

curl -X POST http://localhost:9292/api/auth/login -H "Content-Type: application/json" -d "{\"email\":\"hero@gmail.com\",\"password\":\"1234\"}"

curl "http://localhost:9292/api/users/by-email?email=hero@gmail.com"

curl -X POST http://localhost:9292/api/courses -H "Content-Type: application/json" -d "{\"title\":\"Python + AI Mastery\",\"category\":\"Java\",\"instructor\":\"Ravi Teja\",\"price\":3499.0,\"duration\":\"35 Hours\",\"level\":\"Beginner\",\"description\":\"Python for AI\",\"imageUrl\":\"https://images.unsplash.com/photo-1526379095098-d400fd0bf935\"}"

curl -X POST http://localhost:9292/api/enrollments -H "Content-Type: application/json" -d "{\"user\":{\"id\":2},\"course\":{\"id\":1}}"

curl http://localhost:9292/api/enrollments/my/hero@gmail.com

curl http://localhost:9292/api/enrollments
```

## 📡 API Endpoints

| Method | Endpoint | Access | Purpose |
|---|---|---|---|
| POST | `/api/auth/register` | Public | Create Account – STUDENT/INSTRUCTOR |
| POST | `/api/auth/login` | Public | Login |
| GET | `/api/users/by-email?email=` | Public | Get user id for enrollment FK |
| GET | `/api/courses` | Public | Courses live grid – Real App |
| POST | `/api/courses` | Public | INSTRUCTOR Add New Course – Modal |
| DELETE | `/api/courses/{id}` | Public | INSTRUCTOR Delete |
| POST | `/api/enrollments` | Public | STUDENT Enroll Now |
| GET | `/api/enrollments` | Public | All enrollments |
| GET | `/api/enrollments/my/{email}` | Public | My Learning drawer – Progress |

## 🗄 Database Note – H2

H2 uses GenerationType.IDENTITY – Auto increment – No sequence needed.

### Tables

```text
users – id, email UNIQUE, name, password BCrypt, role STUDENT/INSTRUCTOR

course – id, title, description length 1000, instructor, category, price, duration, image_url length 2000, level – Fix for long gstatic/base64

enrollment – id, enrolled_at LocalDate now, status ENROLLED, progress 15, user_id FK, course_id FK
```

DataLoader adds 3 courses on start if count==0 – Prints Sample courses added!

H2 Console: http://localhost:9292/h2-console – JDBC URL jdbc:h2:mem:lmsdb – User sa

Important: With mem + create, data wiped on restart – User not found after restart – Fix: Re-register or switch to file:./data/lmsdb + update.

### Verified

- /api/courses – 3 to 5 courses JSON – Java, React, AWS, Python, Google Cloud
- /api/enrollments – enrollments with nested course and user – progress 15

## 📸 Screenshots – LearnSphere Real App

### 1. Auth STUDENT – Create Account – STUDENT

![Auth Student](screenshots/demo1.png)

---

### 2. Customer Dashboard – LearnSphere – 3 Courses Live – hero • Logout

![Customer Dashboard](screenshots/demo2.png)

---

### 3. Enrolled Successfully – Green Toast

![Enrollment Success](screenshots/demo3.png)

---

### 4. My Learning Drawer – 1 Courses • 15% Avg

![My Learning Drawer](screenshots/demo4.png)

---

### 5. Filter Java – 1 Course Found

![Filter Java](screenshots/demo5.png)

---

### 6. Filter Frontend – React Only

![Filter Frontend](screenshots/demo6.png)

---

### 7. Filter DevOps – AWS Only

![Filter DevOps](screenshots/demo7.png)

---

### 8. Search Java – Live Search

![Search Java](screenshots/demo8.png)

---

### 9. Add Course Modal – Instructor Only – 8 Fields

![Add Course Modal](screenshots/demo9.png)

---

### 10. Add Course Fail – Long base64 URL – Fixed to 2000 length + Unsplash

![Add Course Fail](screenshots/demo10.png)

---

### 11. 5 Courses After Add – Python + Google Cloud – Violet + Add Course Button

![5 Courses After Add](screenshots/demo11.png)

---

### 12. API /api/courses JSON – 5 Courses

![API Courses](screenshots/demo12.png)

---

### 13. API /api/enrollments JSON – Enrollments with User and Course

![API Enrollments](screenshots/demo13.png)

---

### 14. My Learning Progress – Black Card – Gradient Bar

![My Learning Progress](screenshots/demo14.png)

---

## 🎯 Learning Outcomes

- Bypass Full Stack – Single static/index.html served by Spring Boot on same port 9292 – Single JAR – No CORS – Real App not dummy
- H2 Database – mem vs file – create vs update – DataLoader sample courses – imageUrl length 2000 fix for base64 fail
- Security Bypass – permitAll() – Fast Tier 7
- Simple Token – Base64 email:role:timestamp – localStorage ls_user
- My Learning Feature – findByUser_Email custom query – ManyToOne – Drawer UI + Progress – 15% default – AVG calculation
- Role UI – if INSTRUCTOR shows + Add Course violet else hidden – if STUDENT shows Enroll Now – Toast protection Only STUDENT can enroll
- Real App UI – Outfit + Inter fonts – Gradient #7C3AED -> #06B6D4 + Dark #0F0F13 – Cards with price badge + level pill + hover shadow + Progress black card
- Enrollment FK fix – /api/users/by-email endpoint – user id mapping
- Toast UX – Black pills Enrolled successfully!, Course added!, Role toasts
- Filters + Search – category filter + live search contains – 3 courses found counter
- API verification – /api/courses and /api/enrollments
- Image URL bug fix – base64/data:image too long for VARCHAR(255) – Solution Unsplash short URL + @Column(length=2000)

## 🚀 Future Enhancements

- Add real JWT filter – Authorization Bearer – JJWT lib
- Switch H2 mem to file for persistence – ./data/lmsdb
- Switch H2 to MySQL/PostgreSQL – application-prod.properties
- Add course video player + lessons entity – OneToMany Course -> Lesson
- Add progress update – PUT /api/enrollments/{id}/progress – Complete button
- Add certificate generation after 100% – PDF
- Add rating + review entity
- Add pagination – Pageable – /api/courses?page=0&size=6
- Add wishlist – ManyToMany User <-> Course
- Deploy to Render/Railway – java -jar – Same port 9292
- Add React frontend later – 2 ports – 5173 + 9292
- Add S3 for course images instead of Unsplash URL

## 👨‍💻 Author

### Ravi Teja – Vemula Leela Venkata Ravi Teja

Java Full Stack Developer

100 Java Full Stack Projects Challenge

Project 69 / 100 – Bypass Track – LearnSphere Real App

Tier 7 – Full Stack Integration – Single Port 9292

### Test Accounts

- `hero@gmail.com` – STUDENT
- `instructor@gmail.com` – INSTRUCTOR

## ⭐ Support

If you found this project helpful, give it a ⭐ Star on GitHub!

### Repo

https://github.com/raviteja-dev950/69-lms-mini

### Run

```bash
mvn spring-boot:run
```

Open:

```text
http://localhost:9292/
```

Register STUDENT:

```text
hero@gmail.com -> Enroll Now -> My Learning (1) -> 15% Avg
```

Register INSTRUCTOR:

```text
instructor@gmail.com -> + Add Course -> Python 3499 -> Course added! -> 5 courses live
```

Sample Courses

Java Full Stack Mastery – ₹2999 – Advanced – 40 Hours – Spring Boot + React + Microservices

React 18 + Tailwind Pro – ₹1999 – Beginner – 25 Hours – Modern frontend with hooks

AWS DevOps + Docker – ₹3999 – Intermediate – 30 Hours – Deploy Spring Boot apps to AWS

Python + AI Mastery – ₹3499 – Beginner – 35 Hours – Python for AI (Added via Instructor UI)

Google Cloud Computing Foundations – ₹3499 – Beginner – 40 Hours – Cloud (Added via Instructor UI)

🏨 Project 68 – StayEase.PRO – Premium Booking System | Spring Boot + H2 + Bypass Full Stack

<p align="left"> <img src="https://img.shields.io/badge/Java-21-E76F00?logo=openjdk&logoColor=white" alt="Java 21"> <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-6DB33F?logo=springboot&logoColor=white" alt="Spring Boot"> <img src="https://img.shields.io/badge/H2-Database-0040C0?logo=h2&logoColor=white" alt="H2"> <img src="https://img.shields.io/badge/Security-Bypass_permitAll-F59E0B" alt="Bypass"> <img src="https://img.shields.io/badge/Frontend-Single_HTML_Vanilla_JS-000000?logo=html5&logoColor=white" alt="Bypass Static"> <img src="https://img.shields.io/badge/Theme-StayEase.PRO_Classy_Dark-000000" alt="StayEase.PRO"> <img src="https://img.shields.io/badge/Status-Completed-20B000" alt="Completed"> </p>

📖 Project Overview

StayEase.PRO is Project 68 of Tier 7 – Full Stack Integration, built with Spring Boot 3.2.5, H2 Database, Spring Data JPA, Hibernate, Spring Security (Bypass Mode – permitAll) and Single File Premium Frontend served from src/main/resources/static/.

This project uses BYPASS FULL STACK architecture:

Frontend and Backend run on SAME port 9191 – http://localhost:9191/
No CORS issues, No separate React build – Single static/index.html with Vanilla JS
Backend serves frontend directly – Deploy as 1 JAR
Auth with CUSTOMER / ADMIN role selector + Simple Base64 Token + BCrypt
Login required to see rooms – Role based UI

Backend provides REST endpoints:

POST /api/auth/register – Register CUSTOMER/ADMIN
POST /api/auth/login – Login
GET /api/users/by-email?email= – Get user by email for booking FK
GET /api/rooms – List all luxury stays
POST /api/rooms – Add new property (ADMIN UI)
DELETE /api/rooms/{id} – Delete room (ADMIN)
POST /api/bookings – Book a room (CUSTOMER)
GET /api/bookings – All bookings JSON
GET /api/bookings/my/{email} – My Bookings feature

Frontend displays:

StayEase.PRO header with gold-black luxury branding
Join StayEase / Welcome Back – Glassmorphism dark auth card
Role selector – CUSTOMER / ADMIN
Curated Luxury Stays for Modern Travellers – Hero with gold Luxury gradient
Premium cards: image, ₹2500/night badge, DELUXE • ROOM 101 gold label, guests, amenities, Book Now →
ADMIN Dashboard – Add New Property – dashed gold border – 6 fields – Manage + Delete buttons
CUSTOMER Dashboard – Book Now → with green toast Room 1 Booked Successfully!
My Bookings modal – BOOKING #2 • CONFIRMED – Room 101 - Deluxe – dates – CONFIRMED badge
Role protection – ADMIN can't book - login as CUSTOMER toast
API verification pages – /api/rooms and /api/bookings JSON
✨ Features
🔐 Authentication – Bypass Simple
Register with Full Name, Email, Password, Role (CUSTOMER / ADMIN) – BCrypt hashed in H2
Login returns simple Base64 token email:role
Token + role + email stored in localStorage – Auto login on refresh
On H2 mem restart data is wiped – Need to re-register – Can switch to file H2 for persistence
🏨 Luxury Rooms Feed
Fetches all rooms from H2 via /api/rooms
Premium dark cards: image zoom hover, ₹ price badge top-right, gold type label, suite title, guests + amenities
3 sample rooms auto-added on start via DataLoader – Deluxe 101 2500, Suite 102 4500, Single 103 1500
Responsive grid – 3 columns desktop
➕ Admin Dashboard – Add New Property
Dashed gold border box – Add New Property (ADMIN)
6 inputs: Room No (105), Type (Deluxe), Price (2000), Capacity (4), Amenities (Ac, WiFi, TV, Kitchen), Image URL (Unsplash / iStock)
Add Room button – gold gradient – Green toast Room Added!
After adding, grid grows – Tested 4 rooms, 6 rooms – Proves scalability
Manage button (white) + Delete button (red dark) – ADMIN only
📚 My Bookings – Main Feature
Top-right My Bookings button – white pill – Beside user email and Logout red pill
Modal dark overlay with Close – Fetches via /api/bookings/my/{email}
Uses custom query BookingRepository.findByUser_Email(email)
Each booking card: BOOKING #2 • CONFIRMED gold, Room 101 - Deluxe, 📅 2026-09-10 → 2026-09-12 • 2 • ₹2500, CONFIRMED green badge
Empty state – No bookings yet
Booking creation links user FK – Uses /api/users/by-email?email= to get user id before POST
🛡️ Role Protection
ADMIN sees Add Room form + Manage + Delete – Cannot book – Shows toast ADMIN can't book - login as CUSTOMER
CUSTOMER sees Book Now → – Can book – Toast Room 1 Booked Successfully! – Can open My Bookings
🛠 Technologies Used
Technology	Version	Purpose
Java	21.0.10	Backend language
Spring Boot	3.2.5	REST APIs, Embedded Tomcat
Spring Data JPA / Hibernate	6.4.4.Final	ORM – Room, User, Booking
Spring Security	6.2.4	Bypass – permitAll() – No JWT filter
H2 Database	2.2.x	In-memory / file DB – No setup – h2-console enabled
PasswordEncoder	BCrypt	Password hashing
Frontend	Single static/index.html – Vanilla JS	No React build – Bypass full stack
CSS	Pure CSS – Outfit font – Gold #F59E0B + Black #0A0A0B – Glassmorphism	Premium dark theme
Maven	3.9+	Build
📂 Project Structure
68-booking-system/
│
├── src/main/java/com/booking/
│   ├── Application.java – SpringBoot main + DataLoader Sample rooms added!
│   ├── config/
│   │   └── SecurityConfig.java – Bypass permitAll + BCrypt PasswordEncoder
│   ├── security/
│   │   └── JwtUtil.java – Simple Base64 token – No external JJWT lib
│   ├── controller/
│   │   ├── AuthController.java – /api/auth/register, /api/auth/login
│   │   ├── RoomController.java – /api/rooms GET, POST, DELETE
│   │   ├── BookingController.java – /api/bookings POST, GET, /my/{email} GET, DELETE
│   │   └── UserController.java – /api/users/by-email?email= – For booking FK mapping
│   ├── entity/
│   │   ├── User.java – id, name, email(unique), password, role CUSTOMER/ADMIN
│   │   ├── Room.java – id, roomNumber, type, pricePerNight, capacity, amenities, imageUrl, isAvailable
│   │   └── Booking.java – id, checkIn, checkOut, guests, totalPrice, status CONFIRMED, ManyToOne Room, ManyToOne User
│   ├── repository/
│   │   ├── UserRepository.java – findByEmail(String email)
│   │   ├── RoomRepository.java
│   │   └── BookingRepository.java – findByUser_Email(String email) – My Bookings query
│
├── src/main/resources/
│   ├── static/
│   │   └── index.html – Full App in ONE file – Auth + Customer Rooms + Admin Add + My Bookings Modal + Toasts – Classy Dark
│   └── application.properties – port 9191, H2 mem/file, ddl-auto, h2-console, show-sql
│
├── screenshots/ – 10 premium images
│   ├── 01-auth-customer.png
│   ├── 02-rooms-customer.png
│   ├── 03-booked-success.png
│   ├── 04-my-bookings-modal.png
│   ├── 05-auth-admin.png
│   ├── 06-admin-dashboard-3-rooms.png
│   ├── 07-admin-room-added.png
│   ├── 08-admin-6-rooms.png
│   ├── 09-api-rooms.png
│   └── 10-api-bookings.png
│
├── pom.xml – spring-boot-starter-web, data-jpa, security, H2
├── .gitignore – target/, data/, .idea/, *.db
└── README.md
▶ How to Run
1. Clone
git clone https://github.com/raviteja-dev950/68-booking-system.git
cd 68-booking-system
2. Application Properties

Current (in-memory – wipes on restart):

server.port=9191
spring.datasource.url=jdbc:h2:mem:bookingdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

For persistence (recommended for demo):

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:h2:file:./data/bookingdb
3. Run – Single Command
mvn clean install -DskipTests
mvn spring-boot:run

Open:

http://localhost:9191/ – Frontend + Backend Same Port – StayEase.PRO
http://localhost:9191/api/rooms – Rooms JSON
http://localhost:9191/api/bookings – Bookings JSON
http://localhost:9191/h2-console – H2 console – JDBC URL jdbc:h2:mem – User sa – No password
4. Frontend Logic (Inside index.html)
// Register
fetch('/api/auth/register', {method:'POST', headers:{'Content-Type':'application/json'}, body: JSON.stringify({name,email,password,role})})

// Login
fetch('/api/auth/login', {method:'POST', body: JSON.stringify({email,password})})

// Load rooms
fetch('/api/rooms').then(r=>r.json()).then(renderCards)

// Book – Get user id first for FK
let userRes = await fetch('/api/users/by-email?email='+localStorage.getItem("email"));
let user = await userRes.json();
fetch('/api/bookings', {method:'POST', body: JSON.stringify({room:{id}, user:{id: user.id}, checkIn, checkOut, guests, totalPrice})})

// My Bookings
fetch('/api/bookings/my/'+localStorage.getItem("email"))
🔄 Application Flow
Browser
 │
 ▼
http://localhost:9191/ – static/index.html
 │
 ├── Auth Box – Join StayEase / Welcome Back – Glass card – Name, Role CUSTOMER/ADMIN, Email, Password – Orange button
 │   ├── POST /api/auth/register – BCrypt save – Return Base64 token – Save to localStorage
 │   └── POST /api/auth/login – findByEmail – BCrypt matches – Return token
 │
 ├── MainApp – if token exists – StayEase.PRO header – CUSTOMER or ADMIN badge – My Bookings + Logout
 │   ├── CUSTOMER:
 │   │   ├── Hero – Curated Luxury Stays for Modern Travellers
 │   │   ├── Grid – /api/rooms – Book Now → – POST /api/bookings – Toast Room 1 Booked Successfully!
 │   │   └── My Bookings – GET /api/bookings/my/email – Modal BOOKING #2 CONFIRMED
 │   └── ADMIN:
 │       ├── Add New Property dashed gold box – POST /api/rooms – Room Added! – Grid grows to 6
 │       ├── Cards Manage + Delete – DELETE /api/rooms/{id}
 │       └── Book click – Toast ADMIN can't book - login as CUSTOMER
 │
 └── Logout – localStorage.clear()
 │
 ▼
Spring Boot 9191 – Single JAR – permitAll
 │
 ▼
H2 – tables: users, room, booking – Sample rooms added! on start
🧪 API Testing
curl http://localhost:9191/api/rooms

curl -X POST http://localhost:9191/api/auth/register -H "Content-Type: application/json" -d "{\"name\":\"Vemula Leela Venkata Ravi Teja\",\"email\":\"hero20@gmail.com\",\"password\":\"1234\",\"role\":\"CUSTOMER\"}"

curl -X POST http://localhost:9191/api/auth/register -H "Content-Type: application/json" -d "{\"name\":\"Ravi Teja\",\"email\":\"1234@gmail.com\",\"password\":\"1234\",\"role\":\"ADMIN\"}"

curl -X POST http://localhost:9191/api/auth/login -H "Content-Type: application/json" -d "{\"email\":\"hero20@gmail.com\",\"password\":\"1234\"}"

curl "http://localhost:9191/api/users/by-email?email=hero20@gmail.com"

curl -X POST http://localhost:9191/api/bookings -H "Content-Type: application/json" -d "{\"room\":{\"id\":1},\"user\":{\"id\":2},\"checkIn\":\"2026-09-10\",\"checkOut\":\"2026-09-12\",\"guests\":2,\"totalPrice\":2500.0}"

curl http://localhost:9191/api/bookings/my/hero20@gmail.com

curl http://localhost:9191/api/bookings
📡 API Endpoints
Method	Endpoint	Access	Purpose
POST	/api/auth/register	Public	Join StayEase – CUSTOMER/ADMIN
POST	/api/auth/login	Public	Welcome Back
GET	/api/users/by-email?email=	Public	Get user id for booking FK
GET	/api/rooms	Public	Luxury stays grid
POST	/api/rooms	Public	ADMIN Add New Property
DELETE	/api/rooms/{id}	Public	ADMIN Delete
POST	/api/bookings	Public	CUSTOMER Book Now
GET	/api/bookings	Public	All bookings
GET	/api/bookings/my/{email}	Public	My Bookings modal
🗄 Database Note – H2

H2 uses GenerationType.IDENTITY – Auto increment – No sequence needed.

Tables
users – id, email UNIQUE, name, password BCrypt, role

room – id, room_number, type, price_per_night, capacity, amenities, image_url, is_available

booking – id, check_in, check_out, guests, total_price, status CONFIRMED, room_id FK, user_id FK

DataLoader adds 3 rooms on start if count==0 – Prints Sample rooms added!

H2 Console: http://localhost:9191/h2-console – JDBC URL jdbc:h2:mem – User sa

Important: With mem + create, data wiped on restart – User not found after restart – Fix: Re-register or switch to file:./data/bookingdb + update.

Verified
/api/rooms – 3 to 6 rooms JSON
/api/bookings – bookings with nested room and user
📸 Screenshots – StayEase.PRO Classy Dark
1. Auth CUSTOMER – Join StayEase – CUSTOMER




2. Customer Dashboard – StayEase.PRO – CUSTOMER




3. Booking Success – Green Toast Room 1 Booked Successfully!




4. My Bookings Model – BOOKING #2 • CONFIRMED




5. Auth ADMIN – Join StayEase – ADMIN




6. Admin Dashboard – Add New Property – 3 Rooms




7. Admin Add Room Success – 4 Rooms – Room Added!




8. Admin 6 Rooms – Role Protection




9. API /api/rooms JSON – 6 Rooms




10. API /api/bookings JSON – Bookings with User and Room




🎯 Learning Outcomes
Bypass Full Stack – Single static/index.html served by Spring Boot on same port 9191 – Single JAR – No CORS
H2 Database – mem vs file – create vs update – DataLoader sample rooms
Security Bypass – permitAll() – Fast Tier 7
Simple Token – Base64 email:role – localStorage
My Bookings Feature – findByUser_Email custom query – ManyToOne – Modal UI
Role UI – if ADMIN shows Add + Manage/Delete else Book Now – Toast protection
Classy Dark – Gold #F59E0B + Black #0A0A0B + Glassmorphism + Outfit font + Price badges + Hover
Booking FK fix – /api/users/by-email endpoint
Toast UX – Green pills Room Booked, Room Added
API verification – /api/rooms and /api/bookings
🚀 Future Enhancements
Add real JWT filter – Authorization Bearer
Switch H2 mem to file for persistence
Switch H2 to MySQL/PostgreSQL
Add date picker for checkIn/checkOut
Add payment mock
Add cancel booking DELETE /api/bookings/my/{id}
Add search filter by price, capacity, type
Add pagination
Deploy to Render/Railway – java -jar
Add React frontend later – 2 ports
👨‍💻 Author
Ravi Teja – Vemula Leela Venkata Ravi Teja

Java Full Stack Developer

100 Java Full Stack Projects Challenge

Project 68 / 100 – Bypass Track – StayEase.PRO

Tier 7 – Full Stack Integration – Single Port 9191

Test Accounts
hero20@gmail.com – CUSTOMER
1234@gmail.com – ADMIN
⭐ Support

If you found this project helpful, give it a ⭐ Star on GitHub!

Repo

https://github.com/raviteja-dev950/68-booking-system

Run
mvn spring-boot:run

Open:

http://localhost:9191/

Register CUSTOMER:

hero20@gmail.com -> Book -> My Bookings

Register ADMIN:

1234@gmail.com -> Add Room 105 -> Manage + Delete
Close
