package com.Test.abstraction.university;

public abstract class University {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void display();

    public void show(){
        System.out.println("Address: " + address);
    }
}
