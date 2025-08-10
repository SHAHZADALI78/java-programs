/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.IssueBookToStudent;

/**
 *
 * @author HP
 */
public interface IssueBookToStudentDao {
    void issueBook(IssueBookToStudent issue);
    List<IssueBookToStudent> getAllIssuedBook();
    
}
