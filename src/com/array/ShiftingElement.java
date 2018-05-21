package com.array;
import java.util.Scanner;

public class ShiftingElement {
	private static Scanner input;

	public static void main(String[] args) {
		//double[] mylist={10.2,20.2,30.3,40.4};
		double[] myList = new double[5];
		int i;
		input = new Scanner(System.in);
		
		System.out.println("Enter "+myList.length+" values: ");
		for(i=0; i < myList.length; i++)
		{
			myList[i]=input.nextDouble();
			myList[i] = Math.random();
			System.out.println("values = "+myList[i]);
		}
		
		

	}

}
