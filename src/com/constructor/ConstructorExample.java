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
		// object  is not  referring to any  object
		ConstructorExample consNull = null; 
		// Now, object  is referring to a  valid ConstructorExample  object
		consNull = new ConstructorExample();
		// object is not null
		if (consNull!=null) {
			System.out.println("not null");
		}
		System.out.print("Name: "+coExample.name+" \nRank: "+coExample.rank+" \nAge: "+coExample.age);
	}

}
