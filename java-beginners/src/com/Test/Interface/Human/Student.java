package com.Test.Interface.Human;

public class Student implements Human{
    public System System;

    @Override
    public void talk() {
        System.out.println("Human talk");
    }

    @Override
    public void walk() {
        System.out.println("Human walk");
    }
}
