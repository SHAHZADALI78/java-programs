package com.Student.Human;

public class Doctor implements Human{
    @Override
    public void talk() {
        System.out.println("Doctor talk");
    }

    @Override
    public void walk() {
        System.out.println("Doctor walk");

    }
}
