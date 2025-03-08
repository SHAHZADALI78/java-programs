package com.Test.Exception;

public class nullPointerException extends Throwable {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("Value at index 4: " + str.charAt(4));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }
        int num1 = 20;
        int num2 = 10;
        System.out.println("Addition:" + (num1 + num2));
        System.out.println("Division:" + (num1 / num2));

        System.out.println("       <<<<<<<<<nullPointerException Exception>>>>>>>>>");
        try {
            String str1 = null;
            System.out.println("Value at index 5: " + str1.charAt(5));
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }
        int num3 = 10;
        int num4 = 5;
        System.out.println("Subtraction:" + (num3 - num4));
        System.out.println("Addition:" + (num3 + num4));



    }
}
