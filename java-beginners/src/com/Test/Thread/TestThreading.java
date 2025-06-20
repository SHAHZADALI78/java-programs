package com.Test.Thread;

public class TestThreading implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=10; i++){
            System.out.println(i);
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }


    public static void main(String [] args){
        TestThreading testThreading = new TestThreading();
        //testThreading.run();
        Thread thread1 = new Thread(testThreading);
        thread1.start();
        //System.out.println("Thread1 Name: "+thread1.getName());


        Thread thread2 = new Thread(testThreading);
        thread2.start();
       //System.out.println("Thread2 Name: " +thread2.getName());


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i =1; i<=10; i++){
                    System.out.println("2*" + i +" = " + (2*i));
                }


            }
        };
        Thread thread3 = new Thread(runnable);
        thread3.start();

    }
}
