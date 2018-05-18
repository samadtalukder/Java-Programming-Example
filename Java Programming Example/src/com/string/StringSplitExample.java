package com.string;

public class StringSplitExample {

	public static void main(String[] args) {
		String sp = "Cricket;Football;Volleyball";
		String[] temp;
		/* delimiter */
		String delimator = ";";
		/* given string will be split by the argument delimiter provided. */
		temp = sp.split(delimator);
		/* print substrings */
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		

	}

}
