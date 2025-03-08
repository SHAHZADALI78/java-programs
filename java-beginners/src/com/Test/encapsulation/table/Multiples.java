package com.Test.encapsulation.table;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int [] multiples = new int[20];
        for (int i = 0; i < 20; i++) {
            multiples[i] = num*(i +1);

        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiples[i * 10 +j]+ " ");
            }
            System.out.println();
        }

    }
}
