package com.input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerVsBufferedReader {

	public static void main(String[] args) {
		// Using Scanner to read user input
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("You can use Scanner to read user input");
		System.out.println("=======================================");
		System.out.println("Please enter your Name: ");
		String name = scanner.nextLine();
		System.out.println("You have enterd: " + name);
		System.out.println("Please enter your Age: ");
		int age = scanner.nextInt();
		System.out.println("You have enterd: " + age);
		scanner.close();*/
		// Using BufferedReader to read a file
		System.out.println("=======================================");
		System.out.println("You can use BufferedReader to read a file");
		System.out.println("=======================================");
		FileReader fileReader;
		try {
			fileReader = new FileReader("/home/virus_men/input.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			System.out.println("File contains following lines");
			String line = bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			fileReader.close();
			
		}catch(FileNotFoundException file) {
			file.getMessage();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

}
