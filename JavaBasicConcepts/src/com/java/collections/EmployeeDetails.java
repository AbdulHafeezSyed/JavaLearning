package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDetails {

	public Employee addEmployee() {
		Employee emp = new Employee();
		emp.setName("virat");
		emp.setId(18);
		emp.setCity("banglore");
		System.out.println(emp);
		return emp;

	}

	public List<Employee> addListEmployee() {
		List<Employee> list = new ArrayList();
		Employee e = new Employee();
		e.setName("rohit");
		e.setId(45);
		e.setCity("mumbai");
		list.add(e);
		Employee e1 = new Employee();
		e1.setName("pant");
		e1.setId(17);
		e1.setCity("lucknow");
		list.add(e1);
		for(Employee h:list)
		System.out.println(h);
		return list;
		
 
	}

	public Employee addEmployee(String name, int id, String city) {
		List<Employee> list1=new ArrayList();
		Employee e=new Employee();
		e.setName(name);
		e.setId(id);
		e.setCity(city);
		list1.add(e);
		System.out.println(e);
		return e;

	}
	public Employee display(Employee employee) {
		
		return employee;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp = new EmployeeDetails();
		//List<Employee> list = new ArrayList();
		//emp.addEmployee();
		//emp.addListEmployee(); 
		Employee employee = emp.addEmployee("bumrah", 11, "mumbai");
		emp.display(employee);
		}

}
