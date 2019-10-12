package com.array;

public class CopyArray {

	public static void main(String[] args) {
		//Declaring and initializing an array of ints
		int arr[]= {10,20,30};
		//copying array 'arr' to array 'arrCopy'
		int arrCopy[] = arr;
		//Printing elements of array 'arrCopy'
		for(int i=0;i<arrCopy.length;i++) {
			System.out.println(arrCopy[i]);
		}

	}

}
