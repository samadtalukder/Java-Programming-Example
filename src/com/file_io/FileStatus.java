package com.file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileStatus {

	public static void main(String[] args) throws IOException {
		/*
		 * if (args.length == 0) { System.err.println("Usage: FileStatus filename");
		 * System.exit(1); }
		 */
		// create a new file
		File file = new File("/home/virus_men/testJavaFile.txt");
		// check create a new file
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.err.println("Sorry!File is already exist");
		}
		// write file
		FileWriter fileWrite = new FileWriter(file);
		fileWrite.write("Hello Java World");
		fileWrite.close();
		String fileParent = file.getParent();
		System.out.println("File Parent: " + fileParent);
		String filePath = file.getCanonicalPath();
		System.out.println("" + filePath);
		Date date = new Date(file.lastModified());
		System.out.println("File Modify: " + date);
		//System.out.println("File Length: "+file.length()+" bytes");
		if (file.canRead()) {
			System.out.println("File is readable");
		}
		if (file.canWrite()) {
			System.out.println("File is writable");
		}
		if (file.isFile()) {
			System.out.println("File Length: "+file.length()+" bytes");
		}else if (file.isDirectory()) {
			System.out.println("Its a directory");
		}else {
			System.out.println("I dunno! Neither a file nor a directory!");
		}
		
		// rename file
		/* file.renameTo(new File("/home/virus_men/testFile.txt")); */
		// delete file
		/*
		file.delete();
			if (file.delete()) {
				System.out.println("File deleted");
			}else {
				System.out.println("not deleted");
			}
		*/

	}
	
}
