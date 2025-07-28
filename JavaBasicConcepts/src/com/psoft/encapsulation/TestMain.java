package com.psoft.encapsulation;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		account.setAccountNumber("123456789");
		account.setAccountHolderName("John");
        account.deposite(10000);
        account.withDraw(6000);
        System.out.println("");
        System.out.println("AccountHolderName: "+account.getAccountHolderName());
        System.out.println("AccountNumber: "+account.getAccountNumber());
        System.out.println("Balance: "+account.getBalance());
	}

}
