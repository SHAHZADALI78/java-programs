package com.teststudent.model;

public class ReturnBookToStudent {
    private int studentId;
    private String bookIban;

    public ReturnBookToStudent() {

    }

    public ReturnBookToStudent(int studentId, String bookIban) {
        this.studentId = studentId;
        this.bookIban = bookIban;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getBookIban() {
        return bookIban;
    }

    public void setBookIban(String bookIban) {
        this.bookIban = bookIban;
    }

    @Override
    public String toString() {
        return "ReturnBookToStudent{" +
                "studentId=" + studentId +
                ", bookIban='" + bookIban + '\'' +
                '}';
    }

    public void display() {
        System.out.println(this.toString());
    }
}
