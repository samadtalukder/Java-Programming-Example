package com.array;


public class SumMultiplesOfThreeAndFive {

	public static void main(String[] args) {
		int num = 15;
		int sum = 0;
		
		for(int i=1;i<=num;i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);
	}

}
