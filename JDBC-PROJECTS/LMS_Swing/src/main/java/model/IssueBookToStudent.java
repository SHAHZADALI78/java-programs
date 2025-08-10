/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
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

    
}
