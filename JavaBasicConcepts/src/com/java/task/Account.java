package com.java.task;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0; 
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // withdraw
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + 
               ", Name: " + name + 
               ", Balance: " + balance;
    }
}
