/*package com.Test.FileHandling;
import com.Test.Interface.Human.Student;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<>();
        File file = new File("Test.txt");
        //file.createNewFile();
        try {

            FileWriter fw = new FileWriter(file);
            fw.write("This Is My First Java File\n");
            fw.write("This IS Our java Class");
            fw.close();

            FileReader reader = new FileReader(file);
            System.out.println("reader :" + (char)reader.read());
            System.out.println("reader :" + (char)reader.read());
            System.out.println("reader :" + (char)reader.read());
            System.out.println("reader :" + (char)reader.read());
            System.out.println("reader :" + (char)reader.read());
            System.out.println("reader :" + (char)reader.read());




            FileWriter fileWriter = new FileWriter(new File("File.txt"));
            fileWriter.write("Today I am Doing File Handling Programs!\n");
            fileWriter.write("Hello Pyare How Are You!");
            fileWriter.close();

            FileReader fr = new FileReader(file);
            int read = fr.read();
            while (read != -1){
                char ch = (char)read;
                System.out.println(ch);
                read = fr.read();
            }


            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                System.out.println("Scanner :" + sc.nextLine() );
            }
            File Students = new File("Students.txt");
            FileWriter fileWriter1 = new FileWriter(Students);

            fileWriter1.write("Name, RollNumber, Age\n");
            fileWriter1.write("Shahid , BSE123 , 21\n");
            fileWriter1.write("Zahid , BSE234 ,  20\n");
            fileWriter1.write("Waseem , BSE432 , 23\n");
            fileWriter1.close();

            Scanner ob = new Scanner(Students);
            ob.nextLine();
            while (ob.hasNext()) {
                String Line = ob.nextLine();
                String [] arr = Line.split(",");
                Student student = new Student();

                System.out.println(Line);

            }
            //FileReader fileReader = new FileReader(Students);
           // System.out.println(fileReader.read());



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    }*/


