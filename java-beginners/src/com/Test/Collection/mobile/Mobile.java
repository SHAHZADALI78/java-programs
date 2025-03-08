package com.Test.Collection.mobile;

public class Mobile {
    private String modelName;
    private double price;
    private String brand;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
