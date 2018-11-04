package com.misc_program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConversionCalculator {

	public static void main(String[] args) {
		String num1 = getInput("Enter Number: ");
		String num2 = getInput("Enter Number: ");
		
		double d1 = Double.parseDouble(num1);
		double d2 = Double.parseDouble(num2);
		double result = d1 + d2;
		
		System.out.println("Total Sum: "+result);

	}
	private static String getInput(String input) {
		BufferedReader buReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(input);
		//System.out.flush();
		
		try {
			return buReader.readLine();
		}catch (Exception e) {
			return "Error: "+e.getMessage();
		}
		//return input;
	}

}
