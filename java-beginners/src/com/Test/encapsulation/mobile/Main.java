package com.Test.encapsulation.mobile;

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setModelNumber("y15");
        m.setBrand("vivo");
        m.setPrice(20000);
        m.display();

        Mobile m2 = new Mobile();
        m2.setModelNumber("A16");
        m2.setBrand("oppo");
        m2.setPrice(30000);
        m2.display();
        System.out.println(m.getModelNumber());
        System.out.println(m.getBrand());
        System.out.println(m.getPrice());
    }
}
