# 👨‍💼 Automation Testing Project – OrangeHRM Demo
## 📌 Project Overview
This project involves automated testing of the **OrangeHRM Demo** web application using Selenium WebDriver and Java. The primary goal was to perform **data-driven testing** on login and logout functionalities using multiple sets of user credentials.
## 🧰 Tools & Technologies
- **Selenium WebDriver (Java)**
- **TestNG** – Test execution and assertions
- **Maven** – Build and dependency management
- **Apache POI** – Reading test data from Excel
- **Page Factory (POM)** – Organized page elements and actions
## 🏗️ Framework Design
- Built a **data-driven test framework**
- Utilized **Apache POI** to fetch test data from Excel files
- Used the **Page Factory** pattern to separate page logic from test logic
- Ensured code reusability and maintainability with modular design
## ✅ Test Coverage
Automated the following test scenarios:
- Valid login with multiple credential sets
- Invalid login attempt
- Logout functionality validation
## 📂 Project Structure
OrangeHRM-Automation/
├── src/
│ └── test/
│ ├── java/
│ │ ├── pages/
│ │ ├── tests/
│ │ └── utils/
│ └── ExcelDataReader.java
├── testdata/
│ └── login_credentials.xlsx
├── testng.xml
├── pom.xml
└── README.md
## 👤 Author
**Anjali V.R**  
*QA Automation Engineer*  
