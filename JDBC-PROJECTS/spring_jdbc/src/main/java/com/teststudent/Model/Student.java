package com.teststudent.Model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private String rollNumber;
    private int age;
    private String dept;

    public Student() {}

    public Student(String name, String rollNumber, int age, String dept) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
