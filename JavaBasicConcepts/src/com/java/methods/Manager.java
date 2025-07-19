package com.java.methods;

public class Manager extends Employee{
	String department;

	public Manager(String name, int age,int employeeId , double salary,String department) {
		super(name, age,employeeId, salary);
	
		this.department = department;
	}
	
@Override
public void displayDetails() {
	System.out.println("\nManager Details:");
	super.displayDetails();
	System.out.println("Department: "+department);
}
}
