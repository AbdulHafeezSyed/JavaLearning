package com.java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("enter age:");
			age = sc.nextInt();
			System.out.println("Age: " + age);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("invalid age! please provide correct age");

		}

	}

}
