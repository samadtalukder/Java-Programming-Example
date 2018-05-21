package com.byte_;
public class ByteSimple {

	public static void main(String[] args) {
		// 
		byte a,b,c;
		a = 50;
		b = 100;
		c = (byte) (a * b);
		
		int d =(byte) (a * b);
		
		
		byte x = (byte) 258;
		int i =  x;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(x);
		 /*int i;
		    byte y;
		    i = 1024;
		    for(i = 1024; i > 0; i-- ){

		      y = (byte)i;
		      System.out.print(i + " mod 128 = " + i%128 + " also ");
		      System.out.println(i + " cast to byte " + " = " + y);

		    }*/

	}

}
