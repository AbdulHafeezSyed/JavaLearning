package com.java.methods;

import java.util.Scanner;

public class StudentMarks {
	String Name;
	int rollNumber;
	double subject1, subject2, subject3;
	double total = 0;
	double average;

	public StudentMarks(String x, int r, double s1, double s2, double s3) {
		this.Name = x;
		this.rollNumber = r;
		this.subject1 = s1;
		this.subject2 = s2;
		this.subject3 = s3;
		System.out.println("StudentName:" + Name + "\nRollNumber:" + rollNumber + "\nSubject1Marks:" + subject1
				+ "\nSubject2Marks:" + subject2 + "\nSubject3Marks:" + subject3);
	}

	public double calculateTotal() {
		if (subject1 >= 35 && subject2 >= 35 && subject3 >= 35) {
			total = subject1 + subject2 + subject3;
			System.out.println("TotalMarks:" + total);
			return 0;
		} else {
			System.out.println("failed in 1 or more subjects");
			if (subject1 < 35) {
				System.out.println("Failed in subject1");
			}
			if (subject2 < 35) {
				System.out.println("Failed in subject2");
			}
			if (subject3 < 35) {
				System.out.println("Failed in subject3");
			}
			return 0;
		}
	}

	public double average() {
		average = total / 3;
		return average;
	}

	public double displayResult() {
		if (average >= 35) {
			System.out.println("Result:Passed");
		} else {
			System.out.println("Result:Failed ");
		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name:");
		String name = sc.nextLine();
		System.out.println("enter rollNumber:");
		int roll = sc.nextInt();
		System.out.println("enter sub1marks:");
		int sub1 = sc.nextInt();
		System.out.println("enter sub2marks:");
		int sub2 = sc.nextInt();
		System.out.println("enter sub3marks:");
		int sub3 = sc.nextInt();
		StudentMarks h = new StudentMarks(name, roll, sub1, sub2, sub3);
		h.calculateTotal();
		h.average();
		h.displayResult();
	}

}
