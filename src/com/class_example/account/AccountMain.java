package com.class_example.account;

public class AccountMain {

	public static void main(String[] args) {
		// Test Constructors and toString()
		Account account = new Account(1241,1200);
		System.out.println(account);
		Account accountNo = new Account(1521);
		// toString()
		System.out.println(accountNo);
		// Test Setters and Getters
		account.setAccBalance(1520);
		// run toString() to inspect the modified instance
		System.out.println("The account Number is:"+account.getAccNumber());
		System.out.println("The account balance is:"+account.getAccBalance());
		// Test credit() and debit()
		account.creadit(1000);
		// run toString() to inspect the modified instance
		System.out.println(account);
		account.debit(520);
		System.out.println(account);
		// Test debit() error
		account.debit(2100);
		System.out.println(account);

	}

}
