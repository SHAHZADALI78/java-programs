package com.Test.Collection.bike;

import com.Test.Collection.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args){
        List<Bike> bikeList = new ArrayList<>();
        bikeList.add(new Bike("CD70","Honda",20000));
        bikeList.add(new Bike("SUPERSTAR","CHINA",100000));
        bikeList.add(new Bike("125","Honda",350000));
        bikeList.add(new Bike("100","Honda",20000));
        bikeList.add(new Bike("FJR1300","Yamaha",350000));
        bikeList.add(new Bike("UD100","UNIQUE",120000));
        bikeList.add(new Bike("GS 150SE","SUZUKI",32400));
        bikeList.add(new Bike("UD70","UNIQUE",114000));
        bikeList.add(new Bike("YBR 125","YAMAHA",40000));
        bikeList.add(new Bike("TG 125","TOYO",69000));

        for(int i = 0; i<bikeList.size(); i++){
            Bike bike = bikeList.get(i);
            bike.displayBikeDetails();
            System.out.println();
        }

    }
}
