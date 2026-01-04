package com.employee.viewer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        System.out.println("=== Employee Salary Viewer ===");
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        Employee emp = dao.getEmployeeById(empId);

        if (emp != null) {
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Salary: ₹" + emp.getSalary());
        } else {
            System.out.println("❌ Employee not found.");
        }

        sc.close();
    }
}