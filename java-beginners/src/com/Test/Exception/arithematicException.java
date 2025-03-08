package com.Test.Exception;

public class arithematicException {
    public static void main(String[] args) {
        try {
            int num1 = 20;
            int num2 = 0;
            System.out.println("Addition:" + (num1 + num2));
            System.out.println("Division:" + (num1 / num2));
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception" + e.getMessage());
        }
        int array[] = {1, 2, 3, 4};
        String str = "Hello";
        System.out.println("Value at index 5: " +array[3]);
        System.out.println("Value at index 5: "+str.charAt(3));

        System.out.println("      <<<<<<<<<Arithematic Exception>>>>>>>>>");
        try {
            int num1 = 0;
            int num2 = 0;
            System.out.println("Addition:" + (num1 + num2));
            System.out.println("Division:" + (num1 / num2));
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception" + e.getMessage());
        }
        String str2 = "Hello";
        System.out.println("Value at index 5: " +str2.charAt(2));

    }

}
