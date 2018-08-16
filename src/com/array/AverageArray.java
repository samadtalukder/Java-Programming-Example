package com.array;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		
		int num;
		double sum = 0;
		double avg;
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers you want to enter?");
		num = in.nextInt();
		double arr[]=new double[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Element No."+(i+1)+":");
			arr[i] = in.nextDouble();
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.format("The average is: %.3f",avg);
		in.close();
		
		
		

	}

}
