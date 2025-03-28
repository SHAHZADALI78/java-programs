package com.Test.Project.StudentManagementSystem;
import java.util.*;

class StudentManagementSystem {
    ArrayList<Department> departments;
    ArrayList<Student> students;

    private Scanner sc = new Scanner(System.in);

    public StudentManagementSystem() {
        departments = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addDepartment() {
        sc.nextLine();
        System.out.print("Enter department name: ");
        String name = sc.nextLine();
        System.out.print("Enter department code: ");
        String code = sc.nextLine();

        for (Department dept : departments) {
            if (dept.code.equals(code)) {
                System.out.println("Department code " + code + " already exists.");
                return;
            }
        }

        departments.add(new Department(name, code));
        System.out.println("Department added successfully.");
        System.out.println(" ");
    }

    public void updateDepartment() {
        System.out.print("Enter department code you want to update: ");
        String code = sc.nextLine();

        Department deptToUpdate = null;
        for (Department dept : departments) {
            if (dept.code.equals(code)) {
                deptToUpdate = dept;
                break;
            }
        }

        if (deptToUpdate == null) {
            System.out.println("Department does not exist.");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new code: ");
        String newCode = sc.nextLine();

        for (Department dept : departments) {
            if (dept.code.equals(newCode)) {
                System.out.println("Department code " + newCode + " already exists.");
                return;
            }
        }

        deptToUpdate.name = newName;
        deptToUpdate.code = newCode;
        System.out.println("Department updated successfully.");
    }

    public void deleteDepartment() {
        System.out.print("Enter department code to delete: ");
        String code = sc.nextLine();

        Department deptToDelete = null;
        for (Department dept : departments) {
            if (dept.code.equals(code)) {
                deptToDelete = dept;
                break;
            }
        }

        if (deptToDelete == null) {
            System.out.println("Department does not exist.");
            return;
        }

        departments.remove(deptToDelete);
        System.out.println("Department deleted successfully.");
    }

    public void getDepartment() {
        System.out.print("Enter department code to get: ");
        String code = sc.nextLine();

        Department dept = null;
        for (Department d : departments) {
            if (d.code.equals(code)) {
                dept = d;
                break;
            }
        }

        if (dept == null) {
            System.out.println("Department does not exist.");
        } else {
            System.out.println("Department Name: " + dept.name + ", Department Code: " + dept.code);
        }
    }

    public void getAllDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
        } else {
            for (Department dept : departments) {
                System.out.println("Department Name: " + dept.name + ", Department Code: " + dept.code);
            }
        }
    }

    public void addStudent() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student roll number: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter department code: ");
        String departmentCode = sc.nextLine();

        boolean deptExists = false;
        for (Department dept : departments) {
            if (dept.code.equals(departmentCode)) {
                deptExists = true;
                break;
            }
        }

        if (!deptExists) {
            System.out.println("Department does not exist.");
            return;
        }

        students.add(new Student(id, name, rollNo, departmentCode));
        System.out.println("Student added successfully.");
    }

    public void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student studentToUpdate = null;
        for (Student student : students) {
            if (student.id == id) {
                studentToUpdate = student;
                break;
            }
        }

        if (studentToUpdate == null) {
            System.out.println("Student does not exist.");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new roll number: ");
        String newRollNumber = sc.nextLine();
        System.out.print("Enter new department code: ");
        String newDeptCode = sc.nextLine();

        boolean deptExists = false;
        for (Department dept : departments) {
            if (dept.code.equals(newDeptCode)) {
                deptExists = true;
                break;
            }
        }

        if (!deptExists) {
            System.out.println("Department does not exist.");
            return;
        }

        studentToUpdate.name = newName;
        studentToUpdate.rollNo = newRollNumber;
        studentToUpdate.departmentCode = newDeptCode;
        System.out.println("Student updated successfully.");
    }

    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        Student studentToDelete = null;
        for (Student student : students) {
            if (student.id == id) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete == null) {
            System.out.println("Student does not exist.");
            return;
        }

        students.remove(studentToDelete);
        System.out.println("Student deleted successfully.");
    }

    public void getStudent() {
        System.out.print("Enter student ID to get: ");
        int id = sc.nextInt();

        Student student = null;
        for (Student s : students) {
            if (s.id == id) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("Student does not exist.");
        } else {
            System.out.println("Student ID: " + student.id + ", Name: " + student.name + ", Roll Number: " + student.rollNo + ", Department Code: " + student.departmentCode);
        }
    }

    public void getAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                System.out.println("Student ID: " + s.id + ", Name: " + s.name + ", Roll Number: " + s.rollNo + ", Department Code: " + s.departmentCode);
            }
        }
    }

    public void menuMethod() {
        while (true) {
            System.out.println("\n1- Student Management");
            System.out.println("2- Department Management");
            System.out.println("3- Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    StudentManagement();
                    break;

                case 2:
                    DepartmentManagement();
                    break;

                case 3:
                    System.out.println("Exiting the system...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void StudentManagement() {
        while (true) {
            System.out.println("\n1- Add Student");
            System.out.println("2- Update Student");
            System.out.println("3- Delete Student");
            System.out.println("4- Get Single Student");
            System.out.println("5- Get All Students");
            System.out.print("Enter your choice: ");
            int studentChoice = sc.nextInt();

            switch (studentChoice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    updateStudent();
                    break;

                case 3:
                    deleteStudent();
                    break;

                case 4:
                    getStudent();
                    break;

                case 5:
                    getAllStudents();
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

            System.out.print("\nDo you want to continue with Student Management? (y/n): ");
            char continueChoice = sc.next().charAt(0);
            if (continueChoice != 'y') {
                break;
            }
        }
    }

    private void DepartmentManagement() {
        while (true) {
            System.out.println("\n1- Add Department");
            System.out.println("2- Update Department");
            System.out.println("3- Delete Department");
            System.out.println("4- Get Single Department");
            System.out.println("5- Get All Departments");
            System.out.print("Enter your choice: ");
            int deptChoice = sc.nextInt();

            switch (deptChoice) {
                case 1:
                    addDepartment();
                    break;

                case 2:
                    updateDepartment();
                    break;

                case 3:
                    deleteDepartment();
                    break;

                case 4:
                    getDepartment();
                    break;

                case 5:
                    getAllDepartments();
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

            System.out.print("\nDo you want to continue with Department Management? (y/n): ");
            char continueChoice = sc.next().charAt(0);
            if (continueChoice != 'y') {
                break;
            }
        }
    }
}

