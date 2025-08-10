/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import dao.StudentsDao;
import database.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import model.Registration;

/**
 *
 * @author HP
 */

public class StudentDaoImpl implements StudentsDao {
    Connection connection = DbConnection.getDbConnection();

    @Override
    public int addRegistration(Registration student) {
        try {
            Statement stmt = connection.createStatement();
            String query = "insert into registration (name, gender, matric, inter, email, department) values ('"
                    + student.getName() + "', '"
                    + student.getGender() + "', '"
                    + student.getMatric() + "', '"
                    + student.getInter()+ "', '"
                    + student.getEmail() + "', '"
                    + student.getDepartment() + "')";
            return stmt.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}