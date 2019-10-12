package com.this_keyword;

public class LocalGlobalVariablesUsingThis {
	int num = 100;
	public void show() {
		int num = 200;
		System.out.println("The value of (Local Variable) is :"+num);
		System.out.println("The value of (Global Variable) is :"+this.num);
	}
	public static void main(String[] args) {
		LocalGlobalVariablesUsingThis lThis = new LocalGlobalVariablesUsingThis();
		lThis.show();
	}

}
