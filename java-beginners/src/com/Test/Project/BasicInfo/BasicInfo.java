package com.Test.Project.BasicInfo;
import java.util.*;

public class BasicInfo {
    String name;
    int age;
    String gender;
    String address;
    String phoneNumber;
    String email;


    public BasicInfo(String name, int age, String gender, String address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("-------------------------------");
    }

    public void updateInfo(String name, int age, String gender, String address, String phoneNumber, String email) {
        if (name != null && !name.isEmpty()) this.name = name;
        if (age > 0) this.age = age;
        if (gender != null && !gender.isEmpty()) this.gender = gender;
        if (address != null && !address.isEmpty()) this.address = address;
        if (phoneNumber != null && !phoneNumber.isEmpty()) this.phoneNumber = phoneNumber;
        if (email != null && !email.isEmpty()) this.email = email;
    }
}


