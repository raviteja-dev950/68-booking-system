# 🏨 StayEase.PRO

### Premium Booking System | Spring Boot + H2 + Bypass Full Stack

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-E76F00?logo=openjdk&logoColor=white">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-6DB33F?logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/H2-Database-0040C0?logo=h2&logoColor=white">
  <img src="https://img.shields.io/badge/Security-Bypass_permitAll-F59E0B">
  <img src="https://img.shields.io/badge/Frontend-Vanilla_JS-000000?logo=javascript&logoColor=white">
  <img src="https://img.shields.io/badge/Status-Completed-20B000">
</p>

<p align="center">
  <b>Project 68 / 100</b> •
  <b>Tier 7 – Full Stack Integration</b> •
  <b>Single Port Architecture</b>
</p>

---

## 📖 Project Overview

**StayEase.PRO** is Project 68 of the **100 Java Full Stack Projects Challenge**.

It is a premium hotel and room booking application built using:

- ☕ Java 21
- 🌱 Spring Boot 3.2.5
- 🗄️ H2 Database
- 🔗 Spring Data JPA
- 🧩 Hibernate
- 🔐 Spring Security
- 🎨 Vanilla JavaScript
- 🖥️ Single HTML Frontend
- 💎 Premium Classy Dark UI

The application follows a **BYPASS FULL STACK architecture** where the frontend and backend run together on the **same port**.

---

# 🚀 Bypass Full Stack Architecture

```text
                    🌐 Browser
                        │
                        ▼
              http://localhost:9191/
                        │
                        ▼
              ┌───────────────────┐
              │   index.html      │
              │   Vanilla JS      │
              │   Premium UI      │
              └─────────┬─────────┘
                        │
                        ▼
              ┌───────────────────┐
              │   Spring Boot     │
              │      9191         │
              └─────────┬─────────┘
                        │
              ┌─────────┴─────────┐
              │                   │
              ▼                   ▼
       REST Controllers       Spring Data JPA
                                  │
                                  ▼
                            ┌───────────┐
                            │    H2     │
                            │ Database  │
                            └───────────┘
```

### ✨ Architecture Highlights

| Feature | Implementation |
|---|---|
| 🌐 Frontend | Single `index.html` |
| ⚙️ Backend | Spring Boot |
| 🔌 Port | `9191` |
| 🎨 UI | Vanilla JavaScript + CSS |
| 🔐 Security | `permitAll()` Bypass |
| 🗄️ Database | H2 |
| 🌍 CORS | Not required |
| 📦 Deployment | Single JAR |
| ⚛️ React | Not required |
| 🔑 Token | Simple Base64 |
| 🔒 Password | BCrypt |

---

# ✨ Main Features

## 🔐 Authentication – Bypass Simple

StayEase.PRO provides a simple authentication system with two roles:

```text
CUSTOMER
ADMIN
```

### Customer

- Register
- Login
- View luxury rooms
- Book rooms
- View My Bookings
- Logout

### Admin

- Register
- Login
- Add new properties
- Manage rooms
- Delete rooms
- View rooms
- Role-protected booking action

### Authentication Flow

```text
Register
   │
   ▼
BCrypt Password Hash
   │
   ▼
H2 Database
   │
   ▼
Login
   │
   ▼
Base64 Token
   │
   ▼
localStorage
   │
   ▼
Auto Login
```

---

# 🏨 Luxury Rooms Feed

All rooms are loaded from H2 through:

```text
GET /api/rooms
```

Each premium room card contains:

- 🖼️ Room image
- 💰 Price badge
- 🏷️ Room type
- 🛏️ Room number
- 👥 Guest capacity
- 🛠️ Amenities
- 📖 Description
- ➡️ Book Now button

### Sample Rooms

| Room | Type | Price |
|---|---|---:|
| 101 | Deluxe | ₹2500 |
| 102 | Suite | ₹4500 |
| 103 | Single | ₹1500 |

The rooms are automatically inserted through `DataLoader`.

---

# ➕ Admin Dashboard – Add New Property

ADMIN users can add new rooms through the dashboard.

### Room Fields

```text
Room Number
Type
Price
Capacity
Amenities
Image URL
```

Example:

```text
Room No: 105
Type: Deluxe
Price: ₹2000
Capacity: 4
Amenities: AC, WiFi, TV, Kitchen
Image URL: Unsplash / iStock
```

After adding:

```text
3 Rooms
   ↓
Add Room
   ↓
4 Rooms
   ↓
Add More
   ↓
6 Rooms
```

ADMIN also receives:

```text
Manage
Delete
```

buttons on room cards.

---

# 📚 My Bookings

The **My Bookings** feature allows customers to view their booking history.

The frontend calls:

```text
GET /api/bookings/my/{email}
```

The backend uses:

```text
BookingRepository.findByUser_Email(email)
```

### Booking Card

```text
BOOKING #2 • CONFIRMED

Room 101 - Deluxe

📅 2026-09-10 → 2026-09-12
👥 2 Guests
💰 ₹2500

✓ CONFIRMED
```

### Booking Flow

```text
Customer Login
      │
      ▼
Select Room
      │
      ▼
Get User ID
      │
      ▼
POST /api/bookings
      │
      ▼
Booking Saved
      │
      ▼
My Bookings
      │
      ▼
Booking Modal
```

---

# 🛡️ Role Protection

StayEase.PRO provides role-based UI protection.

### CUSTOMER

```text
✓ View Rooms
✓ Book Room
✓ My Bookings
✓ Logout
```

### ADMIN

```text
✓ View Rooms
✓ Add Property
✓ Manage Rooms
✓ Delete Rooms
✓ Logout
✕ Cannot Book
```

If ADMIN tries to book:

```text
ADMIN can't book - login as CUSTOMER
```

A toast notification is displayed.

---

# 🎨 Premium Classy UI

StayEase.PRO uses a premium luxury hotel design.

### Theme

```text
Background  → #0A0A0B
Accent      → #F59E0B
Text        → White
Font        → Outfit
Style       → Glassmorphism
```

### UI Elements

- ✨ Gold gradients
- 🖤 Luxury dark background
- 💎 Glassmorphism cards
- 🖼️ Premium image cards
- 💰 Gold price badges
- 🏷️ Gold room labels
- 🟢 Success toast
- 🔴 Logout button
- 🪟 Booking modal
- 📱 Responsive layout
- 🔍 Image hover zoom

---

# 🛠️ Technologies Used

| Technology | Version | Purpose |
|---|---|---|
| ☕ Java | 21.0.10 | Backend language |
| 🌱 Spring Boot | 3.2.5 | REST APIs + Embedded Tomcat |
| 🔗 Spring Data JPA | — | Database access |
| 🧩 Hibernate | 6.4.4.Final | ORM |
| 🔐 Spring Security | 6.2.4 | Bypass `permitAll()` |
| 🗄️ H2 Database | 2.2.x | Database |
| 🔒 BCrypt | — | Password hashing |
| 🌐 HTML | — | Frontend |
| ⚡ JavaScript | Vanilla JS | Frontend logic |
| 🎨 CSS | Pure CSS | Premium UI |
| 🔤 Outfit | — | UI font |
| 📦 Maven | 3.9+ | Build tool |

---

# 📂 Project Structure

```text
68-booking-system/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── booking/
│       │           │
│       │           ├── Application.java
│       │           │
│       │           ├── config/
│       │           │   └── SecurityConfig.java
│       │           │
│       │           ├── security/
│       │           │   └── JwtUtil.java
│       │           │
│       │           ├── controller/
│       │           │   ├── AuthController.java
│       │           │   ├── RoomController.java
│       │           │   ├── BookingController.java
│       │           │   └── UserController.java
│       │           │
│       │           ├── entity/
│       │           │   ├── User.java
│       │           │   ├── Room.java
│       │           │   └── Booking.java
│       │           │
│       │           └── repository/
│       │               ├── UserRepository.java
│       │               ├── RoomRepository.java
│       │               └── BookingRepository.java
│       │
│       └── resources/
│           ├── static/
│           │   └── index.html
│           │
│           └── application.properties
│
├── screenshots/
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
├── pom.xml
├── .gitignore
└── README.md
```

---

# ▶️ How to Run

## 1️⃣ Clone Repository

```bash
git clone https://github.com/raviteja-dev950/68-booking-system.git
cd 68-booking-system
```

---

## 2️⃣ Application Properties

### Current – In-Memory H2

```properties
server.port=9191

spring.datasource.url=jdbc:h2:mem:bookingdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

⚠️ **Important**

With the in-memory database, data is removed when the application restarts.

You need to register users again after restarting.

---

## 💾 Persistent H2

For persistence:

```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:h2:file:./data/bookingdb
```

---

# 3️⃣ Run Application

```bash
mvn clean install -DskipTests
mvn spring-boot:run
```

---

# 🌐 Application URLs

| URL | Purpose |
|---|---|
| `http://localhost:9191/` | StayEase.PRO Frontend |
| `http://localhost:9191/api/rooms` | Rooms JSON |
| `http://localhost:9191/api/bookings` | Bookings JSON |
| `http://localhost:9191/h2-console` | H2 Console |

---

# 💻 Frontend Logic

## Register

```javascript
fetch('/api/auth/register', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        name,
        email,
        password,
        role
    })
})
```

## Login

```javascript
fetch('/api/auth/login', {
    method: 'POST',
    body: JSON.stringify({
        email,
        password
    })
})
```

## Load Rooms

```javascript
fetch('/api/rooms')
    .then(r => r.json())
    .then(renderCards)
```

## Get User for Booking

```javascript
let userRes = await fetch(
    '/api/users/by-email?email=' +
    localStorage.getItem("email")
);

let user = await userRes.json();
```

## Create Booking

```javascript
fetch('/api/bookings', {
    method: 'POST',
    body: JSON.stringify({
        room: {
            id
        },
        user: {
            id: user.id
        },
        checkIn,
        checkOut,
        guests,
        totalPrice
    })
})
```

## My Bookings

```javascript
fetch(
    '/api/bookings/my/' +
    localStorage.getItem("email")
)
```

---

# 🔄 Application Flow

```text
                         🌐 Browser
                             │
                             ▼
                  http://localhost:9191/
                             │
                             ▼
                    ┌────────────────┐
                    │  index.html    │
                    │  Vanilla JS    │
                    └───────┬────────┘
                            │
             ┌──────────────┴──────────────┐
             │                             │
             ▼                             ▼
       🔐 Authentication              🏨 Main App
             │                             │
       ┌─────┴─────┐                 ┌─────┴─────┐
       │           │                 │           │
       ▼           ▼                 ▼           ▼
   CUSTOMER      ADMIN           CUSTOMER      ADMIN
       │           │                 │           │
       ▼           ▼                 ▼           ▼
     Book       Add Room          Book Room   Manage
       │        Delete Room          │        Delete
       │                             │
       └──────────────┬──────────────┘
                      │
                      ▼
               Spring Boot 9191
                      │
                      ▼
                 REST APIs
                      │
                      ▼
                   H2 DB
```

---

# 🧪 API Testing

## Get Rooms

```bash
curl http://localhost:9191/api/rooms
```

## Register CUSTOMER

```bash
curl -X POST http://localhost:9191/api/auth/register -H "Content-Type: application/json" -d "{\"name\":\"Vemula Leela Venkata Ravi Teja\",\"email\":\"hero20@gmail.com\",\"password\":\"1234\",\"role\":\"CUSTOMER\"}"
```

## Register ADMIN

```bash
curl -X POST http://localhost:9191/api/auth/register -H "Content-Type: application/json" -d "{\"name\":\"Ravi Teja\",\"email\":\"1234@gmail.com\",\"password\":\"1234\",\"role\":\"ADMIN\"}"
```

## Login

```bash
curl -X POST http://localhost:9191/api/auth/login -H "Content-Type: application/json" -d "{\"email\":\"hero20@gmail.com\",\"password\":\"1234\"}"
```

## Get User

```bash
curl "http://localhost:9191/api/users/by-email?email=hero20@gmail.com"
```

## Create Booking

```bash
curl -X POST http://localhost:9191/api/bookings -H "Content-Type: application/json" -d "{\"room\":{\"id\":1},\"user\":{\"id\":2},\"checkIn\":\"2026-09-10\",\"checkOut\":\"2026-09-12\",\"guests\":2,\"totalPrice\":2500.0}"
```

## My Bookings

```bash
curl http://localhost:9191/api/bookings/my/hero20@gmail.com
```

## All Bookings

```bash
curl http://localhost:9191/api/bookings
```

---

# 📡 API Endpoints

| Method | Endpoint | Access | Purpose |
|---|---|---|---|
| `POST` | `/api/auth/register` | Public | Join StayEase |
| `POST` | `/api/auth/login` | Public | Welcome Back |
| `GET` | `/api/users/by-email?email=` | Public | Get user ID |
| `GET` | `/api/rooms` | Public | Luxury rooms |
| `POST` | `/api/rooms` | Public | Add property |
| `DELETE` | `/api/rooms/{id}` | Public | Delete room |
| `POST` | `/api/bookings` | Public | Book room |
| `GET` | `/api/bookings` | Public | All bookings |
| `GET` | `/api/bookings/my/{email}` | Public | My bookings |

---

# 🗄️ Database – H2

H2 uses:

```text
GenerationType.IDENTITY
```

for automatic ID generation.

### Tables

#### 👤 users

```text
id
email
name
password
role
```

#### 🏨 room

```text
id
room_number
type
price_per_night
capacity
amenities
image_url
is_available
```

#### 📚 booking

```text
id
check_in
check_out
guests
total_price
status
room_id
user_id
```

### Relationships

```text
User
 │
 │ 1
 │
 └─────────── *
             │
          Booking
             │
             │ *
             │
             └────────── 1
                        Room
```

---

# ⚠️ H2 Database Note

Default configuration:

```properties
spring.datasource.url=jdbc:h2:mem:bookingdb
```

This means the database exists only in memory.

When the application restarts:

```text
Users        → Removed
Bookings     → Removed
Rooms        → DataLoader adds again
```

Therefore:

```text
Restart
   ↓
Register again
   ↓
Login
   ↓
Continue Demo
```

For persistence:

```properties
spring.datasource.url=jdbc:h2:file:./data/bookingdb
spring.jpa.hibernate.ddl-auto=update
```

---

# 📸 Screenshots – StayEase.PRO

## 01. 🔐 Customer Authentication

![Auth Customer](screenshots/demo1.png)

---

## 02. 🏨 Customer Dashboard

![Customer Dashboard](screenshots/demo2.png)

---

## 03. ✅ Booking Success

![Booking Success](screenshots/demo3.png)

---

## 04. 📚 My Bookings

![My Bookings](screenshots/demo4.png)

---

## 05. 👑 Admin Authentication

![Auth Admin](screenshots/demo5.png)

---

## 06. 🛠️ Admin Dashboard

![Admin Dashboard](screenshots/demo6.png)

---

## 07. ➕ Room Added Successfully

![Admin Room Added](screenshots/demo7.png)

---

## 08. 🏨 Admin – 6 Rooms

![Admin 6 Rooms](screenshots/demo8.png)

---

## 09. 📡 Rooms API

![API Rooms](screenshots/demo9.png)

---

## 10. 📡 Bookings API

![API Bookings](screenshots/demo10.png)

---

# 🎯 Learning Outcomes

### 🚀 Full Stack Architecture

Single `index.html` served directly by Spring Boot.

```text
Frontend + Backend
       ↓
   Same Port
       ↓
      9191
```

### 🗄️ H2 Database

Learned:

```text
mem vs file
create vs update
DataLoader
JPA
Hibernate
Relationships
```

### 🔐 Security

Implemented:

```text
Spring Security
permitAll()
BCrypt
Simple Base64 Token
```

### 📚 My Bookings

Implemented:

```text
findByUser_Email()
ManyToOne
Foreign Keys
Booking Modal
```

### 🛡️ Role UI

```text
CUSTOMER → Book Now

ADMIN → Add + Manage + Delete
```

### 🎨 Premium UI

```text
Glassmorphism
Gold Gradient
Dark Theme
Price Badges
Hover Effects
Toast Notifications
Responsive Cards
```

### 🔗 API Verification

Verified:

```text
/api/rooms
/api/bookings
/api/users/by-email
/api/auth/register
/api/auth/login
```

---

# 🚀 Future Enhancements

- Add real JWT filter – Authorization Bearer
- Switch H2 mem to file for persistence
- Switch H2 to MySQL/PostgreSQL
- Add date picker for check-in/check-out
- Add payment mock
- Add cancel booking
- Add search filter by price
- Add capacity filter
- Add room type filter
- Add pagination
- Deploy to Render/Railway
- Add React frontend later

---

# 👨‍💻 Author

## Ravi Teja

**Vemula Leela Venkata Ravi Teja**

🎓 Java Full Stack Developer

🚀 100 Java Full Stack Projects Challenge

🏆 **Project 68 / 100**

📚 **Tier 7 – Full Stack Integration**

⚡ **Bypass Full Stack Track**

🏨 **StayEase.PRO**

---

# 🔑 Test Accounts

### 👤 CUSTOMER

```text
Email    : hero20@gmail.com
Password : 1234
Role     : CUSTOMER
```

### 👑 ADMIN

```text
Email    : 1234@gmail.com
Password : 1234
Role     : ADMIN
```

---

# ⭐ Support

If you found this project helpful, give it a ⭐ **Star on GitHub!**

### 📦 Repository

https://github.com/raviteja-dev950/68-booking-system

### ▶️ Run

```bash
mvn spring-boot:run
```

### 🌐 Open

```text
http://localhost:9191/
```

### 👤 CUSTOMER Demo

```text
hero20@gmail.com
      ↓
   Login
      ↓
  Book Room
      ↓
 My Bookings
```

### 👑 ADMIN Demo

```text
1234@gmail.com
      ↓
   Login
      ↓
 Add Room 105
      ↓
 Manage + Delete
```

---

<p align="center">

### 🏨 StayEase.PRO

**Premium Booking Experience**

`Java 21` • `Spring Boot` • `H2` • `JPA` • `Vanilla JS`

**Project 68 / 100 🚀**

</p>
