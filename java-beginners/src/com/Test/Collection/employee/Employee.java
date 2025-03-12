package com.Test.Collection.employee;

public class Employee {
    private String employeeName;
    private String employeeId;
    private double employeeSalary;

    Employee(String employeeName, String employeeId, double employeeSalary){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    /*void displayEmployeeInfo(){
        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Employee Id: "+ employeeId);
        System.out.println("Employee Salary: "+ employeeSalary);
    }*/
}
