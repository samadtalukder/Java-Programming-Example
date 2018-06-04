package com.problems.solution;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++) {
            	a += b * (int) Math.pow(2,j);
            	System.out.println(a+" ");
            }
            System.out.println();
        }
        in.close();
	}
*/		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum,m;
            sum = a; m = 0;
            
           for(int j = 0; j < n;j++){
               m = (int) (b * Math.pow(2,j)); 
               sum = sum + m; 
               System.out.print(sum + " ");
           }    
           System.out.println(); 
        } 
        in.close();
    }
}
