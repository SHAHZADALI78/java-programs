package com.Test.Project;
import java.util.*;
public class Student {
    private String studentName;
    private String studentId;
    private String studentRollNumber;
    //List<Student> studentList = new ArrayList<>();

    Student(String studentName, String studentId, String studentRollNumber){
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(String studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public void showStudentDetails() {
        System.out.println(studentName + "          " + studentId + "           " + studentRollNumber);
    }


}
