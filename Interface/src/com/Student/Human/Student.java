package com.Student.Human;

public class Student implements Human{
    @Override
    public void talk() {
        System.out.println("Human talk");
    }

    @Override
    public void walk() {
        System.out.println("Human walk");
    }
}
