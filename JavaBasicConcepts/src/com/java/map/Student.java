package com.java.map;

public class Student {
	String name;
	int id;
	String city;

	public Student(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

}
