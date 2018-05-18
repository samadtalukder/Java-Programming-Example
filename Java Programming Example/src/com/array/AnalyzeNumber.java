package com.array;
import java.util.Scanner;

public class AnalyzeNumber {

	private static Scanner input;

	public static void main(String[] args) {
		
		final int NUMBER_OF_ELEMENT=5;
		double[] number=new double[NUMBER_OF_ELEMENT];
		double sum=0;
		int i;
		
		input = new Scanner(System.in);
		
		for( i=0; i < NUMBER_OF_ELEMENT; i++)
		{
			System.out.println("Enter A Number: ");
			number[i] = input.nextDouble();
			sum += number[i];
			
		}
		System.out.println("Total Array Sum="+sum);
		
		double average=sum/NUMBER_OF_ELEMENT;
		int count=0;
		
		for( i=0; i<NUMBER_OF_ELEMENT; i++)
		{
			if(number[i] >= average)
			{
				count++;
			}
		}
		System.out.println("Average is: "+average);
		System.out.println("Number of elements above the average: "+count);
		

	}

}
