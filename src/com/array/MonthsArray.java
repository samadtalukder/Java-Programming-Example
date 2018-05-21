package com.array;
import java.util.Scanner;

public class MonthsArray {
	private static  Scanner input;
	
	public static void main(String[] args) {
		
		String[] months= 
			{
				"January","February","March","April","May",
				"june","July","August","September","October"
			};
		int[] day=
			{
			1,2,3,4,5,6
			};
		System.out.println("Enter a  month number(1 to 12): ");
		
		input=new Scanner(System.in);
		int monthNumber = input.nextInt();
		
		System.out.println("The month is "+months[monthNumber]);
		System.out.println("The day is "+day[monthNumber]);
		/*int[] array = new int[5];
		array[0]=10;
		array[1]=110;
		array[2]=210;
		array[3]=310;
		array[4]=410;
		
		System.out.println(array[0]);*/

	}

}
