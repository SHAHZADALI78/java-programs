package com.Test.Collection;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> studentNumber = new HashMap();
        studentNumber.put("Two ", 50);
        studentNumber.put("Three ", 60);
        studentNumber.put("Five ", 70);
        studentNumber.put("Six ", 80);
        studentNumber.put("Seven ", 60);

        for (HashMap.Entry<String, Integer> e : studentNumber.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        Set<String> keys = studentNumber.keySet();
        for(String key : keys){
            System.out.println(key + " " + studentNumber.get(key));
        }
    }
}


