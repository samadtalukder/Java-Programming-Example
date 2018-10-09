package com.string.buffer;

public class DeleteCharAt {
	/*
	 * The Java.lang.StringBuffer.deleteCharAt() is a built-in Java method which
	 * removes the char at the specified position in this sequence. So that the
	 * sequence is reduced by 1 char
	 */
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Goal & Foul");
		stringBuffer.deleteCharAt(5);
		System.out.println(stringBuffer);

	}

}
