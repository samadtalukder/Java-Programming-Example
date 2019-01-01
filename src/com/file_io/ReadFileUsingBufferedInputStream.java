package com.file_io;

import java.io.*;

/*
	How to read a file using available and read
	methods of Java BufferedInputStream.
*/
public class ReadFileUsingBufferedInputStream {
    public static void main(String[] args) {
        File file = new File("/home/virus_men/testJavaFile.txt");
        BufferedInputStream bufferedInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            /*
             * BufferedInputStream has ability to buffer input into
             * internal buffer array.
             *
             * available() method returns number of bytes that can be
             * read from underlying stream without blocking.
             */
            while (bufferedInputStream.available() > 0) {
                System.out.print((char) bufferedInputStream.read());
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File Not Found: " + fe);
        } catch (IOException ie) {
            System.out.println("Exception while reading the file: " + ie);
        } finally {
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing the stream: " + e);
            }
        }
    }
}
