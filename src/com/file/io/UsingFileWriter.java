package com.file.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) {
		try {
			FileWriter fileWrite = new FileWriter("/home/virus_men/testJavaFile.txt");
			fileWrite.write("Java Course is designed for students and professionals who want to be a Java Developer");

			fileWrite.close();
		} catch (FileNotFoundException fileNotFound) {
			// Error when file not found
			fileNotFound.printStackTrace();
		} catch (IOException io) {
			// Error when writing to the file
			io.printStackTrace();
		}
	}

}
