package com.Test.Assignment.ScientificCalculator;

import java.util.Scanner;
    public class scientificCalculator {
        public static double asin(double a) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number A: ");
            double b = sc.nextInt();
            //double = StrictMath.asin(b);
            //sin(A) = a;
            return StrictMath.asin(b);
        }

        public double acos(double c) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number B: ");
            double b = sc.nextInt();
            return StrictMath.acos(b);
        }

        public double atan(double d) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number C: ");
            double c = sc.nextInt();
            return StrictMath.atan(c);
        }

        public void CalculateteSumAvgMaxMin(int num) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number A: ");
            int a = sc.nextInt();
            System.out.println("Enter the number B: ");
            int b = sc.nextInt();
            System.out.println("sum(A)");
        }

        public static void main(String [] args){
            scientificCalculator calc = new scientificCalculator();
           // calc.acos(double c);

    }
}
    /*public void menuMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Sin(A)");
        System.out.println("2) Cos(B)");
        System.out.println("3) Tan(c)");
       // System.out.println("4) TanSumAvgMaxMin(A)");
       // System.out.println("Enter your choice: ");
       // String choice = sc.nextLine();
        /*if(choice.equals("1")){
            asin();
        }
        else if(choice.equals("2")){
            acos(double b);
        }
        else if(choice.equals("3")){
            atan(double d)
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
    public static void main(String[] args) {
        scientificCalculator calc = new scientificCalculator();
        calc.menuMethod();



    }*/


