package com.psoft.encapsulation;

public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public void setAccountNumber(String accountNumber) {

		this.accountNumber = accountNumber;

	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Balance deposite: " + balance);
		} else {
			System.out.println("Invalid Data");
		}

	}

	public void withDraw(double amount) {
		if (amount > 0 && balance > amount) {
			balance = balance - amount;
			System.out.println("Balance withDraw: " + balance);
		} else {
			System.out.println("Invalid amount");
		}
	}

	public String getAccountNumber() {
	// System.out.println( accountNumber);
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

}
