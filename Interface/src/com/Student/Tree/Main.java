package com.Student.Tree;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****DatePalm Tree *****");
        Tree datepalm = new DatePalm();
        datepalm.leaves();
        datepalm.roots();
        System.out.println();

        System.out.println("*****Mustard Tree *****");
        Tree mustard = new Mustard();
        mustard.leaves();
        mustard.roots();
        System.out.println();

        System.out.println("*****Neem Tree *****");
        Tree neem = new Neem();
        neem.leaves();
        neem.roots();
        System.out.println();
    }
}
