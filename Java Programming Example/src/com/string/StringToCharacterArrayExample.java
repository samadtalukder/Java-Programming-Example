package com.string;

public class StringToCharacterArrayExample {

	public static void main(String[] args) {
		// Declare the original String object
		String str = "Java Programming";
		// Declare the char array
		char[] charArr;
		// Convert string into array using toCharArray() method of string class
		charArr = str.toCharArray();
		// Display the array
		for(int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
	}

}
