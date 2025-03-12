package com.Test.Collection.teacher;
import java.util.*;

public class Test {
    public static void main(String [] args){
        List<Teacher> teacherList = new ArrayList<>();
        System.out.println("<<<<<<< Teacher Details >>>>>>>>");
        teacherList.add(new Teacher("Rahim Bux","Java Programming Language",500000,"Cubix"));
        teacherList.add(new Teacher("Ahmed Qaiser","Software Construction And Development",60000,"SMIU"));
        teacherList.add(new Teacher("Faisal Yaseen","Software Design And Architecture",50000,"SMIU"));
        teacherList.add(new Teacher("Ajab Lashari","English Language",60000,"INDUS"));
        teacherList.add(new Teacher("Saeed Ali","English Composition And Writing",86000,"INDUS"));
        teacherList.add(new Teacher("Maria Memon","Formal Methods",90000,"INDUS"));
        teacherList.add(new Teacher("Inayat Magsi","Pakistan Studies",60000,"INDUS"));
        teacherList.add(new Teacher("Muhammad Ahmed","Computer Network",60000,"SMIU"));
        teacherList.add(new Teacher("Jethanand Khatri","Discrete Structures",70000,"SMIU"));
        teacherList.add(new Teacher("Shahzad Ali","Java Programmer",200000,"Cubix"));


        for(int i = 0; i<teacherList.size(); i++){
            Teacher teacher = teacherList.get(i);
            teacher.displayTeacherInfo();
            System.out.println();
        }
    }
}
