package com.java.methods;

public class Manager extends Employee {
	String department;

	public Manager(String name, int age, int employeeId, double salary, String department) {
		super(name, age, employeeId, salary);

		this.department = department;
		System.out.println("\nManager Details:");
	}

	@Override
	public void displayDetails() {

		super.displayDetails();
		System.out.println("Department: " + department);
	}
}
