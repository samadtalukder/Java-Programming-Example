package com.conditional;

public class FixError {

	public static void main(String[] args) {
		int i = 0;
		int j= i + 1;
		int k= (int) 100.0;
		
		int x,y,z;
		x=1;
		y=x+1;
		z=y;
		System.out.println(z);
		
		System.out.println("J is= "+j+"\n"+"K is= "+k);

	}

}
