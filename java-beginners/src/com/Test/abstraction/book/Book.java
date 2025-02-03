package com.Test.abstraction.book;

public abstract class Book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void pages();

    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
    }
}

