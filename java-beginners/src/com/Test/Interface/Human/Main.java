package com.Test.Interface.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Doctor Details*****");
        Human doctor = new Doctor();
        doctor.talk();
        doctor.walk();
        System.out.println();

        System.out.println("*****Engineer Details*****");
        Human engineer = new Engineer();
        engineer.talk();
        engineer.walk();
        System.out.println();

        System.out.println("*****Student Details*****");
        Human student = new Student();
        student.talk();
        student.walk();
        System.out.println();

        System.out.println("*****Teacher Details*****");
        Human teacher = new Teacher();
        teacher.talk();
        teacher.walk();
        System.out.println();
    }
}
