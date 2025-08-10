/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.DepartmentDao;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Department;

/**
 *
 * @author HP
 */
public class DepartmentDaoImpl implements DepartmentDao {
    Connection connection = DatabaseConnection.getDbConnection();
    @Override
    public List<Department> getAllDepartments() {
    List<Department> departments = new ArrayList<>();
    try {
        String query = "Select * From departments"; // ✅ departments table se data
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            departments.add(new Department(rs.getString("name"), rs.getInt("id")));
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    return departments;
    }
}
