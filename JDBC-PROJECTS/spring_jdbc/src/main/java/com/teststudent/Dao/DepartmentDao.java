package com.teststudent.Dao;

import com.teststudent.Model.Department;
import org.springframework.stereotype.Component;

@Component
public interface DepartmentDao {
    boolean addDepartment(Department department);
}
