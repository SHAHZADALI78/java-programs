package com.teststudent.model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String iban;

    public Book(){}
    public Book(int id, String name, String author, String iban) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.iban = iban;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }

    public void display() {
        System.out.println(this.toString());
    }
}
