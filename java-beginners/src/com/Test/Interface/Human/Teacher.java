package com.Test.Interface.Human;

public class Teacher implements Human{
    @Override
    public void talk() {
        System.out.println("Teacher talk");
    }

    @Override
    public void walk() {
        System.out.println("Teacher walk");

    }
}
