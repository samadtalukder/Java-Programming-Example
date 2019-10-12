package com.operator;

public class BasicArithmeticOperators {

	public static void main(String[] args) {
		// arithmetic using integers
		System.out.println("Integers Arithmetic");
		int num1 = 22 + 13;
		int num2 = num1 - 9;
		int num3 = num2 * 3;
		int num4 = num3 / 4;
		int num5 = num4 % 2;
		int num6 = num3 - num1;
		int num7 = -num5;
		
		System.out.println("Num1 = "+num1);
		System.out.println("Num2 = "+num2);
		System.out.println("Num3 = "+num3);
		System.out.println("Num4 = "+num4);
		System.out.println("Num5 = "+num5);
		System.out.println("Num6 = "+num6);
		System.out.println("Num7 = "+num7);
		
		// arithmetic using doubles
		System.out.println("\nFloating Point Arithmetic");
		double doub1 = 49 + 11;
		double doub2 = doub1 * 3;
		double doub3 = doub2 / 4;
		double doub4 = doub3 - doub1;
		double doub5 = -doub4;
		System.out.println("Double1 = " + doub1);
		System.out.println("Double2 = " + doub2);
		System.out.println("Double3 = " + doub3);
		System.out.println("Double4 = " + doub4);
		System.out.println("Double5 = " + doub5);

	}

}
