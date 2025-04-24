package com.Test.FileHandling.LMSProject;

import java.io.*;
import java.util.*;

public class LMS {

    public LMS() {
    }

    public void menuMethod() {
        System.out.println("<<<<<<< WELCOME TO SMIU LIBRARY >>>>>>>>");
        System.out.println("(1): Add Book To Library");
        System.out.println("(2): Issue Book To Student");
        System.out.println("(3): Return Book From Student");
        System.out.println("(4): Show All Books");
        System.out.println("(5): Show All Students");
        System.out.print("Enter Your Choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> addBookToLibrary();
            case 2 -> issueBookToStudent();
            case 3 -> returnBookFromStudent();
            case 4 -> showAllBooks();
            case 5 -> showAllStudents();
            default -> System.out.println("Invalid Choice.");
        }

        System.out.print("Would You Like To Continue Program? (yes/no): ");
        String repeat = sc.next();
        if (repeat.equalsIgnoreCase("yes")) {
            menuMethod();
        } else {
            System.out.println("You Have Done Your Job Very Well");
        }
    }

    public void addBookToLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Book b = new Book(name, id, isbn, author, qty);
        saveBookToFile(b);
        System.out.println("Book saved to file.");

    }

    public void issueBookToStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.print("Enter Student ID: ");
        String id = sc.next();
        System.out.print("Enter Student Roll Number: ");
        String roll = sc.next();
        System.out.print("Enter Book ISBN to issue: ");
        String isbn = sc.next();

        List<Book> books = loadBooksFromFile();
        boolean issued = false;

        for (Book book : books) {
            if (book.getBookIsbn().equalsIgnoreCase(isbn) && book.getBookQuantity() > 0) {
                book.setBookQuantity(book.getBookQuantity() - 1);
                saveStudentToFile(new Student(name, id, roll));
                issued = true;
                break;
            }
        }

        if (issued) {
            updateBookFile(books);
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book not found or out of stock.");
        }
    }

    public void returnBookFromStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String name = sc.next();
        System.out.print("Enter Book ISBN: ");
        String isbn = sc.next();

        List<Book> books = loadBooksFromFile();
        boolean found = false;

        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(name) && book.getBookIsbn().equalsIgnoreCase(isbn)) {
                book.setBookQuantity(book.getBookQuantity() + 1);
                found = true;
                break;
            }
        }

        if (found) {
            updateBookFile(books);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found in records.");
        }
    }

    public void showAllBooks() {
        List<Book> books = loadBooksFromFile();
        System.out.println("BookName     ID     ISBN     Author     Qty" );
        //for(Book b : books){
        for (int i = 0; i<books.size(); i++) {
            System.out.print((i + 1)+ " ");
            books.get(i).showBookDetails();
            //b.showBookDetails();
        }
    }

    public void showAllStudents() {
        List<Student> students = loadStudentsFromFile();
        System.out.println("StudentName     ID     RollNumber");
        for (Student s : students) {
            s.showStudentDetails();
        }
    }

    // ---------------- File Operations ------------------

    public void saveBookToFile(Book b) {
        try (FileWriter fw = new FileWriter("books.txt", true)) {
            fw.write( b.bookName + "," + b.bookId + "," + b.bookIsbn + "," + b.bookAuthor + "," + b.bookQuantity + "\n");
        } catch (IOException e) {
            System.out.println("Failed to write book to file.");
        }
    }

    public void saveStudentToFile(Student s) {
        try (FileWriter fw = new FileWriter("students.txt", true)) {
            fw.write(s.getStudentId() + "," + s.getStudentName() + "," + s.getStudentRollNumber() + "\n");
        } catch (IOException e) {
            System.out.println("Failed to write student to file.");
        }
    }

    public void updateBookFile(List<Book> books) {
        try (FileWriter fw = new FileWriter("books.txt")) {
            for (Book b : books) {
                fw.write(b.bookId + "," + b.bookName + "," + b.bookIsbn + "," + b.bookAuthor + "," + b.bookQuantity + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error updating books.");
        }
    }

    public List<Book> loadBooksFromFile() {
        List<Book> books = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("books.txt"))) {
            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split(",");
                if (arr.length == 5) {
                    books.add(new Book(arr[0], Integer.parseInt(arr[1]), arr[2], arr[3], Integer.parseInt(arr[4])));
                }
            }
        } catch (Exception e) {

        }
        return books;
    }

    public List<Student> loadStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("students.txt"))) {
            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split(",");
                if (arr.length == 3) {
                    students.add(new Student(arr[0], arr[1], arr[2]));
                }
            }
        } catch (Exception e) {

        }
        return students;
    }

    public static void main(String[] args) {
        LMS lms = new LMS();
        lms.menuMethod();
    }
}
