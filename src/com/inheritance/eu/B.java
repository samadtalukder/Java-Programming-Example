package com.inheritance.eu;
public class B extends A{
	int k;
	@Override
	void showOutput() {
		// TODO Auto-generated method stub
		//super.showOutput();
		System.out.println("i= "+i+" j= "+j+" k= "+k);
	}
	void sum() {
		System.out.println("Sum= "+(i+j+k));
	}
}
