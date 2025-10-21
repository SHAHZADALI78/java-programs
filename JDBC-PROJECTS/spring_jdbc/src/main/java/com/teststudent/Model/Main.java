package com.teststudent.Model;

import com.teststudent.Config.AppConfig;
import com.teststudent.Service.DepartmentService;
import com.teststudent.Service.StudentService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Main {

    private final StudentService studentService;
    private final DepartmentService departmentService;

    public Main(StudentService studentService, DepartmentService departmentService) {
        this.studentService = studentService;
        this.departmentService = departmentService;
    }

    public void show() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("************ Welcome to Student Management System ************");
            System.out.println("1. Student Management");
            System.out.println("2. Department Management");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int mainOpt = sc.nextInt();
            sc.nextLine();

            if (mainOpt == 1) {
                studentService.showStudentMenu(sc);
            } else if (mainOpt == 2) {
                departmentService.showDepartmentMenu(sc);
            } else if (mainOpt == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
        Main app = beanFactory.getBean(Main.class);
        app.show();
    }
}
