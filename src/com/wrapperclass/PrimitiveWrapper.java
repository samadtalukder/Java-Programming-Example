package com.wrapperclass;

public class PrimitiveWrapper {

	public static void main(String[] args) {
		Integer i = new Integer(20);
		System.out.println(i);
		modify(i);
		
	}
	public static void modify(Integer in) {
		in += 1;
		System.out.println(in);
	}

}
