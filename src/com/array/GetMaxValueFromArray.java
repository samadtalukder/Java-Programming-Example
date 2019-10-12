package com.array;

import java.util.Scanner;

public class GetMaxValueFromArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no. of elements you want in array: ");
		int value = input.nextInt();
		int array[] = new int[value];
		System.out.println("Enter all the elements:");
		
		for(int i=0;i<value;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("These are the numbers you have entered.");
		// print array you have entered
		printArray(array);
		// get maximum array  
		getMaximumArray(array);
		// print maximum array 
		System.out.println("Maximum Value:"+getMaximumArray(array));

	}

	private static int getMaximumArray(int[] array) {
		int maxValue = array[0];
		for(int i = 0;i < array.length;i++) {
			if(maxValue < array[i]) {
				maxValue = array[i];
			}
			/*
			 if (array[i] > maxValue) {
				maxValue = array[i];
			}
			*/
		}
		return maxValue;
	}

	private static void printArray(int[] array) {
		int numArray = array.length;
		for(int i = 0;i < numArray;i++) {
			System.out.println(array[i]+" ");
		}
	}

}
