package com.teststudent.dao;


import com.teststudent.Model.Department;

public interface DepartmentDao {
    int addDepartment(Department dept);
    int deleteDepartmentByCode(String code);
    int updateDepartment(String code, Department dept);
    void showAllDepartments();
}

