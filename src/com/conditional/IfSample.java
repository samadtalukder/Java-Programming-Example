package com.conditional;

public class IfSample {

	public static void main(String[] args) {
		int x = 15;
		int y = 30;
		
		if (x < y) {
			System.out.println("X is less then Y");
		}
		x = x * 2;
		if (x == y) {
			System.out.println("X is equal Y");
		}
		x = x * 2;
		if (x > y) {
			System.out.println("X is greater then Y");
		}
		if (x != y) {
			System.out.println("Not Equal");
		}
		

	}

}
