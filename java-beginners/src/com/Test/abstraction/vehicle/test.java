package com.Test.abstraction.vehicle;

public class test {
    public static void main(String[] args) {
        VehicleA bike = new BikeA();
        bike.setName("Honda");
        bike.setModel("CD 70");
        bike.maxSpeed();
        bike.show();

        VehicleA car = new CarA();
        car.setName("Alto");
        car.setModel("2023");
        car.maxSpeed();
        car.show();

        VehicleA truck = new TruckA();
        truck.setName("Hino");
        truck.setModel("2020");
        truck.maxSpeed();
        truck.show();
    }
}
