/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.ReturnBookDao;
import database.DatabaseConnection;
import model.ReturnBook;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ReturnBookDaoImpl implements ReturnBookDao {

    @Override
    public void returnBook(ReturnBook returnBook) {
        Connection connection = DatabaseConnection.getDbConnection();
        String query = "delete from issued_books where student_id = ? and book_iban = ?";

        try (
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, returnBook.getStudentId());
            statement.setString(2, returnBook.getBookIban());
            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Book returned successfully");
            } else {
                System.out.println("No matching issued book found for return");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
