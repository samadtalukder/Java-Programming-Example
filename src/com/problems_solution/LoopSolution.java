package com.problems_solution;

import java.util.Scanner;

public class LoopSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0,b = 0,n = 0;
		System.out.println("Enter Total Number: ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        	System.out.println("A: ");
            a = in.nextInt();
            System.out.println("B: ");
            b = in.nextInt();
            System.out.println("N: ");
            n = in.nextInt();
            //int res = a;
            
            for(int j=0;j<n;j++) {
            	a += b;
            	b*=2;
            	System.out.println(""+a);
            	//System.out.println("");
            	/*
            	res += (Math.pow(2, j) * b);
            	System.out.println("Result: "+Integer.toString(res));
            	*/
            }
            //System.out.println("\n");
        }
        in.close();
	}

}
