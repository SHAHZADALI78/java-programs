package com.teststudent.DaoImpl;

import com.teststudent.Dao.StudentDao;
import com.teststudent.Database.DbConnection;
import com.teststudent.Model.Student;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Component
public class StudentDaoImpl implements StudentDao {

    Connection connection = DbConnection.getDbConnection();

    @Override
    public boolean addStudent(Student student) {
        try {
            Statement statement = connection.createStatement();
            String query = "insert into student (s_name, s_rollNo, s_age, s_dept) values ('"
                    + student.getName() + "','" + student.getRollNumber() + "','" + student.getAge() + "','" + student.getDept() + "')";
            return statement.executeUpdate(query) > 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteStudent(String rollNumber) {
        try {
            Statement statement = connection.createStatement();
            String delete = "delete from student where s_rollNo='" + rollNumber + "'";
            int rows = statement.executeUpdate(delete);
            if (rows > 0) {
                System.out.println("Student deleted successfully");
                return true;
            } else {
                System.out.println("Student not found");
                return false;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateStudent(String rollNumber, String name, int age, String dept) {
        try {
            Statement statement = connection.createStatement();
            String query = "update student set s_name='" + name + "', s_age=" + age + ", s_dept='" + dept + "' where s_rollNo='" + rollNumber + "'";
            int rows = statement.executeUpdate(query);
            return rows > 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showAllStudents() {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("s_name"));
                System.out.println("Roll No: " + rs.getString("s_rollNo"));
                System.out.println("Age: " + rs.getInt("s_age"));
                System.out.println("Department: " + rs.getString("s_dept"));
                System.out.println("------------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
