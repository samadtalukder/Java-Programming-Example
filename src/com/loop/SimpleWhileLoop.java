package com.loop;

public class SimpleWhileLoop {

	public static void main(String[] args) {
		int sum = 0;
		int i = 50;
		
		while(i != 0) {
			sum += i;
			--i;
		}
		System.out.println("Sum: "+sum);
		
		while(i == 0) {
			sum += i;
			i++;
		}
		System.out.println("Sum2: "+sum);
	}

}
