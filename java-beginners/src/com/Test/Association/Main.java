package com.Test.Association;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setEngineType("Flat-twin Engine");
        Bike bike = new Bike();
        bike.setBikeName("Honda70");
        bike.setEngine(engine.getEngineType());
        System.out.println("*****Bike Details*****");
        System.out.println("Bike Name: " + bike.getBikeName());
        System.out.println("Engine Type: " + bike.getEngine().getBytes().length);
        System.out.println();


        Heart heart = new Heart();
        heart.setType("Cardiac");
        Human human = new Human();
        human.setName("John");
        //human.setBlood(heart);
        System.out.println("*********Human Details*********");
        System.out.println("Human Name: " + human.getName());
        System.out.println("Heart Type: " + human.getHeart().getType());
        System.out.println();


        laptop l = new laptop();
        l.setCompany("Hp");
        l.setPrice(35000);


        HardDrive hd = new HardDrive();
        hd.setName("");



    }
}
