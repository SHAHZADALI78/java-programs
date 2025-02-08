package com.Student.Laptop;

public class Thinkpad implements Laptop {
    @Override
    public void display() {
        System.out.println("display of Thinkpad");
    }

    @Override
    public void Hardware() {
        System.out.println("Thinkpad Laptop Has Hardware");

    }
}
