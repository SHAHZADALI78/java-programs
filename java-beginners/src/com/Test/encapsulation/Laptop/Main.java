package com.Test.encapsulation.Laptop;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********Laptop's Information**********");
        Laptop l = new Laptop();
        l.setBrand("HP");
        l.setModelName("Pro Book");
        l.setPrice(34000);
        l.setRam(8);
        l.displayInfo();
        System.out.println();


        Laptop l2 = new Laptop();
        l2.setBrand("Dell");
        l2.setModelName("Latitude");
        l2.setPrice(33000);
        l2.setRam(4);
        l2.displayInfo();
        System.out.println();


        Laptop l3 = new Laptop();
        l3.setBrand("Acer");
        l3.setModelName("Acer book");
        l3.setPrice(32000);
        l3.setRam(8);
        l3.displayInfo();
        System.out.println();

    }
}
