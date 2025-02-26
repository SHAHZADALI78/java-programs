package com.student.Assignment.ScientificCalculator;

import java.util.Scanner;

public class scientificCalculator {
    public void Calculatesin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        int a = sc.nextInt();
        //sin(A) = a;
        System.out.println("sin(A)");
    }
    public void Calculatecos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number B: ");
        int b = sc.nextInt();
        System.out.println("cos(B)");
    }
    public void Calculatetan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number C: ");
        int b = sc.nextInt();
        System.out.println("tan(C)");
    }
    public void CalculateteSumAvgMaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        int a = sc.nextInt();
        System.out.println("Enter the number B: ");
        int b = sc.nextInt();
        System.out.println("sum(A)");
    }
    public void menuMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Sin(A)");
        System.out.println("2) Cos(B)");
        System.out.println("3) Tan(c)");
       // System.out.println("4) TanSumAvgMaxMin(A)");
        System.out.println("Enter your choice: ");
        String choice = sc.nextLine();
        if(choice.equals("1")){
            Calculatesin();
        }
        else if(choice.equals("2")){
            Calculatecos();
        }
        else if(choice.equals("3")){
            Calculatetan();
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
    public static void main(String[] args) {
        scientificCalculator calc = new scientificCalculator();
        calc.menuMethod();



    }


}
