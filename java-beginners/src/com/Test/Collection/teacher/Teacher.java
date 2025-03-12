package com.Test.Collection.teacher;

public class Teacher {
    private String name;
    private String subject;
    private double salary;
    private String academy;

    Teacher(String name, String subject, double salary, String academy){
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.academy = academy;
    }

    void displayTeacherInfo(){
        System.out.println("Teacher's Name: "+ name);
        System.out.println("Teacher's Subject: "+ subject);
        System.out.println("Teacher's Salary: "+ salary);
        System.out.println("Teacher's Academy: "+ academy);
    }
}
