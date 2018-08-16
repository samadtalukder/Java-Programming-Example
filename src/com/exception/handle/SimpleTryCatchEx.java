package com.exception.handle;

public class SimpleTryCatchEx {

	public static void main(String[] args) {
		try {
			for(int i=10;i>=0;i--) {
				System.out.println(i/0);
			}
		}catch(ArithmeticException ar) {
			System.out.println("Exception Message:"+ar.getMessage());
			//ar.printStackTrace();
		}
		System.out.println("After Loop");

	}

}
