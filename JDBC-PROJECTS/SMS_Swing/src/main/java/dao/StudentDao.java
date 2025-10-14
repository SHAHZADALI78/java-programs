/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Student;

/**
 *
 * @author HP
 */
public interface StudentDao {
    void addStudent(Student student);
    int deleteStudentBystudentId(int studentId);
    List<Student> getAllStudents();
    public int updateStudent(Student student);

    
}
