package com.Test.Interface.Animal;

public class Horse implements Animal{

    @Override
    public void eat() {
        System.out.println("Horse eats");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps");
    }
}
