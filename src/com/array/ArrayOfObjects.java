package com.array;

import java.util.Scanner;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Account[] accounts = new Account[2];
		
		/*
		accounts[0] = new Account();
		accounts[0].Name = "Surav";
		System.out.println(accounts[0].Name);
		*/
		// Allocating memory to each object
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
		}
		// input data in loop
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("\nEnter details of " + (i + 1) + " Employee \n");
			accounts[i].inputData();
		}
		// print input data in loop
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].displayData();
		}
	}

}

class Account {
	int Id;
	String Name;
	int Age;
	long Salary;

	public void inputData() {

		Scanner sc = new Scanner(System.in);

		System.out.print("\n\tEnter Employee Id : ");
		Id = Integer.parseInt(sc.nextLine());

		System.out.print("\n\tEnter Employee Name : ");
		Name = sc.nextLine();

		System.out.print("\n\tEnter Employee Age : ");
		Age = Integer.parseInt(sc.nextLine());

		System.out.print("\n\tEnter Employee Salary : ");
		Salary = Integer.parseInt(sc.nextLine());
	}

	public void displayData() {
		System.out
				.print("\n\t" + "ID: " + Id + " Name: " + "" + Name + " Age: " + "" + Age + " Salary: " + "" + Salary);
	}
}
