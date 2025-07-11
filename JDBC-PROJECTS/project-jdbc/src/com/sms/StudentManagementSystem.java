package com.sms;
import java.sql.*;
import java.util.Scanner;
public class StudentManagementSystem {
    Scanner scanner = new Scanner(System.in);
    public void insertStudent(Connection conn) {
        try {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Roll Number: ");
            String rollNo = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Department: ");
            String dept = scanner.nextLine();

            String query = "insert into student (s_name, s_rollNo, s_age, s_dept) VALUES ('" + name + "', '" + rollNo + "', " + age + ", '" + dept + "')";
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("    Student inserted successfully!!   ");
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Connection conn) {
        try {
            System.out.print("Enter roll number to update: ");
            String rollNo = scanner.nextLine();
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter new department: ");
            String dept = scanner.nextLine();
            String query = "update student set s_name = '" + name + "', s_age = " + age + ", s_dept = '" + dept + "' where s_rollNo = '" + rollNo + "'";
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate(query);
            if (rows > 0) {
                System.out.println("     Student updated successfully!!     ");
                System.out.println();
            } else {
                System.out.println("Student not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(Connection conn) {
        try {
            System.out.print("Enter roll number to delete: ");
            String rollNo = scanner.nextLine();
            String query = "delete from student where s_rollNo = '" + rollNo + "'";
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate(query);
            if (rows > 0) {
                System.out.println("     Student deleted successfully!!    ");
                System.out.println();
            } else {
                System.out.println("Student not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAllStudents(Connection conn) {
        try {
            String query = "select * from student";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            System.out.println("--------All Students---------");
            while (rs.next()) {
                //System.out.println("ID: " + rs.getInt("s_id"));
                System.out.println("Name: " + rs.getString("s_name"));
                System.out.println("Roll No: " + rs.getString("s_rollNo"));
                System.out.println("Age: " + rs.getInt("s_age"));
                System.out.println("Dept: " + rs.getString("s_dept"));
                System.out.println("        * * * * * * *     ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/s_m_s_JDBC";
            String username = "root";
            String password = "USER@786";
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);


            StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("   <<<<<<<<<< Welcome to SMS >>>>>>>>>>   ");
                System.out.println("1. Insert Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Show All Students");
                System.out.println("5. Exit ");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    studentManagementSystem.insertStudent(connection);
                } else if (choice == 2) {
                    studentManagementSystem.updateStudent(connection);
                } else if (choice == 3) {
                    studentManagementSystem.deleteStudent(connection);
                } else if (choice == 4) {
                    studentManagementSystem.showAllStudents(connection);
                } else if (choice == 5) {
                    System.out.println("Exiting program");
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
