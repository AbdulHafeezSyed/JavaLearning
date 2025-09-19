package com.psoft.encapsulation;

import java.util.Scanner;

public class Student {

	public String name;
	private int rollNumber;
	private char grade;

	public void setName(String name) {
		if(name!=null && !name.isEmpty()) {
		this.name = name;
		}
		else {
			this.name=name;
			System.out.println("invalid name ");
		}
	}

	public void setRollNumber(int rollNumber) {
		if(rollNumber>0) {
		this.rollNumber = rollNumber;
		}else {
			this.rollNumber=rollNumber;
			System.out.println("rollnumber must be positive :"+rollNumber);
		}
	}

	public void setGrade(char grade) {
		
		if(grade=='A' || grade=='B'||grade=='C'||grade=='D'||grade=='F') {
		this.grade = grade;
		}
		else {
			this.grade=grade;
			System.out.println("Invalid grade : "+grade);
		}
		
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public char getGrade() {
		return grade;
	}
  
}
