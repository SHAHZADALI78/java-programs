package main;
import database.StudentDBManager;
import database.DepartmentDBManager;
import model.Student;
import model.Department;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDBManager studentDBManager = new StudentDBManager();
        DepartmentDBManager departmentDBManager = new DepartmentDBManager();
        while (true) {
            System.out.println(" -------Main Menu------- ");
             System.out.println("1. Student Management");
            System.out.println("2. Department Management");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter choice: ");
            int mainOpt = sc.nextInt();
            sc.nextLine();

            if (mainOpt == 1) {
                while (true) {
                    System.out.println("--- Student Menu ---");
                    System.out.println("1. Add Student");
                    System.out.println("2. Delete Student");
                    System.out.println("3. Update Student");
                    System.out.println("4. Show All Students");
                    System.out.println("5. Back");
                    System.out.println();
                    System.out.print("Choice: ");
                    int option = sc.nextInt();
                    sc.nextLine();

                    switch (option) {
                        case 1:
                            System.out.print("Name: "); String name = sc.nextLine();
                            System.out.print("RollNumber: "); String rollnumber  = sc.nextLine();
                            System.out.print("Age: "); int age = sc.nextInt(); sc.nextLine();
                            System.out.print("Dept: "); String dept = sc.nextLine();
                            studentDBManager.addStudent(new Student(name, rollnumber, age, dept));
                            break;
                        case 2:
                            System.out.print("RollNumber to delete: "); studentDBManager.deleteStudentByRollNumber(sc.nextLine());
                            break;
                        case 3:
                            System.out.print("RollNumber to update: "); String r = sc.nextLine();
                            System.out.print("New Name: "); String nn = sc.nextLine();
                            System.out.print("New Age: "); int na = sc.nextInt(); sc.nextLine();
                            System.out.print("New Dept: "); String nd = sc.nextLine();
                            studentDBManager.updateStudent(r, new Student(nn, r, na, nd));
                            break;
                        case 4:
                            studentDBManager.showAllStudents();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid option");
                            System.out.println();
                    }
                    if (option == 5)
                        break;
                }
            } else if (mainOpt == 2) {
                while (true) {
                    System.out.println("--- Department Menu ---");
                    System.out.println("1. Add Department");
                    System.out.println("2. Delete Department");
                    System.out.println("3. Update Department");
                    System.out.println("4. Show All Departments");
                    System.out.println("5. Back");
                    System.out.print("Choice: ");
                    int option = sc.nextInt(); sc.nextLine();

                    switch (option) {
                        case 1:
                            System.out.print("Dept Name: "); String dn = sc.nextLine();
                            System.out.print("Dept Code: "); String dc = sc.nextLine();
                            departmentDBManager.addDepartment(new Department(dn, dc));
                            break;
                        case 2:
                            System.out.print("Code to delete: "); departmentDBManager.deleteDepartmentByCode(sc.nextLine());
                            break;
                        case 3:
                            System.out.print("Code to update: "); String uc = sc.nextLine();
                            System.out.print("New Name: "); String unn = sc.nextLine();
                            departmentDBManager.updateDepartment(uc, new Department(unn, uc));
                            break;
                        case 4:
                            departmentDBManager.showAllDepartments();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    if (option == 5) break;
                }
            } else if (mainOpt == 3) {
                System.out.println("Exit ");
                break;
            } else {
                System.out.println("Invalid option");
            }
            System.out.println();
        }
    }
}
