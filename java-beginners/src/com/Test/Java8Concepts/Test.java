package com.Test.Java8Concepts;

public class Test {
    public static void main(String[] args) {
        TestFunctionalInterface testFunctionalInterface = ()->{
            /*System.out.println("Hello Lambda Expression");*/
            System.out.println("Hello Lambda Expression");
            System.out.println("Hello Lambda Expression");
        };

        testFunctionalInterface.show();

        System.out.println("            Add Functional Interface");
        AddFunctionalInterface add = (int a, int b)->System.out.println("The Sum Of a And b Is: " + (a+b));
        add.add(2 ,4);


        System.out.println("           AddReturnFunctionalInterface");
        AddReturnFunctionalInterface result = (int a, int b)->{
            int c = (a+b);
            return (c);
        };
        int sum = result.add(4, 8);
        System.out.println("The Sum Is: " + (sum));


        System.out.println("            Runnable Interface   ");
        Runnable r1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();


    }
}


