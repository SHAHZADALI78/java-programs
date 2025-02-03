package com.Test.abstraction.human;
    public class Main {
        public static void main(String[] args) {
            Human teacher = new Teacher();
            System.out.println("Teacher Information");
            teacher.setName("Rahim");
            teacher.setAge(25);
            teacher.displayInfo();
            teacher.job();
            System.out.println();

            Human doctor = new Doctor();
            System.out.println("Doctor Information");
            doctor.setName("Lal");
            doctor.setAge(40);
            doctor.displayInfo();
            doctor.job();
            System.out.println();

            Human engineer = new Engineer();
            System.out.println("Engineer Information");
            engineer.setName("Abbas");
            engineer.setAge(25);
            engineer.displayInfo();
            engineer.job();
        }
    }
