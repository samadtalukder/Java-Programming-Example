package com.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOWithBufferReader {

	public static void main(String[] args) throws IOException{
		// constants PI value
		final double PI = 3.1416;
		// Enter data using BufferReader
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the radius: ");
		String input = bufferedReader.readLine();
		// int radius = Integer.parseInt(input);
		double radius = Double.parseDouble(input);
		double area = PI * radius * radius;
		System.out.println(area);
		/*
		 try {
			// Reading data using readLine
			System.out.println("Enter String Data Input: ");
			String readData = bufferedReader.readLine();
			System.out.println("Enter Integer Data Input: ");
			int intData = Integer.parseInt(bufferedReader.readLine());
			// Printing the read line
			System.out.println("Print Input Value: "+readData +" , ok");
			System.out.println(intData);
		} catch (IOException e) {
			e.printStackTrace();
		}catch(NumberFormatException num) {
			num.printStackTrace();
		}
		*/
	}

}
