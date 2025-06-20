package com.Test.Collection.student;

public class Student {
        private String name;
        private String rollNumber;
        private int age;
        private String university;

    public Student(int i, String adil, String khi) {
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

    public Student(String name, String rollNumber, int age, String university){
            this.name = name;
            this.rollNumber = rollNumber;
            this.age = age;
            this.university = university;

        }

        void displayStudentInfo(){
            System.out.println("Name: "+name);
            System.out.println("RollNumber: "+rollNumber);
            System.out.println("Age: "+age);
            System.out.println("University: "+university);
        }


    public int getId() {
        return 0;
    }

    public Comparable<Object> getCity() {
        return null;
    }
}
