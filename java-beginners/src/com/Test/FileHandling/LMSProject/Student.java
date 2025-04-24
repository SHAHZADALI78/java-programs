package com.Test.FileHandling.LMSProject;

public class Student {
    private String studentName;
    public String studentId;
    private String studentRollNumber;

    public Student(String studentName, String studentId, String studentRollNumber) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getStudentRollNumber() { return studentRollNumber; }
    public void setStudentRollNumber(String studentRollNumber) { this.studentRollNumber = studentRollNumber; }

    public void showStudentDetails() {
        System.out.println(studentName + "          " + studentId + "           " + studentRollNumber);
    }
}
