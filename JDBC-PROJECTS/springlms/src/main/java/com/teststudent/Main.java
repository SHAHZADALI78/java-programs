package com.teststudent;
import com.teststudent.config.AppConfig;
import com.teststudent.model.Book;
import com.teststudent.model.IssueBookToStudent;
import com.teststudent.model.ReturnBookToStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IssueBookToStudent issueBook = context.getBean(IssueBookToStudent.class);
        issueBook.display();

        Book book = context.getBean(Book.class);
        book.display();

        ReturnBookToStudent returnBook = context.getBean(ReturnBookToStudent.class);
        returnBook.display();
    }
}