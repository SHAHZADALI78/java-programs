package com.Test.Assignment.TimeConversion;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        int sec;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        sec = input.nextInt();
        //input.close();
        int hour = sec / 3600;
        int min = sec % 3600 / 60;
        int secs = sec % 60;
        System.out.println(hour + ":" + min + ":" + secs);

    }
}
