package com.Student.Laptop;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Dell Laptop Details*****");
        Laptop dell = new Dell();
        dell.display();
        dell.Hardware();
        System.out.println();

        System.out.println("*****Lenovo Laptop Details*****");
        Laptop lenovo = new Lenovo();
        lenovo.display();
        lenovo.Hardware();
        System.out.println();

        System.out.println("*****Thinkpad Laptop Details*****");
        Laptop thinkpad = new Thinkpad();
        thinkpad.display();
        thinkpad.Hardware();
        System.out.println();

        System.out.println("*****Mac Laptop Details*****");
        Laptop mac = new Mac();
        mac.display();
        mac.Hardware();
        System.out.println();
    }
}
