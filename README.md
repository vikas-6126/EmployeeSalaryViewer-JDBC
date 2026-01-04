# EmployeeSalaryViewer-JDBC
A Java console application using JDBC and MySQL to retrieve and display employee salary details by employee ID. Demonstrates parameterized SELECT queries, secure database connectivity with PreparedStatement, and ResultSet processing (getInt(), getString(), getDouble()) with proper handling of “record not found” cases in a modular DAO structure.

# Employee Salary Viewer (Java + JDBC)

## Overview
A Java console application that connects to a MySQL database using JDBC.  
It allows users to retrieve and display the salary of an employee by entering their employee ID. The project demonstrates parameterized `SELECT` queries, `PreparedStatement` usage, and `ResultSet` processing with proper handling of missing records.

---

## Objectives
- Retrieve employee salary using employee ID.
- Demonstrate `SELECT` queries with JDBC.
- Use `PreparedStatement` for safe parameterized queries.
- Process results with `ResultSet` (`getInt()`, `getDouble()`, `getString()`).
- Handle "record not found" cases gracefully.

---

## Tech Stack
- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J (JDBC driver)

---

## Project Structure
EmployeeSalaryViewer/ │ ├── src/com/employee/viewer/ │   ├── Employee.java         # Model class │   ├── EmployeeDAO.java      # Handles SELECT queries │   ├── DBConnection.java     # Utility for DB connection │   └── Main.java             # Console entry point │ ├── sql/employees_table.sql   # SQL script to create DB & table └── README.md                 # Documentation


---

## Database Setup
Run this SQL script before starting the program:

```sql
CREATE DATABASE employeedb;

USE employeedb;

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE
);

-- Sample data
INSERT INTO employees VALUES (101, 'Vikas', 45000.00);
INSERT INTO employees VALUES (102, 'Tharsan', 52000.00);

How to Run
- Clone the repo:
git clone https://github.com/your-username/EmployeeSalaryViewer.git
- Add the MySQL JDBC driver (mysql-connector-j-x.x.x.jar) to your classpath.
- Update DBConnection.java with your MySQL username and password.
- Compile and run:
javac src/com/employee/viewer/*.java
java com.employee.viewer.Main



Sample Output
=== Employee Salary Viewer ===
Enter Employee ID: 101
Employee Name: Vikas
Salary: ₹45000.0


If the record doesn’t exist:
=== Employee Salary Viewer ===
Enter Employee ID: 999
❌ Employee not found.





