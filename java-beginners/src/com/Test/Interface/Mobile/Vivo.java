package com.Test.Interface.Mobile;

public class Vivo implements Mobile {
    @Override
    public void call() {
        System.out.println("Vivo Mobile Is Used To Call");
    }

    @Override
    public void battery() {
        System.out.println("Vivo Mobile Has Good Battery");

    }
}
