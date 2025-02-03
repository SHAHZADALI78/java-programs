package com.Test.abstraction.employee;

public class testA {
    public static void main(String[] args) {
        System.out.println("Manager Information");
        employee manager = new manager();
        manager.setName("Shahzad Ali");
        manager.setDesignation("manager");
        manager.setSalary(60000);
        manager.displayInfo();
        manager.jobDescription();
        System.out.println();


        System.out.println("Developer Information");
        employee developer = new developer();
        developer.setName("Asad Abbas");
        developer.setDesignation("Developer");
        developer.setSalary(100000);
        developer.displayInfo();
        developer.jobDescription();
        System.out.println();


        System.out.println("Tester Information");
        employee tester = new tester();
        tester.setName("Adil Ali");
        tester.setDesignation("Tester");
        tester.setSalary(50000);
        tester.displayInfo();
        tester.jobDescription();
        System.out.println();

    }
}
