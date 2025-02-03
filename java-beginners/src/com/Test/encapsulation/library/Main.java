package com.Test.encapsulation.library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Libraries Information");
        System.out.println("         School Library");
        Library library = new Library();
        library.setName("School Library");
        library.setLocation("SMIU Model School");
        library.setNumberOfBooks(2000);
        library.displayInfo();
        System.out.println();

        System.out.println("      University Library");
        Library library2 = new Library();
        library2.setName("University Library");
        library2.setLocation("Karachi University");
        library2.setNumberOfBooks(6000);
        library2.displayInfo();
        System.out.println();

        System.out.println("   Public Library");
        Library library1 = new Library();
        library1.setName("Public Library");
        library1.setLocation("Near Mashal Model School");
        library1.setNumberOfBooks(3000);
        library1.displayInfo();
        System.out.println();


    }

}
