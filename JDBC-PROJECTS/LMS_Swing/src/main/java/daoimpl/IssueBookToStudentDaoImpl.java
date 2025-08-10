/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.IssueBookToStudentDao;
import database.DatabaseConnection;
import model.IssueBookToStudent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class IssueBookToStudentDaoImpl implements IssueBookToStudentDao {

    Connection connection = DatabaseConnection.getDbConnection();

    @Override
    public void issueBook(IssueBookToStudent issue) {
        String query = "Insert Into issued_books (student_id, student_name, roll_number, book_iban) values (?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, issue.getStudentId());
            pstmt.setString(2, issue.getStudentName());
            pstmt.setString(3, issue.getRollNumber());
            pstmt.setString(4, issue.getBookIban());

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Book Issued Successfully.");
            } else {
                System.out.println("Failed to issue book.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<IssueBookToStudent> getAllIssuedBook() {
        List<IssueBookToStudent> issuedBooks = new ArrayList<>();
        String query = "Select * From issued_books";

        try (PreparedStatement pstmt = connection.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                IssueBookToStudent issued = new IssueBookToStudent(
                    rs.getInt("student_id"),
                    rs.getString("student_name"),
                    rs.getString("roll_number"),
                    rs.getString("book_iban")
                );
                issuedBooks.add(issued);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return issuedBooks;
    }
}
