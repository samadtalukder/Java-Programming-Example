package com.method.overloading;

// Multiple methods are potentially going to be called on the same object
// Each method returns an object
public class ChainingMethod {
	private String age;
	private String name;

	public ChainingMethod getAge() {
		this.age = "18";
		return this;
	}

	public ChainingMethod setName(String name) {
		this.name = name;
		return this;
	}

	public void displayValue() {
		System.out.println("Name: " + name + "\nAge: " + age);
	}

	public static void main(String[] args) {
		ChainingMethod chMethod = new ChainingMethod();
		chMethod.setName("Harun").getAge().displayValue();

	}

}
