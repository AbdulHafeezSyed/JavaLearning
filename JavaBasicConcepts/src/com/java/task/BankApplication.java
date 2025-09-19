package com.java.task;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
            System.out.println("\n---- Bank Menu ----");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        bank.createAccount(accNo, name);
                        break;

                    case 2:
                        System.out.print("Enter Account Number: ");
                        accNo = sc.nextInt();
                        System.out.print("Enter Amount: ");
                        double depAmount = sc.nextDouble();
                        bank.deposit(accNo, depAmount);
                        break;

                    case 3:
                        System.out.print("Enter Account Number: ");
                        accNo = sc.nextInt();
                        System.out.print("Enter Amount: ");
                        double wdAmount = sc.nextDouble();
                        bank.withdraw(accNo, wdAmount);
                        break;

                    case 4:
                        System.out.print("Enter From Account Number: ");
                        int fromAcc = sc.nextInt();
                        System.out.print("Enter To Account Number: ");
                        int toAcc = sc.nextInt();
                        System.out.print("Enter Amount: ");
                        double tfAmount = sc.nextDouble();
                        bank.transfer(fromAcc, toAcc, tfAmount);
                        break;

                    case 5:
                        System.out.print("Enter Account Number: ");
                        accNo = sc.nextInt();
                        bank.checkBalance(accNo);
                        break;

                    case 6:
                        bank.showAllAccounts();
                        break;

                    case 7:
                        System.out.println("Exiting... Thank you!");
                        break;

                    default:
                        System.out.println(" Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 7);

        sc.close();
    }

		
	}

