package com.java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AmountWithDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int bal = 5000;
		int amount;
		try {
			amount = sc.nextInt();
			if (amount <= 0) {
				throw new IllegalArgumentException();
			} else if (amount > bal) {
				throw new InsufficientFundsException("Insufficient balance");
			}
			int balance = bal - amount;
			System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid input, please enter a number");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Amount must be greater than zero");
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Transaction complete");
		}

	}

}
