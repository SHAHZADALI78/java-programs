package com.Test.Interface.Mobile;

public class Samsung implements Mobile {
    @Override
    public void call() {
        System.out.println("Samsung Mobile Is Used For Call");
    }

    @Override
    public void battery() {
        System.out.println("Samsung Mobile Has Good Battery Health");

    }
}
