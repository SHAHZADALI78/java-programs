package com.Test.Collection.employee;

import com.Test.Collection.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args){
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("         <<<<<<<<<Employee Detail's>>>>>>>>>>>"   );
        employeeList.add(new Employee("Shahzad Ali","050",100000));
        employeeList.add(new Employee("Saad Khan","052",90000));
        employeeList.add(new Employee("Shoaib","053",80000));
        employeeList.add(new Employee("Shahzeb Khan","054",70000));
        employeeList.add(new Employee("Sikandar","055",60000));
        employeeList.add(new Employee("Sudheer Ali","056",50000));
        employeeList.add(new Employee("Aslam","057",40000));
        employeeList.add(new Employee("Ahmed","058",30000));
        employeeList.add(new Employee("Zohaib","059",85000));
        employeeList.add(new Employee("Shahid","060",95000));


        for(int i = 0; i<employeeList.size(); i++){
            Employee employee = employeeList.get(i);
            //employee.displayEmployeeInfo();
            System.out.println(employee);
            System.out.println();
        }




    }
}
