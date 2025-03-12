package com.Test.Collection.bike;

public class Bike {
    private String modelName;
    private String brand;
    private double price;

    Bike(String modelName, String brand, double price ){
        this.modelName = modelName;
        this.brand = brand;
        this.price = price;
    }

    void displayBikeDetails(){
        System.out.println("Bike Model Name: "+modelName);
        System.out.println("Bike Brand: "+ brand);
        System.out.println("Bike Price: "+ price);

    }
}
