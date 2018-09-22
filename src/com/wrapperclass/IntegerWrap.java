package com.wrapperclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntegerWrap {

	public static void main(String[] args) {
		/*
		// asign integer to Integer variable
		Integer in = 45;
		// Integer instance passing int
		Integer inte = new Integer(40);
		// Integer instance passing string
		Integer intStr = new Integer("10");
		// print
		System.out.println(in);
		System.out.println(inte);
		System.out.println(intStr);

		// Integer has constants such as TYPE
		System.out.println("Integer.TYPE : "+Integer.TYPE);
		System.out.println("Integer.MAX_VALUE : "+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE : "+Integer.MIN_VALUE);
		System.out.println("Integer.SIZE : "+Integer.SIZE);
		System.out.println("Integer.BYTES : "+Integer.BYTES);
		// Converting Integer to different types
		Integer conTyp = 778;
		byte bt = conTyp.byteValue();
		int it = conTyp.intValue();
		// char ch = conTyp.intValue();
		double db = conTyp.doubleValue();
		float fl = conTyp.floatValue();
		String st = conTyp.toString();
		// print converting Integer to differnet values
		System.out.println(bt);
		System.out.println(it);
		System.out.println(db);
		System.out.println(fl);
		System.out.println(st);
		// Useful methods
		// To convert String to Integer, use valueOf() method
		String st2 = "60";
		Integer val = Integer.valueOf(st2);
		String st3 = "779";
		Integer inti2 = new Integer(st3);
		System.out.println("String Converted Integer:"+inti2);
		System.out.println(inti2);
		st3 = "-99";
		inti2 = Integer.parseInt(st3);
		System.out.println("String Converted Integer:"+inti2);
		
		System.out.println("String To Integer: "+val);
		// For two numbers comparison, use compare(), max() and min() methods.
		System.out.println("Integer.min :"+Integer.min(10, 20));
		System.out.println("Integer.max :"+Integer.max(10, 20));
		System.out.println("Integer.compare :"+Integer.compare(10, 10));
		// create int to Integer object
		int num = 10;
		String str = "20";
		Integer inti = new Integer(num);
		Integer strInt = new Integer(str);
		System.out.println(inti);
		System.out.println(strInt);
		// convert integer string to binary value
		Integer biInt = new Integer(30);
		System.out.println("decimal to binary: "+Integer.toBinaryString(biInt));
		System.out.println("decimal to hexa: "+Integer.toHexString(15));
		System.out.println("decimal to octal: "+Integer.toOctalString(20));
		
		String biString = Integer.toBinaryString(biInt);
		System.out.println("integer string to binary value: "+biString);
		// convert binary value to integer value
		String binary = "1101001";
		Integer ing = Integer.parseInt(binary, 2);
		System.out.println(ing);
		// convert hexadecimal value to integer value
		String hexa = "Ff23";
		Integer inh = Integer.parseInt(hexa, 16);
		System.out.println("hexadecimal to integer"+inh);
		// convert octal value to integer value
		String octal = "7776";
		Integer inO = Integer.parseInt(octal, 8);
		System.out.println("octal to integer"+inO);
		// use int type with collection classes such as ArrayList and Set
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(19);
		list.add(5);
		list.add(45);
		System.out.println("before sort :"+list);
		list.sort(Comparator.naturalOrder());
		System.out.println("After sort :"+list);
		*/
		int b = 55; 
        String bb = "45"; 
  
        // Construct two Integer objects 
        Integer x = new Integer(b); 
        Integer y = new Integer(bb); 
  
        // toString() 
        System.out.println("toString(b) = " + Integer.toString(b)); 
  
        // toHexString(),toOctalString(),toBinaryString() 
        // converts into hexadecimal, octal and binary forms. 
        System.out.println("toHexString(b) =" + Integer.toHexString(b)); 
        System.out.println("toOctalString(b) =" + Integer.toOctalString(b)); 
        System.out.println("toBinaryString(b) =" + Integer.toBinaryString(b)); 
  
        // valueOf(): return Integer object 
        // an overloaded method takes radix as well. 
        Integer z = Integer.valueOf(b); 
        System.out.println("valueOf(b) = " + z); 
        z = Integer.valueOf(bb); 
        System.out.println("ValueOf(bb) = " + z); 
        z = Integer.valueOf(bb, 6); 
        System.out.println("ValueOf(bb,6) = " + z); 
  
        // parseInt(): return primitive int value 
        // an overloaded method takes radix as well 
        int zz = Integer.parseInt(bb); 
        System.out.println("parseInt(bb) = " + zz); 
        zz = Integer.parseInt(bb, 6); 
        System.out.println("parseInt(bb,6) = " + zz); 
  
        // getInteger(): can be used to retrieve 
        // int value of system property 
        int prop = Integer.getInteger("sun.arch.data.model"); 
        System.out.println("getInteger(sun.arch.data.model) = " + prop); 
        System.out.println("getInteger(abcd) =" + Integer.getInteger("abcd")); 
  
        // an overloaded getInteger() method 
        // which return default value if property not found. 
        System.out.println("getInteger(abcd,10) =" + Integer.getInteger("abcd", 10)); 
  
        // decode() : decodes the hex,octal and decimal 
        // string to corresponding int values. 
        String decimal = "45"; 
        String octal2 = "005"; 
        String hex = "0x0f"; 
  
        Integer dec = Integer.decode(decimal); 
        System.out.println("decode(45) = " + dec); 
        dec = Integer.decode(octal2); 
        System.out.println("decode(005) = " + dec); 
        dec = Integer.decode(hex); 
        System.out.println("decode(0x0f) = " + dec); 
          
        //rotateLeft and rotateRight can be used 
        //to rotate bits by specified distance 
        int valrot = 2; 
        System.out.println("rotateLeft(0000 0000 0000 0010 , 2) =" +  
                                    Integer.rotateLeft(valrot, 2)); 
        System.out.println("rotateRight(0000 0000 0000 0010,3) =" +  
                                    Integer.rotateRight(valrot, 3)); 
	}

}
