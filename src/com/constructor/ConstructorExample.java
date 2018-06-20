package com.constructor;

public class ConstructorExample {
	String name;
	int rank;
	int age;
	// Default Constructor
	public ConstructorExample() {
		this.name = "Lieonel Messi";
		this.rank = 1;
		this.age = 30;
	}
	public static void main(String[] args) {
		ConstructorExample coExample = new ConstructorExample();
		System.out.print("Name: "+coExample.name+" \nRank: "+coExample.rank+" \nAge: "+coExample.age);
	}

}
