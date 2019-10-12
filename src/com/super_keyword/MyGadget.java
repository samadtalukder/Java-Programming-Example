package com.super_keyword;

public class MyGadget extends MyLaptop{
	public MyGadget() {
		super();
		// System.out.println("Mobile , SmartWatch is my another lovely gadget");
	}
	public MyGadget(String str) {
		System.out.println(str+" is my another lovely gadget ");
	}

	public static void main(String[] args) {
		MyGadget myGadget = new MyGadget("Smartwatch");

	}

}
