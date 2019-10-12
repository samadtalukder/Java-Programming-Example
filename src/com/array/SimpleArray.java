package com.array;

public class SimpleArray {

	public static void main(String[] args) {
		int[] arr = {25,65,58,96,87,52,541};
		
		for(int i =0; i<arr.length;i++) {
			if (arr[i] % 2 != 0) {
				System.out.println("Odd Numbers: "+arr[i]);
			}
			else {
				System.out.println("Even Numbers: "+arr[i]);
			}
		}

	}

}
