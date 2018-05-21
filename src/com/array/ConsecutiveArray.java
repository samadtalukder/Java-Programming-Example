package com.array;
public class ConsecutiveArray {

	public static void main(String[] args) {
		int[] conArray= {1,2,3,4,5};
		int sum = 0;
		int i;
		for(i=1;i<conArray.length;i++) {
			//conArray[i] += conArray[i-1];
			conArray[i] = conArray[i] + conArray[i - 1];
			sum++;
			System.out.println(conArray[i]);
		}
		

	}

}
