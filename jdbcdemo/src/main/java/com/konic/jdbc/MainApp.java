package com.konic.jdbc;

import java.util.List;

import com.konic.jdbc.dao.EmployeeDAO;
import com.konic.jdbc.model.Employee;

public class MainApp {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();

        // Insert Employees
        dao.addEmployee(new Employee(1, "Virat", 50000,"Nellore"));
        dao.addEmployee(new Employee(2, "Rohit", 60000,"Gudur"));
        dao.addEmployee(new Employee(3, "Gill", 45000,"Kovur"));

        // Fetch All Employees
//       List<Employee> employees = dao.getAllEmployees();
//        employees.forEach(System.out::println);
        
      //  dao.getMaxsalary();
        dao.update();
    }
}
