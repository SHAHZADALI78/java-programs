package com.Test.Project.StudentManagementSystem;

public class Department {
        String name;
        String code;


        Department(String name, String code) {
            this.name = name;
            this.code = code;
        }

        void displayInfo() {
            System.out.println("Department Name: " + name);
            System.out.println("Department Code: " + code);
        }
    }
