package com.wrapperclass;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
	// Autoboxing is the automatic conversion that the Java compiler makes between
	// the primitive types and their corresponding object wrapper classes.
	// For example, converting an int to an Integer, a double to a Double, and so
	// on. If the conversion goes the other way, this is called unboxing.

	public static void main(String[] args) {
		char ch = 'b';
		// Autoboxing- primitive to Character object conversion
		Character chrObj = ch;
		
		// Autoboxing because ArrayList stores only objects
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Character> charArrayList = new ArrayList<>();

		// not supported
		// ArrayList<int> al = new ArrayList<int>();

		// printing the values from object
		arrayList.add(20);
		charArrayList.add('y');
		
		List<Integer> listInt = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			// listInt.add(i);
			listInt.add(Integer.valueOf(i));
			System.out.println(listInt.get(i));
		}
		// print first arraylist
		System.out.println(arrayList.get(0));
		System.out.println(charArrayList.get(0));
		System.out.println(chrObj);
		sumEven(listInt);

	}

	public static int sumEven(List<Integer> listIn) {
		int sum = 0;
		for (Integer i : listIn) {
			if (i.intValue() % 2 == 0) {
				sum += i.intValue();
				System.out.println("Sum: " + sum);
			}

		}
		return sum;
	}

}
