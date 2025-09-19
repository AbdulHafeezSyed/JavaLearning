package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManipulation {
	List<Student> list = new ArrayList<>();

	List<Student> addEmployee() {

		Student s = new Student();
		s.setName("virat");
		s.setId(18);
		s.setCity("delhi");
		s.setAddress("banglore");
		list.add(s);

		Student s1 = new Student();
		s1.setName("rohit");
		s1.setId(45);
		s1.setCity("mumbai");
		s1.setAddress("hyd");
		list.add(s1);

//		System.out.println("Name: " + s.getName() + "\nId: " + s.getId() + "\nCity: " + s.getCity()+"\nAddress: "+s.getAddress());
//		System.out.println("\nName: " + s1.getName() + "\nId: " + s1.getId() + "\nCity: " + s1.getCity()+"\nAddress: "+s1.getAddress());
//		for(Student n :list) {
//			System.out.println(n);
//		}
		return list;
	}

	List<Student> addSingleEmployee(Student e) {
		list.add(e);

		return list;
	}

	List<Student> addListEmployees(List<Student> e) {
		e.addAll(e);
		for (Student z : list) {
	 		System.out.println(z);
		}
		return list;
	}

	List<Student> display() {
		for (Student n : list) {
			System.out.println(n);

		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManipulation emp = new EmployeeManipulation();
		emp.addEmployee();

		Student s2 = new Student();
		s2.setAddress("gujrat");
		s2.setCity("nellore");
		s2.setId(1);
		s2.setName("gill");
		emp.addSingleEmployee(s2);
		Student s3 = new Student();
		s3.setAddress("guntur");
		s3.setCity("lucknow");
		s3.setId(10);
		s3.setName("sachin");
		emp.addSingleEmployee(s3);
		// emp.display();
		List<Student> list = new ArrayList<>();
		list.add(s3);
		list.add(s2);
		emp.addListEmployees(list);
		Student student=emp.setEmpName("syed",10,"Nellore");

	}

	private  Student setEmpName(String name, int id, String address) {
		
		Student student=new Student();
		student.setName(name);
		student.setAddress(address);
		student.setId(id);
		return student;
		
	}
}
