package com._static;

import com.misc_program.Person;

public class StaticCount {
	
	public static void main(String[] args) {
		Person per = new Person();
		Person per2 = new Person();
		Person per3 = new Person();
		Person per4 = new Person();
		//
		System.out.println("("+per4.LocalCount+")"+"("+Person.InstanceCount+")");

	}

}
