package com.teststudent.model;

public class IssueBookToStudent {
    private int studentId;
    private String studentName;
    private String rollNumber;
    private String bookIban;

    public IssueBookToStudent(){}

    public IssueBookToStudent(int studentId, String studentName, String rollNumber, String bookIban) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.bookIban = bookIban;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBookIban() {
        return bookIban;
    }

    public void setBookIban(String bookIban) {
        this.bookIban = bookIban;
    }

    @Override
    public String toString() {
        return "IssueBookToStudent{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", bookIban='" + bookIban + '\'' +
                '}';
    }

    public void display() {
        System.out.println(this.toString());
    }
}
