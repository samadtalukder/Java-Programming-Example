package com.inheritance.simple;

public class ClassB extends ClassA{
	int k;
	public void printB() {
		System.out.println("K= "+k);
	}
	
	
	public void sumPrint() {
		System.out.println("Total= "+(i+j+k));
	}
}
