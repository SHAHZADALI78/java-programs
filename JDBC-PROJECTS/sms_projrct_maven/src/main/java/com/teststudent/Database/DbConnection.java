package com.teststudent.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getDbConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student_management_system_maven_update";
        String username = "root";
        String password = "USER@786";
        try {
            return DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
