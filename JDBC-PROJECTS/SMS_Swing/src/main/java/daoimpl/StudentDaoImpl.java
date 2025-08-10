/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.StudentDao;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author HP
 */
public class StudentDaoImpl implements StudentDao {

    @Override
public void addStudent(Student student) {
    String sql = "Insert Into students (name, roll_Number, age, course, department) values (?, ?, ?, ?, ?)";
    
    try (Connection con = DatabaseConnection.getDbConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, student.getName());
        ps.setString(2, student.getRollNumber());
        ps.setInt(3, student.getAge());
        ps.setString(4, student.getCourse());
        ps.setString(5, student.getDept());
        
        ps.executeUpdate();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    @Override
    public void deleteStudentByRollNumber(String rollNumber) {
        Connection connection = DatabaseConnection.getDbConnection();
        try {
            String query = "Delete From Students Where roll_Number = '"+rollNumber+"' ";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public void updateStudent(String rollNumber, Student updatedStudent) {
    Connection connection = DatabaseConnection.getDbConnection();
    try {
        String query = "Update students Set name = '" + updatedStudent.getName() +
                       "', roll_Number = '" + updatedStudent.getRollNumber() +
                       "', age = " + updatedStudent.getAge() +
                       ", course = '" + updatedStudent.getCourse() +
                       "', department = '" + updatedStudent.getDept() +
                       "' where roll_Number = '" + rollNumber + "'";
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    } catch (SQLException e) {
        e.printStackTrace(); // For debugging
    }
}


    @Override
    public List<Student> getAllStudents() {
    List<Student> students = new ArrayList<>();
    Connection connection = DatabaseConnection.getDbConnection();
    try {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("Select * From Students");
        while (rs.next()) {
            Student student = new Student(
                rs.getString("name"),
                rs.getString("roll_Number"),
                rs.getInt("age"),
                rs.getString("course"),
                rs.getString("Department")
            );
            students.add(student);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Error check karne ke liye
    }
    return students; // List return karo
}
}