package com.string;

public class StringValueOfExample {

	public static void main(String[] args) {
		int iVal = 10;
		float fVal = 20.2f;
		long lVal = 1781763;
		double dVal = 3.1416;
		char chVal = 'S';
		boolean bVal = true;
		Object obj = new String("Hub Java");
		/* convert int to String */
		System.out.println(""+String.valueOf("int to String: "+iVal));
		/* convert float to String */
		System.out.println(""+String.valueOf("float to String: "+fVal));
		/* convert long to String */
		System.out.println(""+String.valueOf("long to String: "+lVal));
		/* convert double to String */
		System.out.println(""+String.valueOf("double to String: "+dVal));
		/* convert char to String */
		System.out.println(""+String.valueOf("char to String: "+chVal));
		/* convert boolean to String */
		System.out.println(""+String.valueOf("boolean to String: "+bVal));
		/* convert Object to String */
		System.out.println(""+String.valueOf("Object to String: "+obj));

	}

}
