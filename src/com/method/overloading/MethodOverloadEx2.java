package com.method.overloading;

public class MethodOverloadEx2 {
	public void method(String str) {
		System.out.println(str);
	}
	public void method(String st,int in) {
		System.out.println(""+st+" "+in);
	}
	public void method(String sr,int i,double db) {
		System.out.println(""+sr+" "+i+" "+db);
	}
	public static void main(String[] args) {
		MethodOverloadEx2 mEx2 = new MethodOverloadEx2();
		mEx2.method("Overload Method 1");
		mEx2.method("Overload Method 2", 2);
		mEx2.method("Overload Method 3", 3, 32.32);
	}

}
