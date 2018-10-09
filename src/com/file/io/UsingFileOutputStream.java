package com.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class UsingFileOutputStream {

	public static void main(String[] args) {
		try {
			File file = new File("/home/virus_men/testJavaFile.txt");
			FileOutputStream fOutputStream = new FileOutputStream(file);
			BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(fOutputStream));
			bWriter.write("Write Somthing on this file.....");
			bWriter.newLine();
			bWriter.write("How are you ?");
			bWriter.newLine();
			bWriter.close();
		}catch(FileNotFoundException fileNotFound) {
			// Error when file  not found
			fileNotFound.printStackTrace();
		}catch(IOException io) {
			// Error when writing to the file
			io.printStackTrace();
		}
	}

}
