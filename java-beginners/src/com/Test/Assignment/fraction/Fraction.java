package com.Test.Assignment.fraction;
import java.util.Scanner;

public class Fraction {
    private Scanner sc;

    public Fraction(Scanner sc){
        this.sc = sc;
    }
    //public void numberTaker()
    public void addition(){
        System.out.print("Enter A Number: : ");
        double a = sc.nextInt();
        System.out.print("Enter B Number: : ");
        double b = sc.nextInt();
        System.out.print("Enter C Number: : ");
        double c = sc.nextInt();
        System.out.print("Enter D Number: : ");
        double d = sc.nextInt();
        double add = a/b + c/d;
        System.out.println("Addition: "+add);
    }
    public void subtraction(){
        System.out.print("Enter A Number: ");
        double a = sc.nextInt();
        System.out.print("Enter B Number: ");
        double b = sc.nextInt();
        System.out.print("Enter C Number: ");
        double c = sc.nextInt();
        System.out.print("Enter D Number: ");
        double d = sc.nextInt();
        double sub =  a/b - c/d;
        System.out.println("Subtraction: "+sub);
    }

    public void multiplication(){
        System.out.print("Enter A Number: ");
        double a = sc.nextInt();
        System.out.print("Enter B Number:  ");
        double b = sc.nextInt();
        System.out.print("Enter C Number: ");
        double c = sc.nextInt();
        System.out.print("Enter D Number: ");
        double d = sc.nextInt();
        double mul = a/b * c/d;
        System.out.println("Multiplication: "+mul);
    }
    public void division(){
        System.out.print("Enter A Number: ");
        double a = sc.nextInt();
        System.out.print("Enter B Number: ");
        double b = sc.nextInt();
        System.out.print("Enter C Number: ");
        double c = sc.nextInt();
        System.out.print("Enter D Number: ");
        double d = sc.nextInt();
        double div = a/b + c/d;
        System.out.println("Division: "+div);
    }

    public void calltomenuMethod() {
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Reminder");
        System.out.print(" Enter Your Choice = ");
        String choice = sc.next();
        if(choice.equals("1")) {
            addition();
        }
        else if (choice.equals("2")) {
            subtraction();
        }
        else if (choice.equals("3")) {
            multiplication();
        }
        else if (choice.equals("4")) {
            division();
        } else {
            System.out.println("Kindly Enter The Right Choice Number.");
        }

        System.out.println("Do You Want to Perform another Calculation");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("Y")){
            calltomenuMethod();
        }
        else{
            System.out.println("Thank You");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Fraction f = new Fraction(sc);
        f.calltomenuMethod(); 
    }
}


