package com.java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		try {
			n = sc.nextInt();
			int result = x / n;
			System.out.println("Result:" + result);

		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Cannot divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Input mismatch!");
		}
		finally {
			System.out.println("Program End!");
		}

	}

}
