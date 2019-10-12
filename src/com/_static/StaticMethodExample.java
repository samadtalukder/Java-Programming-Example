package com._static;

public class StaticMethodExample {

	public static void main(String[] args) {
		int result = Utitlity.add(25, 25);
		System.out.println("Result: "+result);
		
		double divided = Utitlity.divided(10, 5);
		System.out.println("Divided: "+divided); 
		
	}

}
class Utitlity{
	public static int add(int first,int second) {
		return first + second;
	}
	public static double divided(double first, double second) {
		return first / second;
	}
}
