package com.operator;

public class CompoundAssignmentOperator {

	public static void main(String[] args) {
		int num1 = 74;
		int num2 = 69;
		int num3 = 33;
		int num4 = 55;
		int num5 = 20;
		
		num1 += 6;
		num2 -= 9;
		num3 *= 3;
		num4 /= 5;
		num5 %= 3;
		
		System.out.println(""+num1);
		System.out.println(""+num2);
		System.out.println(""+num3);
		System.out.println(""+num4);
		System.out.println(""+num5);
	}

}
