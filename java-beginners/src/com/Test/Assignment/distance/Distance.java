package com.Test.Assignment.distance;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance;
        String choice = "";
        System.out.println("1.Inches To Millimeters");
        System.out.println("2.Inches To Centimeters");
        System.out.println("3.Millimeters To Inches");
        System.out.println("4.Millimeters To Centimeters");
        System.out.println("5.Kilometers To Miles");
        System.out.println("6.Kilometers To Centimeters");
        System.out.println(" ");
        System.out.println("Enter your choice: ");
        choice = sc.nextLine();
        System.out.println("Enter your distance: ");
        distance = sc.nextDouble();
        switch (choice) {
            case "1":
                System.out.println("Distance From Inches To Millimeter is: " + distance * 25.4);
                break;
                case "2":
                    System.out.println("Distance From Inches To Centimeters is: " + distance * 2.54);
                    break;
                    case "3":
                        System.out.println("Distance From Millimeter To Inches is: " + distance * 0.039);
                        break;
                        case "4":
                            System.out.println("Distance From Millimeter To Centimeters is: " + distance * 0.1);
                            break;
                            case "5":
                                System.out.println("Distance From Kilometers To Miles Is: " + distance *0.62 );
                                break;
                                case "6":
                                    System.out.println("Distance From Kilometers To Centimeters is: " + distance *100000);
                                    break;
                                    default:
                                        System.out.println("Invalid choice");
                                        break;

        }

    }
}
