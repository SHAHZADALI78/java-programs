package com.Test.Assignment.employee;
import java.util.Scanner;
public class Employee {
    private int employeeFirstNumber;
    private float salaryFirst;

    public void addMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        employeeFirstNumber = input.nextInt();
        System.out.print("Enter Employee Salary: ");
        salaryFirst = input.nextInt();

    }

    public void show() {
        System.out.println("Employee Number: " + employeeFirstNumber);
        System.out.println("Employee Salary: " + salaryFirst);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employee = new Employee[4];

        for (int i = 0; i < employee.length; i++) {
            System.out.println("Enter details for Employees " + (i + 1) + ":");
            employee[i] = new Employee();
            employee[i].addMember();
        }
        System.out.println("Details Of All Employees: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employee[i].show();
        }
    }
}
