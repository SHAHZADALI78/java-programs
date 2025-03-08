package com.Test.Interface.Laptop;

public class Mac implements Laptop {
    @Override
    public void display() {
        System.out.println("display of Mac");
    }

    @Override
    public void Hardware() {
        System.out.println("Mac Laptop Has Hardware");
    }
}
