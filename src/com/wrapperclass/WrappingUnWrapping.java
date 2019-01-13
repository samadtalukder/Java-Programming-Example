package com.wrapperclass;

public class WrappingUnWrapping {

	public static void main(String[] args) {
		// byte data type
		byte byt = 1;
		// wrapping around Byte object
		Byte bytObj = byt;
		// int data type
		int intData = 20;
		// wrapping around Integer object
		Integer intObj = intData;
		// float data type
		float flotData = 18.6f;
		// wrapping around Float object
		Float flotObj = flotData;
		// double data type
		double dblData = 260.60;
		Double dblObj = dblData;
		// printing the values from objects
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println(byt);
		System.out.println("Byte object byteobj: " + bytObj);
		System.out.println("" + intData);
		System.out.println("Integer object intobj: " + intObj);
		System.out.println("Float object floatobj: " + flotObj);
		System.out.println(flotData);
		System.out.println(dblData);
		System.out.println("Double object doubleobj: " + dblObj);
		// objects to data types (retrieving data types from objects)
		// unwrapping objects to primitive data types
		Byte bt = bytObj;
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value: "+bt);
	}

}
