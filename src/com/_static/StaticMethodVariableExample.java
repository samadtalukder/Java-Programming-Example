package com._static;

public class StaticMethodVariableExample {

	public static void main(String[] args) {
		University uni = new University();
		uni.showData();
		University uni2 = new University();
		uni2.showData();
		University uni3 = new University();
		uni3.showData();
		int inc = University.increment();
		System.out.println("Inc:"+inc);
	}

}
class University{
	int a;
	static int b;
	public University() {
		b++;
	}
	public void showData() {
		System.out.println("Value of A: "+a);
		System.out.println("Value of B: "+b);
	}
	public static int increment() {
		 return b++;
	}
	
	
}
