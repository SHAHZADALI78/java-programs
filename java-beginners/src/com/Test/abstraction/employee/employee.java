package com.Test.abstraction.employee;

public abstract class employee {
    private String name;
    private String designation;
    private double salary;

    public abstract void jobDescription();

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);

    }
}
