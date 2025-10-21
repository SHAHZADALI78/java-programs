package com.teststudent.config;

import com.teststudent.model.Book;
import com.teststudent.model.IssueBookToStudent;
import com.teststudent.model.ReturnBookToStudent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public IssueBookToStudent student(){
        IssueBookToStudent issueBook = new IssueBookToStudent();
        issueBook.setStudentId(1);
        issueBook.setStudentName("Ali");
        issueBook.setRollNumber("BSE-23S-001");
        issueBook.setBookIban("IBAN1234");
        return issueBook;

        //return new IssueBookToStudent();

    }
    @Bean
    public Book department(){
        Book book = new Book();
        book.setId(101);
        book.setName("Java Programming");
        book.setAuthor("James Gosling");
        book.setIban("JAVA-001");
        return book;
    }

    @Bean
    public ReturnBookToStudent returnBookToStudent(){
        ReturnBookToStudent returnBook = new ReturnBookToStudent();
        returnBook.setStudentId(1);
        returnBook.setBookIban("IBAN1234");
        return returnBook;

    }
}

