package com.loop;

public class SimpleDoWhileLoop {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		do{
			//System.out.println("Not Found");
			sum += num;
			num++;
		}while(num <= 20);
		System.out.println("Sum: "+sum);
	}

}
