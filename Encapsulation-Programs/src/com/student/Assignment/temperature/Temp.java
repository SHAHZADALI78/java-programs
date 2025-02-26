package com.student.Assignment.temperature;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = sc.nextDouble();
        double celsiusToFahrenheit = celsius * 9/5+ 32;
        System.out.println("Temperature From Celsius To Fahrenheit Is: " + celsiusToFahrenheit);
        System.out.print("Enter temperature in degrees Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        //double celsiusFahrenheit = celsius * 9 / 5 + 32;
        double fahrenheitToCelsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature From Fahrenheit To Celsius Is: " + fahrenheitToCelsius);

    }
}