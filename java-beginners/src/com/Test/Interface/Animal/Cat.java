package com.Test.Interface.Animal;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }
}
