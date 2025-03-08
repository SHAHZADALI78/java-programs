package com.Test.Collection.student;
import java.util.*;

public class Test {
        public static void main(String[] args) {
            List<Student> studentList = new ArrayList<>();
            System.out.println("<<<<<<<<STUDENT'S DATA>>>>>>>>");
            studentList.add(new Student("Shahzad Ali","050",23,"SMIU"));
            studentList.add(new Student("Ahmed Ali","020",22,"SMIU"));
            studentList.add(new Student("Ali Abbas","123",21,"SMIU"));
            studentList.add(new Student("Zain Ahmed","124",24,"SMIU"));
            studentList.add(new Student("Usman Khan","125",23,"SMIU"));
            studentList.add(new Student("Omar","128",25,"SMIU"));
            studentList.add(new Student("Saad","129",22,"SMIU"));
            studentList.add(new Student("Ahad","130",21,"SMIU"));
            studentList.add(new Student("Asad","131",23,"SMIU"));
            studentList.add(new Student("Bilal","121",24,"SMIU"));


            for (int i = 0; i < studentList.size(); i++) {
                Student student = studentList.get(i);
                student.displayStudentInfo();
                System.out.println();
            }
        }
    }
