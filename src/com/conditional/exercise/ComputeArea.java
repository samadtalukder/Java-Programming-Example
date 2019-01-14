package com.conditional.exercise;

import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		double area; // Declare Area
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Radius Number:");
		
		// Declare radius and Assign Value
		double radius=input.nextDouble();
		
		if(radius < 0)
		{
			// Display Message
			System.out.println("Wrong Input");
		}
		else
		{
			// Compute Area
			area=3.1416 * radius * radius;
			// Display Result
			System.out.println("Area Is: "+area);
		}

	}

}
