package com.Test.Project.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LMS {
    List <Student> studentList = new ArrayList<>();
    List <Books> booksList = new ArrayList<>();


    public  LMS() {
        booksList.add(new Books("java   ", 1, "BWE012345", "John     ", 10));
        booksList.add(new Books("C#     ", 2, "BWE23450", "Wick       ", 15));
        booksList.add(new Books("C++    ", 3, "BSE03405", "Anther    ", 10));
        booksList.add(new Books("C      ", 4, "BSE45021", "Antony    ", 15));
        booksList.add(new Books("Poetry ", 5, "BWE02413", "Aristotle ", 10));

    }

    public void menuMethod() {
        System.out.println("<<<<<<< WELCOME TO SMIU LIBRARY >>>>>>>>");
        System.out.println("(1): Add Book To Library  ");
        System.out.println("(2): Issue Book To Student  ");
        System.out.println("(3): Return Book From Student ");
        System.out.println("(4): Show All Books  ");
        System.out.println("(5): Show All Students  ");
        System.out.println(" ");
        System.out.print("Enter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            addBookToLibrary();
        } else if (choice == 2) {
            issueBookToStudent();

        } else if (choice == 3) {
            returnBookFromStudent();
        } else if (choice == 4) {
            showAllBooks();
        } else if (choice == 5) {
            showAllStudents();
        } else {
            System.out.println("Library Se Bahr Chale Jae Yaha Ap Ka Kam Nahi");
        }
        System.out.print(" Would You Like To Continue Program?(yes/no): ");
        String Choice = sc.next();
        if (Choice.equals("yes")) {
            menuMethod();
        } else {
            System.out.println("You Have Done Your Job Very Well");
        }

    }

    public void addBookToLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" <<<<<<Enter Book Details>>>>>>  ");
        System.out.print("Enter Book Name:   ");
        String bookName = sc.nextLine();
        System.out.print("Enter Book ID:   ");
        int bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book ISBN:  ");
        String bookIsbn = sc.nextLine();
        System.out.print("Enter Book Author Name:   ");
        String bookAuthor = sc.nextLine();
        System.out.print("Enter Book Quantity:    ");
        int bookQuantity = sc.nextInt();
        Books books = new Books(bookName, bookId, bookIsbn, bookAuthor, bookQuantity);
        booksList.add(books);
        System.out.println("Book List Has Been Upgraded With New Books Successfully");
    }


    public void issueBookToStudent(){
            Scanner sc = new Scanner(System.in);
            System.out.println("  Enter Issue Book Details   ");
            System.out.print("Enter Student Name : ");
            String studentName = sc.next();
            System.out.print("Enter Book ISBN You Want To Issue: ");
            String Isbn = sc.next();
            System.out.print("Enter Student ID   : ");
            String studentId = sc.next();
            System.out.print("Enter Student Roll Number: ");
            int studentRollNumber = sc.nextInt();


            Books foundBook = null;
            for (Books books : booksList) {
                if (books.getBookIsbn().equalsIgnoreCase(Isbn)) {
                    foundBook = books;
                    break;
                }
            }

            if (foundBook != null && foundBook.getBookQuantity() > 0) {
                foundBook.setBookQuantity(foundBook.getBookQuantity() - 1);

                studentList.add(new Student(studentName,studentId, Isbn));
                System.out.println("Book Issued Successfully To Student: " + studentName);
            }
            else {
                System.out.println("Sorry, The Book With This Isbn " + Isbn + "Is Not Available.");
            }
        }


        public void returnBookFromStudent () {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter Details For Returning Book ");
            System.out.println("Enter Book Name: ");
            String bookName = sc.next();
            System.out.println("Enter Book Isbn: ");
            String bookIsbn = sc.next();

            Books foundBook = null;
            for (Books b : booksList) {
                if (b.getBookName().equalsIgnoreCase(bookName) && b.getBookIsbn().equalsIgnoreCase(bookIsbn)) {
                    foundBook = b;
                    break;
                }
            }

            if (foundBook != null) {
                foundBook.setBookQuantity(foundBook.getBookQuantity() + 1);
                System.out.println("Book Returned Successfully");
            } else {
                System.out.println("Sorry, This Book Does,t Belongs To Our Library.");
            }
        }


        public void showAllBooks () {
            System.out.println(" <<<<<<<<<< Books Available In Library >>>>>>>>>>");
            System.out.println("Book Name      Book ID       Book Isbn         Book Author       Book Quantity");
            for (int i = 0; i < booksList.size(); i++) {
                booksList.get(i).showBookDetails();

            }

        }


        public void showAllStudents () {
            System.out.println("List Of Students Whom Books Has Been Issued :");
            System.out.println("StudentName     StudentID     StudentRollNumber");
            for (int i = 0; i < studentList.size(); i++) {
                studentList.get(i).showStudentDetails();

            }
        }


        public static void main(String[]args){
            LMS lms = new LMS();
            lms.menuMethod();
        }
    }








