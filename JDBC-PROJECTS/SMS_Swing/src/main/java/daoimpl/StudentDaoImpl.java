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
    public int updateStudent(Student student) {
        int rowsUpdated = 0;
    String sql = "Update students Set name=?, roll_Number=?, age=?, course=?, department=? Where studentId=?";
    
    try (Connection conn = DatabaseConnection.getDbConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, student.getName());
        pstmt.setString(2, student.getRollNumber());
        pstmt.setInt(3, student.getAge());
        pstmt.setString(4, student.getCourse());
        pstmt.setString(5, student.getDept());
        pstmt.setInt(6, student.getstudentId());
        
        rowsUpdated = pstmt.executeUpdate();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return rowsUpdated;
    }


    @Override
   public List<Student> getAllStudents() {
    List<Student> students = new ArrayList<>();
    Connection connection = DatabaseConnection.getDbConnection();
    try {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Students");
        while (rs.next()) {
            Student student = new Student(
                rs.getInt("studentId"),  // ID ka column name
                rs.getString("name"),
                rs.getString("roll_Number"),
                rs.getInt("age"),
                rs.getString("course"),
                rs.getString("department")
            );
            students.add(student);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Error check karne ke liye
    }
    return students; // List return karo
}

    @Override
    public int deleteStudentBystudentId(int studentId) {
            int rowsDeleted = 0;
    String sql = "DELETE FROM students WHERE studentId = ?"; // column ka naam apni table ke mutabiq check kar lo

    try (Connection conn = DatabaseConnection.getDbConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, studentId);
        rowsDeleted = pstmt.executeUpdate(); // kitni rows delete hui uska result milega

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return rowsDeleted;
    }
}
