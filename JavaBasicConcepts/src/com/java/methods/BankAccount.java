package com.java.methods;

import java.util.Scanner;

public class BankAccount {
	String accountHolderName;
	int accountNumber;
	double balance;
	double totalBalance;

	public BankAccount(String x,int y) {
     this.accountHolderName=x;
     this.accountNumber=y;
     balance=0;
     System.out.println("Name:"+accountHolderName+"\nAccountNumber:"+accountNumber);
     }
	public double Deposite(double amount) {
		totalBalance=amount+balance;
		System.out.println("totalBalance after deposite:"+totalBalance);
		return totalBalance;
		
	}
	public double withDraw(double withdraw) {
		if(totalBalance>withdraw)
		{
			totalBalance=totalBalance-withdraw;
		 System.out.println("totalBalance after withdraw:"+totalBalance);
		 return totalBalance-withdraw;
		}
		System.out.println("Insufficient funds");
		return withdraw;
		
	}
	public double checkBalance() {
		System.out.println("totalBalance:"+totalBalance);
		return totalBalance;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		System.out.println("enter accountNumber:");
		int accnum=sc.nextInt();
		System.out.println("enter amount to deposite:");
		double dep=sc.nextDouble();
		System.out.println("enter amount to withdraw:");
		double wit=sc.nextDouble();
	    BankAccount bankaccount=new BankAccount(name,accnum);
		bankaccount.Deposite(dep);
		bankaccount.withDraw(wit);
		bankaccount.checkBalance();

	}

}
