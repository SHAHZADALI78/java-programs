package com.Test.abstraction.university;

public class Main {
        public static void main(String[] args) {
            University smiu = new Smiu();
            smiu.setAddress("I.I Chundrigar Road Karachi");
            smiu.display();
            smiu.show();

            University salu = new Salu();
            salu.setAddress("Khair pur Mir's");
            salu.display();
            salu.show();

            University ku = new Ku();
            ku.setAddress("Main University Road Karachi");
            ku.display();
            ku.show();

        }
    }
