package com.java.map;

import java.util.Map;
import java.util.TreeMap;

public class DisplayDetails {
	Map<Integer, Student> map = new TreeMap<>();
	Map<Integer, Employee> emp = new TreeMap<>();
	Map<Integer, Cities> city = new TreeMap<>();

	public void addStudent() {
		Student s1 = new Student("virat", 18, "Delhi");
		Student s2 = new Student("devillers", 17, "Africa");
		map.put(1, s1);
		map.put(2, s2);
		for (Student s : map.values()) {
			System.out.println(s);
		}

	}

	public void addEmployee() {
		Employee e1 = new Employee("rohit", 45, "mumbai");
		Employee e2 = new Employee("pollard", 55, "WestIndies");
		emp.put(1, e1);
		emp.put(2, e2);
		for (Employee e : emp.values()) {
			System.out.println(e);
		}

	}

	public void addcities() {
		Cities c1 = new Cities("AP", "Nellore");
		Cities c2 = new Cities("AP", "kadapa");
		city.put(1,c1);
		city.put(2,c2);
		for(Cities c:city.values()) {
			System.out.println(c);
		}
		
	}

	public void display() {
		addStudent();
		System.out.println("-----------------------------------------------");
		addEmployee();
		System.out.println("-----------------------------------------------");
		addcities();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayDetails d = new DisplayDetails();
		d.display();
	}

}
