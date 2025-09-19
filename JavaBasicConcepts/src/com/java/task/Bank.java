package com.java.task;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	Map<Integer, Account> map = new HashMap<Integer, Account>();

	public void createAccount(int accNo, String name) {
		 if (map.containsKey(accNo)) {
	            System.out.println(" Account already exists with number: " + accNo);
	            return;
	        }
		Account account = new Account(accNo, name);
		map.put(accNo, account);
		System.out.println(" Account created successfully for " + name + " with number " + accNo);
    }

	public void deposit(int accNo, double amount) throws AccountNotFoundException, InvalidAmountException {
		if (!map.containsKey(accNo)) {
			throw new AccountNotFoundException("Account Not Exist!");
		}
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid Amount");
		}
		 Account account = map.get(accNo);
	        account.deposit(amount);
	        System.out.println("Deposit successful! " + amount + " added to account " + accNo);
	        System.out.println(" Updated Balance: " + account.getBalance());
	    }

	public void withdraw(int accNo, double amount)
			throws AccountNotFoundException, InvalidAmountException, InsufficientFundsException {
		if (!map.containsKey(accNo)) {
			throw new AccountNotFoundException("Account Not Exist!");
		}
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid Amount");
		}
		Account account = map.get(accNo);
        if (account.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient balance in account " + accNo);
        }
        account.withdraw(amount);
        System.out.println(" Withdraw successful! " + amount + " deducted from account " + accNo);
        System.out.println(" Updated Balance: " + account.getBalance());
    }

	public void transfer(int fromAcc, int toAcc, double amount)
			throws AccountNotFoundException, InvalidAmountException, InsufficientFundsException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid Amount");
		}
		if (!map.containsKey(fromAcc)) {
			throw new AccountNotFoundException("Account doesn't exist");
		}
		if (!map.containsKey(toAcc)) {
			throw new AccountNotFoundException("Account doesn't exist");
		}
		Account sender = map.get(fromAcc);
        if (sender.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient balance in account " + fromAcc);
        }
        Account receiver = map.get(toAcc);
        sender.withdraw(amount);
        receiver.deposit(amount);
        System.out.println("Transfer successful: " + amount + 
                           " from " + fromAcc + " to " + toAcc);
    }

	public void checkBalance(int accNo) throws AccountNotFoundException {
		if (!map.containsKey(accNo)) {
			throw new AccountNotFoundException("Account not exist!");
		}
		Account account = map.get(accNo); 
		System.out.println("Balance for account " + accNo + " is: " + account.getBalance());
    }

	public void showAllAccounts() {
		if (map.isEmpty()) {
			System.out.println("No accounts found!");
			return;
		}

		System.out.println("---- All Accounts ----");
		for (Account acc : map.values()) {
			System.out.println(acc);
		}
	}

}
