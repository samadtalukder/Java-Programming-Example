package com.loop;

public class SimpleForEachLoop {

	public static void main(String[] args) {
		int numArray[] = {12,25,14,356};
		double[] doubleArray = {23.35,56.22,78.0,99.99};
		String[] strArray = {"C","C++","Java"};
		double sum = 0;
		
		for(int n : numArray) {
			System.out.println("Number Array: "+n);
		}
		for (String j : strArray) {
			System.out.println("PL: "+j);
		}
		for(double d : doubleArray) {
			sum += d;
		}
		System.out.println("Total:"+sum);
		
	}

}
