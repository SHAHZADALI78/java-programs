package com.Student.Mobile;

public class Oppo implements Mobile{
    @Override
    public void call() {
        System.out.println("Oppo Mobile Is Used For Call");
    }

    @Override
    public void battery() {
        System.out.println("Oppo Mobile Also Have Good Battery");

    }
}
