package com.teststudent.ServiceImpl;

import com.teststudent.DaoImpl.DepartmentDaoImpl;
import com.teststudent.Model.Department;
import com.teststudent.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDaoImpl departmentDao;

    @Override
    public void showDepartmentMenu(Scanner sc) {
        while (true) {
            System.out.println("--- DEPARTMENT MENU ---");
            System.out.println("1. Add Department");
            System.out.println("2. Delete Department");
            System.out.println("3. Update Department");
            System.out.println("4. Show All Departments");
            System.out.println("5. Back");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter Department Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Department Code: ");
                String code = sc.nextLine();
                boolean result = departmentDao.addDepartment(new Department(name, code));
                System.out.println(result ? "Department added successfully" : "Failed to add department");
            } else if (choice == 2) {
                System.out.print("Enter Code to Delete: ");
                String code = sc.nextLine();
                int result = departmentDao.deleteDepartmentByCode(code);
                System.out.println(result > 0 ? "Department deleted successfully" : "Department not found");
            } else if (choice == 3) {
                System.out.print("Enter Code to Update: ");
                String code = sc.nextLine();
                System.out.print("Enter New Department Name: ");
                String name = sc.nextLine();
                int result = departmentDao.updateDepartment(code, new Department(name, code));
                System.out.println(result > 0 ? "Department updated successfully" : "Department not found");
            } else if (choice == 4) {
                departmentDao.showAllDepartments();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid option");
            }
            System.out.println();
        }
    }
}
