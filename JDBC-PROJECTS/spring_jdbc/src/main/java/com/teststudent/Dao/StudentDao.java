package com.teststudent.Dao;

import com.teststudent.Model.Student;

public interface StudentDao {
    boolean addStudent(Student student);
    boolean deleteStudent(String rollNumber);
    boolean updateStudent(String rollNumber, String name, int age, String dept);
    void showAllStudents();
}
