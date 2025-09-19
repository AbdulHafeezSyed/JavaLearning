package com.java.methods;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("parent "+"Name: " + name + "\nAge: " + age);

	}
	
}
