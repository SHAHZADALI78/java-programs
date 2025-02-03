package com.Test.abstraction.vehicle;

public abstract class VehicleA {
    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void maxSpeed();

    public void show(){
        System.out.println("Name : " + this.name);
        System.out.println("Model : " + this.model);
    }
}
