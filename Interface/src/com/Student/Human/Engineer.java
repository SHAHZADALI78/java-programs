package com.Student.Human;

public class Engineer implements Human{
    @Override
    public void talk() {
        System.out.println("Engineer talk");
    }

    @Override
    public void walk() {
        System.out.println("Engineer walk");
    }
}
