package com.array;

public class ArraySize {
	
	private static void printArraySize(String[] anArray) {
		if(anArray==null) {
			System.out.println("Array is null and has no size.");
		}
		else if(anArray.length==0) {
			System.out.println("The size of the array is empty");
		}
		else {
			int arraySize = anArray.length;
			System.out.println("The size of the array is: "+arraySize);
		}
	}

	public static void main(String[] args) {
		String strArray1[] = {"Bangladesh","India","Australia"};
		String strArray[] = {};
		printArraySize(strArray1);
		printArraySize(null);
		printArraySize(strArray);
	}

}
