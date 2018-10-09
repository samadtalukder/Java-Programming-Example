package com.string.buffer;

public class AppendCodePoint {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Java");
		// Here it appends the CodePoint as 
        // String to the string buffer 
		stringBuffer.appendCodePoint(43);
		System.out.println("appending CodePoint: "+stringBuffer);

	}

}
