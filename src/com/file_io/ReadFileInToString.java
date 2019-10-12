package com.file_io;

import java.io.*;

/*  How to read a file content into a Sting
    object using available and read methods of Java
    BufferedInputStream.
*/
public class ReadFileInToString {
    public static void main(String[] args) {
        // create file object
        File file = new File("/home/virus_men/testJavaFile.txt");
        BufferedInputStream bIO = null;
        try {
            // create FileInputStream object
            FileInputStream fileInputStream = new FileInputStream(file);
            //create object of BufferedInputStream
            bIO = new BufferedInputStream(fileInputStream);
            //create a byte array
            byte[] contents = new byte[1024];
            int bytesRead = 0;
            String strFileContents;
            while ((bytesRead = bIO.read(contents)) != -1) {
                strFileContents = new String(contents, 0, bytesRead);
                System.out.println("Read File: "+strFileContents);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File Not Found: " + fileNotFoundException);
        } catch (IOException ie) {
            System.out.println("Exception while reading the file: " + ie);
        } finally {
            //close the BufferedInputStream using close method
            try {
                if (bIO != null) {
                    bIO.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing the stream: " + e);
            }
        }
    }
}
