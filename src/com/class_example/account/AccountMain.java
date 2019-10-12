package com.class_example.account;

public class AccountMain {

	public static void main(String[] args) {
		// InTheLoop Constructors and toString()
		Account account = new Account(1241,1200);
		System.out.println(account);
		Account accountNo = new Account(1521);
		// toString()
		System.out.println(accountNo);
		// InTheLoop Setters and Getters
		account.setAccBalance(1520);
		// run toString() to inspect the modified instance
		System.out.println("The account Number is:"+account.getAccNumber());
		System.out.println("The account balance is:"+account.getAccBalance());
		// InTheLoop credit() and debit()
		account.creadit(1000);
		// run toString() to inspect the modified instance
		System.out.println(account);
		account.debit(520);
		System.out.println(account);
		// InTheLoop debit() error
		account.debit(2100);
		System.out.println(account);

	}

}
