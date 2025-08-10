/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import dao.DepartmentsDao;
import database.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Departments;

public class DepartmentDaoImpl implements DepartmentsDao { 
    Connection connection = DbConnection.getDbConnection();

    @Override
    public List<Departments> getalldepartments() {
        List<Departments> departments = new ArrayList<>();
        try {
            String query = "select * from departments";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                departments.add(new Departments(rs.getInt("id"), rs.getString("name")));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return departments;
    }   
}