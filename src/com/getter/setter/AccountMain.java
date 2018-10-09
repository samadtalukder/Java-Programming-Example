package com.getter.setter;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccName("Samad Talukder");
		account.setAccBalance(2050.52);
		System.out.println("Account Name: "+account.getAccName());
		System.out.println("Account Balance: "+account.getAccBalance());

	}

}
