package com.Test.Assignment.Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;
        while (continueCalculation) {
            System.out.println("1) Addition, 2) Subtraction, 3) Multiplication, 4) Division");
            System.out.println("Enter The Num1");
            int num1 = sc.nextInt();
            System.out.println("Enter The Num2");
            int num2 = sc.nextInt();

            System.out.println("Enter the choice: ");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("Addition is: " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("Subtraction is: " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("Multiplication is: " + (num1 * num2));
                    break;
                case "4":
                    System.out.println("Division is: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
            System.out.println("Do you want to continue? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("n")) {
                continueCalculation = false;
            }
        }
    }
}
