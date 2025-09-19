package com.java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int s;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter no.of Subjets: ");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter marks for subject " + i + ": ");
				s = sc.nextInt();

				if (s < 0 || s > 100) {
					throw new IllegalArgumentException("Marks must be between 0 and 100");
				} else {
					total += s;

				}

			}
			double average = (total / n);
			System.out.println("Average: " + average);

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid mark, please enter numbers only");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Process finished");
		}

	}

}
