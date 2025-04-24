package com.Test.FileHandling.LMSProject;

public class Book {
    public int bookId;
    public String bookName;
    public String bookIsbn;
    public String bookAuthor;
    public int bookQuantity;

    public Book(String bookName, int bookId, String bookIsbn, String bookAuthor, int bookQuantity) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
    }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getBookIsbn() { return bookIsbn; }
    public void setBookIsbn(String bookIsbn) { this.bookIsbn = bookIsbn; }

    public String getBookAuthor() { return bookAuthor; }
    public void setBookAuthor(String bookAuthor) { this.bookAuthor = bookAuthor; }

    public int getBookQuantity() { return bookQuantity; }
    public void setBookQuantity(int bookQuantity) { this.bookQuantity = bookQuantity; }

    public void showBookDetails() {
        System.out.println(bookName + "     " + bookId + "     " + bookIsbn + "     " + bookAuthor + "     " + bookQuantity);
    }
}
