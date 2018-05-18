package com.inheritance.eu;

public class SimpleInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.i =10;
		b.j = 5;
		b.k = 9;
		b.showOutput();
		b.sum();
		A a = new A();
		a.i = 20;
		a.j = 64;
		a.showOutput();
		
	}

}
