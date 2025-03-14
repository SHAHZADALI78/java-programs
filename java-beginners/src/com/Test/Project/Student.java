package com.Test.Project;
import java.util.*;
public class Student {
    private String studentName;
    private String studentId;
    private String studentRollNumber;
    //List<Student> studentList = new ArrayList<>();

    Student(String studentName, String studentId, String studentRollNumber){
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(String studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    /*public void showAllStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Students Details ");

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String studentIdd = sc.nextLine();

        Student student = new Student(studentName, studentId);
        studentList.add(student);

        System.out.println("Students Registered:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ". " + studentList.get(i));
        }
    }*/

    public void showStudentDetails() {
        System.out.println(studentName + "     " + studentId + "     " + studentRollNumber);
    }


}
