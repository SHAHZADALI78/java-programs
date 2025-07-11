package com.Test.Database;
import java.sql.*;
public class Test {
    public static void main (String [] args){

        String jdbcurl = "jdbc:mysql://localhost:3306/University";
        String username = "root";
        String password = "USER@786";

        try{
            Connection con = DriverManager.getConnection(jdbcurl, username, password);
            System.out.println("Connection Successful!!");
            Statement stmt = con.createStatement();
            //String insert =  "Insert into staff (teacher_name , salary) values ('Rahim Bux' , '400000')";
            //stmt.execute(insert);
            String delete =  "delete from staff where staff_id = 5";
            stmt.execute(delete);
            System.out.println("Data Inserted Successfully");
            String query = "Select * from staff";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                Integer staff_id = (rs.getInt("staff_id"));
                System.out.println("Teacher's Id: " + staff_id);
                String teacher_name = (rs.getString("teacher_name"));
                System.out.println("Teacher Name: " +teacher_name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
