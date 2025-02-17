package com.student.string;

public class Methods {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.equals("John doe"));
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(5));
        System.out.println(name.substring(0,6));
        System.out.println(name.contains("Doe"));
        System.out.println(name.indexOf("n"));
        System.out.println(name.trim());
        System.out.println(name.replace('D','d'));
        System.out.println(name.equalsIgnoreCase("John Doe"));



    }
}
