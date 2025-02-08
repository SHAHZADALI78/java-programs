package com.Student.association;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Bike Details*****");
        Engine engine = new Engine();
        engine.setEngineType("Flat-twin Engine");
        Bike bike = new Bike();
        bike.setBikeName("Honda70");
        bike.setEngine(engine.getEngineType());
        System.out.println("Bike Name: " + bike.getBikeName());
        System.out.println("Engine Type: " + bike.getEngine());
        System.out.println();



        System.out.println("*********Human Details*********");
        Heart heart = new Heart();
        heart.setType("Cardiac");
        Human human = new Human();
        human.setName("Ali");
        human.setHeart(heart);
        System.out.println("Human Name: " + human.getName());
        System.out.println("Heart Type: " + human.getHeart().getType());
        System.out.println();

        System.out.println("*********Laptop Details*******");
        HardDrive hardDrive = new HardDrive();
        hardDrive.setPrice(2000d);
        hardDrive.setName("SSD");
        laptop laptop = new laptop();
        laptop.setCompany("Hp");
        laptop.setPrice(35000);
        laptop.setHardDrive(hardDrive);
        System.out.println("HardDrive Name: " + laptop.getHardDrive().getName());
        System.out.println("HardDrive Price: " + laptop.getHardDrive().getPrice());
        System.out.println();

        System.out.println("*********Mobile Details*******");
        Battery battery = new Battery();
        battery.setBatteryType("Platinum");
        battery.setBatteryCapacity(3000);
        Mobile mobile = new Mobile();
        mobile.setMobile("vivo");
        mobile.setPrice(35000);
        mobile.setBattery(battery);
        System.out.println("Mobile Name: " + mobile.getMobile());
        System.out.println("Battery Type: " + mobile.getBattery().getBatteryType());
        System.out.println("Mobile Capacity: " + mobile.getBattery().getBatteryCapacity());





    }
}
