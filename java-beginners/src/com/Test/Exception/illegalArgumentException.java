package com.Test.Exception;

public class illegalArgumentException extends Exception {
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive integer");
        }
        // Set the age
        System.out.println("Age is set to: " + age);
    }

    public static void main(String[] args) {
        try {
            setAge(20); // Valid age
            setAge(-5); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
        int [] array = {1,2,3,4,5};
        int index  = 2;
        System.out.println("Value at index 2 is: " + array[index]);

        System.out.println(" <<<<<<< NumberFormatException >>>>>>>");
        int age = 25;
        System.out.println("Age Is: " + age);
        String str = "john";
        try {
            int number = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Caught an NumberFormatException: " + e.getMessage());
        }

    }
}
