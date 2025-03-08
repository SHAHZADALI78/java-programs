package com.Test.Collection.mobile;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main (String [] args){
        System.out.println("<<<<<<<<Detail's Of Mobile Phones>>>>>>>>>");
        List<Mobile>mobileList = new ArrayList<>();
        Mobile mobile1 = new Mobile();
        mobile1.setModelName("Vivo V30");
        mobile1.setPrice(50000);
        mobile1.setBrand("VIVO");
        mobileList.add(mobile1);

        Mobile mobile2 = new Mobile();
        mobile2.setModelName("Vivo Y30");
        mobile2.setPrice(30000);
        mobile2.setBrand("VIVO");
        mobileList.add(mobile2);

        Mobile mobile3 = new Mobile();
        mobile3.setModelName("Samsung A50");
        mobile3.setPrice(40000);
        mobile3.setBrand("SAMSUNG");
        mobileList.add(mobile3);

        Mobile mobile4 = new Mobile();
        mobile4.setModelName("Samsung A30");
        mobile4.setPrice(20000);
        mobile4.setBrand("SAMSUNG");
        mobileList.add(mobile4);

        Mobile mobile5 = new Mobile();
        mobile5.setModelName("Infinix Note50");
        mobile5.setPrice(55000);
        mobile5.setBrand("INFINIX");
        mobileList.add(mobile5);

        Mobile mobile6 = new Mobile();
        mobile6.setModelName("Infinix Hot50 Pro");
        mobile6.setPrice(60000);
        mobile6.setBrand("INFINIX");
        mobileList.add(mobile6);

        Mobile mobile7 = new Mobile();
        mobile7.setModelName("Oppo F19Pro");
        mobile7.setPrice(50000);
        mobile7.setBrand("OPPO");
        mobileList.add(mobile7);

        Mobile mobile8 = new Mobile();
        mobile8.setModelName("Oppo Reno12F");
        mobile8.setPrice(62000);
        mobile8.setBrand("OPPO");
        mobileList.add(mobile8);

        Mobile mobile9 = new Mobile();
        mobile9.setModelName("Camon20");
        mobile9.setPrice(50000);
        mobile9.setBrand("TECHNO");
        mobileList.add(mobile9);

        Mobile mobile10 = new Mobile();
        mobile10.setModelName("Vivo Y200");
        mobile10.setPrice(59000);
        mobile10.setBrand("VIVO");
        mobileList.add(mobile10);

        for(int i = 0; i<mobileList.size();i++){
            Mobile mobile  = mobileList.get(i);
            System.out.println(mobile);
            System.out.println(" ");
        }
    }

}
