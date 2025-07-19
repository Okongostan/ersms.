# Ellie Restaurant Management System (ERMS)

The **Ellie Restaurant Management System (ERMS)** is a web-based application designed to streamline restaurant operations such as order management, menu management, and reporting. Built using HTML, CSS, JavaScript, Spring Boot (Java), and MySQL.

---

## 📁 Project Structure
```
ERMS/
├── frontend/         # User interfaces (HTML/CSS/JS)
│   ├── login.html
│   ├── dashboard.html
│   ├── menu_manager.html
│   ├── order_interface.html
│   └── styles.css
├── backend-java/     # Backend logic (Spring Boot)
│   ├── src/main/java/com/erms/... (controllers, models, repos)
│   ├── src/main/resources/application.properties
│   └── pom.xml
├── database/         # Database schema
│   └── erms_schema.sql
├── README.md
```

---

## 🚀 Features
- **User Authentication**: Secure login for staff/admin
- **Menu Management**: Add and manage food items
- **Order Interface**: Staff can place and process orders
- **Role Management**: Admins manage menus; staff place orders
- **Activity Logging**: Track user actions (via `activity_logs`)

---

## 🛠️ Tech Stack
- **Frontend**: HTML, CSS, JavaScript (Vanilla Fetch API)
- **Backend**: Spring Boot (Java)
- **Database**: MySQL
- **Version Control**: Git / GitHub

---

## 🔁 Updated Frontend API Calls (Using Java Backend)

**Login Request Example:**
```javascript
fetch("http://localhost:8080/api/auth/login", {
  method: "POST",
  headers: { "Content-Type": "application/x-www-form-urlencoded" },
  body: new URLSearchParams({ username: "admin", password: "admin@123" })
})
.then(res => res.text())
.then(alert);
```

**Get Menu Items:**
```javascript
fetch("http://localhost:8080/api/menu")
  .then(res => res.json())
  .then(data => console.log(data));
```

**Add Order Example:**
```javascript
fetch("http://localhost:8080/api/orders?userId=1&menuItemId=3&quantity=2", {
  method: "POST"
})
.then(res => res.json())
.then(console.log);
```

> 💡 Make sure the backend server is running at `http://localhost:8080`

---

## 🧱 Installation & Setup
1. **Clone the repository**
```bash
git clone https://github.com/yourusername/erms.git
cd erms
```

2. **Database Setup**
   - Open `phpMyAdmin`
   - Create a database named `erms`
   - Import `database/erms_schema.sql`

3. **Java Backend Setup**
```bash
cd backend-java
./mvnw spring-boot:run
```

4. **Open Frontend**
   - Navigate to `frontend/login.html`

---

## 🔐 Default Admin Login
- **Username**: `admin`
- **Password**: `admin@123`

---

## 🤝 Contributions
Feel free to fork and contribute by submitting pull requests.

---

## 📄 License
MIT License

---

**Author:** [Your Name]  
**Date:** July 2025
