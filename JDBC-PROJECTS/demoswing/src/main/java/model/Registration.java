/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Registration {
    private String name;
    private String gender;
    private String matric;
    private String inter;
    private String email;
    private String department;
   
    public Registration(String name, String gender, String matric, String inter, String email, String department){
        this.name = name;
        this.gender = gender;
        this.matric = matric;
        this.inter = inter;
        this.email = email;
        this.department = department;
    }
    
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getMatric(){
        return matric;
    }
    public String getInter(){
        return inter;
    }
    public String getEmail(){
        return email;
    }
    public String getDepartment(){
        return department;
    }

}
