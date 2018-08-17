package com.operator;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int inc1 = ++x;
		int inc2 = y++;
		int inc3 = ++y;
		int inc4 = x++;
		
		
		System.out.println(inc1);
		System.out.println(inc2);
		System.out.println(inc3);
		System.out.println(inc4);

	}

}
