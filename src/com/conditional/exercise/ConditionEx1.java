package com.conditional.exercise;

public class ConditionEx1 {

	public static void main(String[] args) {
		int x,y;
		x = 20;
		y = 30;
		if (x < y) {
			x = y;
			y = 0;
			System.out.println(x);
			System.out.println(y);
		}

	}

}
