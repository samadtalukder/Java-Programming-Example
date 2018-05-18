package com.inheritance.simple;

public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA clA = new ClassA();
		clA.i = 51;
		clA.j = 52;
		clA.printA();
		clA.sumA();
		//
		ClassB cB = new ClassB();
		//cB.i = 12;
		//cB.j = 35;
		cB.k = 41;
		cB.printA();
		cB.printB();
		cB.sumPrint();
	}

}
