package com.java.methods;

public class Employee extends Person {
  int emplyeeId;
  double salary;
public Employee(String name, int age, int emplyeeId, double salary) {
	super(name, age);
	this.emplyeeId = emplyeeId;
	this.salary = salary;
	System.out.println("Employee Details:");
}
@Override
  public void displayDetails() {
	
	super.displayDetails();
	System.out.println("EmployeeId: "+emplyeeId+"\nSalary: "+salary);
	  
  }
  
	
}
