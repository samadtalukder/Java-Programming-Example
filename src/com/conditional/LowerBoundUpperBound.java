package com.conditional;
public class LowerBoundUpperBound {

	public static void main(String[] args) {
		int upperBound = 10;
		int lowerBound = 1;
		int oddSum = 0;
		int evenSum = 0;
		int num =lowerBound;
		
		while(num <= upperBound) {
			if(num % 2 == 0) {
				evenSum+=num;
			}
			else {
				oddSum+=num;
			}
			++num;
		}
		System.out.println("The sum of odd numbers from= "+oddSum);
		System.out.println("The sum of Even numbers from= "+evenSum);
		System.out.println("The difference between the two sums is " + (evenSum - oddSum));

	}

}
