package com.Test.encapsulation.library;

public class Library {
    private String name;
    private String location;
    private int numberOfBooks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getNumberOfBooks() {
        return this.numberOfBooks;
    }



    public void displayInfo(){
        System.out.println("Library Name: " + this.getName());
        System.out.println("Location: " + this.getLocation());
        System.out.println("Number of Books: " + this.getNumberOfBooks());

    }
}
