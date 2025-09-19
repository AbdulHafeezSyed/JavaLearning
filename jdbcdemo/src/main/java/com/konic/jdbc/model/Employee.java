package com.konic.jdbc.model;

public class Employee {
	private int id;
	private  String name;
	private double salary;
	private String city;

	public Employee() {
	}

	public Employee(int id, String name, double salary,String city) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city=city;
	}

	public Employee(double double1) {
		// TODO Auto-generated constructor stub
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	
	
}
