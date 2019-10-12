package com.wrapperclass;

import java.util.ArrayList;

public class Unboxing {
	// Unboxing: It is just the reverse process of autoboxing. Automatically
	// converting an object of a wrapper class to its corresponding primitive type
	// is known as unboxing. For example – conversion of Integer to int, Long to
	// long, Double to double etc.
	public static void main(String[] args) {
		Double dl = 10.10;
		double doubl = dl;

		ArrayList<Integer> arInteger = new ArrayList<>();
		arInteger.add(10);
		int in = arInteger.get(0);

		System.out.println(in);
		System.out.println(doubl);
	}

}
