package com.program;

public class CalculatePowers {

	public static void main(String[] args) {
		int num = 2;
		int pow = 3;
		System.out.println(calculatePower(num, pow));
	}

	public static int calculatePower(int num, int pow) {
		int power = 1;
		for (int i = 0; i < pow; i++) {
			power *= num;
		}
		return power;
	}

}
