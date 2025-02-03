package com.Test.abstraction.book;

public class Main {
    public static void main(String[] args) {
        System.out.println("       <<<<<<<<<Poetry Book Details>>>>>>>>");
        Book poetry = new Poetry();
        poetry.setName("Deevan-e-Ghalib");
        poetry.setAuthor("Mirza Ghalib");
        poetry.pages();
        poetry.show();

        System.out.println("       <<<<<<<<<Grammer Book Details>>>>>>>>");
        Book grammer = new Grammer();
        grammer.setName("Practical English Usage");
        grammer.setAuthor("Michael Swan");
        grammer.pages();
        grammer.show();

        System.out.println("      <<<<<<<<<Literature Book Details>>>>>>>>");
        Book literature = new Literature();
        literature.setName("Harry Potter");
        literature.setAuthor("j.k.Rowling");
        literature.pages();
        literature.show();
    }
}
