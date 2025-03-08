package com.Test.Collection.book;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<BOOK'S INFORMATION>>>>>>>>>");
        List<Book> bookList= new ArrayList<>();
        Book book1 = new Book();
        book1.setBookName("The Art Of Computer Programming");
        book1.setBookPrice(1500.0);
        book1.setBookAuthor("Professor Donald Knuth");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setBookName("Clean Code");
        book2.setBookPrice(1400.0);
        book2.setBookAuthor("Robert C.Martin");
        bookList.add(book2);

        Book book3 = new Book();
        book3.setBookName("Improving the Design of Existing Code");
        book3.setBookPrice(1600.0);
        book3.setBookAuthor("Martin Fowler");
        bookList.add(book3);

        Book book4 = new Book();
        book4.setBookName("Introduction to Java");
        book4.setBookPrice(2000.0);
        book4.setBookAuthor("James Gosling");
        bookList.add(book4);

        Book book5 = new Book();
        book5.setBookName("Code Complete (2 Edition)");
        book5.setBookPrice(1300.0);
        book5.setBookAuthor("Steve McConnell");
        bookList.add(book5);

        Book book6 = new Book();
        book6.setBookName("Artificial Intelligence");
        book6.setBookPrice(1700.0);
        book6.setBookAuthor("Stuart Russell");
        bookList.add(book6);

        Book book7 = new Book();
        book7.setBookName("Objective Computer Awareness");
        book7.setBookPrice(1400.0);
        book7.setBookAuthor("Arihant Experts");
        bookList.add(book7);

        Book book8 = new Book();
        book8.setBookName("Computer Networks");
        book8.setBookPrice(1250.00);
        book8.setBookAuthor("Andrew S. Tanenbaum");
        bookList.add(book8);

        Book book9 = new Book();
        book9.setBookName("Computer Basics and C Programming");
        book9.setBookPrice(2100.0);
        book9.setBookAuthor("Rajaraman V");
        bookList.add(book9);

        Book book10 = new Book();
        book10.setBookName(" The Mythical Man-month");
        book10.setBookPrice(1000.0);
        book10.setBookAuthor("Frederick Brooks");
        bookList.add(book10);

        for (int i = 0; i<bookList.size(); i++){
            Book book = bookList.get(i);
            System.out.println(book);
            System.out.println();
        }
    }
}
