package com.inheritance.super_;
public class B extends A{
	int i;
	public B(int a,int b) {
		super.i = a;
		i = b;
	}
	void show() {
		System.out.println("i in super class"+super.i);
		System.out.println("i in sub class"+i);
	}
}
