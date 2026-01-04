package com.employee.viewer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {

    public Employee getEmployeeById(int empId) {
        String sql = "SELECT * FROM employees WHERE emp_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, empId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Employee(
                    rs.getInt("emp_id"),
                    rs.getString("name"),
                    rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // if not found
    }
}