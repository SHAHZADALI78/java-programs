package com.teststudent.ServiceImpl;

import com.teststudent.DaoImpl.StudentDaoImpl;
import com.teststudent.Model.Student;
import com.teststudent.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDaoImpl studentDao;

    @Override
    public void showStudentMenu(Scanner sc) {
        while (true) {
            System.out.println("--- STUDENT MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Back");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Roll Number: ");
                String roll = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                boolean result = studentDao.addStudent(new Student(name, roll, age, dept));
                System.out.println(result ? "Student added successfully." : "Failed to add student.");
            } else if (choice == 2) {
                System.out.print("Enter Roll Number to Delete: ");
                String roll = sc.nextLine();
                boolean result = studentDao.deleteStudent(roll);
                System.out.println(result ? "Student deleted successfully." : "Student not found.");
            } else if (choice == 3) {
                System.out.print("Enter Roll Number to Update: ");
                String roll = sc.nextLine();
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                System.out.print("Enter New Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Department: ");
                String dept = sc.nextLine();
                boolean result = studentDao.updateStudent(roll, name, age, dept);
                System.out.println(result ? "Student updated successfully." : "Student not found.");
            } else if (choice == 4) {
                studentDao.showAllStudents();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
            System.out.println();
        }
    }
}

