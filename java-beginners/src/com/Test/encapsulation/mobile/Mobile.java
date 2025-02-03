package com.Test.encapsulation.mobile;

public class Mobile {
    private String modelNumber;
    private String brand;
    private double price;

    // setter
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;

    }
    // getter
    public String getModelNumber() {
        return modelNumber;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println(this.getModelNumber());
        System.out.println(this.getBrand());
        System.out.println(this.getPrice());
    }
}