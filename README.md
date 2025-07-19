# Ellie Restaurant Management System (ERMS)

A full-stack web-based system to manage restaurant operations including menu handling, staff orders, and reporting. This project uses:
- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java Spring Boot
- **Database**: MySQL

---

## 📁 Project Structure
```
erms/
├── frontend/
│   ├── login.html
│   ├── dashboard.html
│   ├── menu_manager.html
│   ├── order_interface.html
│   └── styles.css
├── backend-java/
│   └── src/main/java/com/erms/... (controllers, models, repos)
├── database/
│   └── erms_schema.sql
├── README.md
```

---

## 🚀 Features
- Login for staff/admin via Spring Boot API
- Manage menu items (add/edit/delete)
- Place and track orders
- View recent activity on dashboard

---

## 🧰 Technologies Used
- Java 17 + Spring Boot
- MySQL 8+
- HTML/CSS/JS (Vanilla)
- Git + GitHub

---

## 🛠️ Setup Instructions

### 🗃️ Database Setup
1. Install MySQL
2. Run the SQL file in `database/erms_schema.sql`

### 🖥️ Backend Setup (Java)
```bash
cd backend-java
./mvnw spring-boot:run
```
Then visit: `http://localhost:8080`

### 🌐 Frontend Setup
Just open `frontend/login.html` in your browser.

Or serve all with Live Server / Apache.

---

## 🔌 API Endpoints
| Endpoint                  | Method | Description                     |
|--------------------------|--------|---------------------------------|
| `/api/auth/login`        | POST   | Login user                     |
| `/api/menu`              | GET    | List menu items                |
| `/api/menu`              | POST   | Add menu item                  |
| `/api/orders`            | GET    | List all orders                |
| `/api/orders`            | POST   | Place a new order              |
| `/api/orders/{id}/status`| PUT    | Update status of an order      |

---

## 🔐 Default Credentials
- **Admin:** `admin / admin@123`

---

## 📦 Deployment Notes
- Frontend can be hosted via GitHub Pages (static)
- Backend can be deployed on Render / Railway / Heroku (Java + MySQL)

---

## 📄 License
MIT License

---

> Developed for Ellie Restaurant – July 2025
