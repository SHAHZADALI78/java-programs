/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author HP
 */

public class ReturnBook {
    private int studentId;
    private String bookIban;

    public ReturnBook(int studentId, String bookIban) {
        this.studentId = studentId;
        this.bookIban = bookIban;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getBookIban() {
        return bookIban;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setBookIban(String bookIban) {
        this.bookIban = bookIban;
    }
}