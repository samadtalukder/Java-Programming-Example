package com.string;
/*
	Check if string contains valid number example.
	This example shows how to check if string contains valid number
	or not using parseDouble and parseInteger methods of 
	Double and Integer wrapper classes.
*/
public class CheckValidNumberExample {

	public static void main(String[] args) {
		
		String[] str = new String[] {"121","10.20","354","352.62","10.20val","5A"};
		for(int i = 0; i < str.length; i++) {
			if (str[i].indexOf(".")> 0) {
				try {
					/*
					 * To check if the number is valid decimal number, use
					 * double parseDouble(String str) method of 
					 * Double wrapper class.
					 * 
					 * This method throws NumberFormatException if the
					 * argument string is not a valid decimal number.
					 */
					// Double.parseDouble(String) will return a primitive double type
					Double.parseDouble(str[i]);
					System.out.println(str[i]+" decimal valid number");
				}
				catch(NumberFormatException nException) {
					System.out.println(str[i]+" not decimal valid number");
				}
				
			}
			else {
				try {
					/*
					 * To check if the number is valid integer number, use
					 * int parseInt(String str) method of 
					 * Integer wrapper class.
					 * 
					 * This method throws NumberFormatException if the
					 * argument string is not a valid integer number.
					 */
					// Integer.parseInt(String) will return a primitive int type
					Integer.parseInt(str[i]);
					System.out.println(str[i]+" integer valid number");
					
				} catch (NumberFormatException nException) {
					System.out.println(str[i]+" not integer valid number");
				}
				
			}
		}

	}

}
