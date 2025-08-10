/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.CourseDao;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Course;

/**
 *
 * @author HP
 */
public class CourseDaoImpl implements CourseDao {
    Connection connection = DatabaseConnection.getDbConnection();
   
    @Override
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try {
            String query = "Select * From Courses";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
             while (rs.next()) {
                courses.add(new Course(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException e) {
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
