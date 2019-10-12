package com.abstraction;

public class PersonMain extends Person{
	private int empID;

	public PersonMain(String name, String gender,int empID) {
		super(name, gender);
		this.empID = empID;
	}

	public static void main(String[] args) {
		PersonMain person1 = new PersonMain("Habib", "Male", 1);
		PersonMain person2 = new PersonMain("Nafisa", "Female", 0);
		person1.work();
		System.out.println(person1);
		person2.work();
		System.out.println(person2);

	}

	@Override
	public void work() {
		if (empID == 0) {
			System.out.println("Not working");
		}else {
			System.out.println("Working as employee!!");
		}
		
	}

}
