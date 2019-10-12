package com.input_output;

import java.util.Scanner;

public class IOWithScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String inStr = scanner.nextLine();
		System.out.println(""+inStr);
		System.out.println("Enter int Value: ");
		int inInt = scanner.nextInt();
		System.out.println(""+inInt);
		System.out.println("Enter double Value: ");
		double dbl = scanner.nextDouble();
		System.out.println(""+dbl);
		

	}

}
