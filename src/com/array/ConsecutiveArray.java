package com.array;
public class ConsecutiveArray {

	public static void main(String[] args) {
		int[] conArray= {2,2,3,4,5};
		
		for(int i=1;i<conArray.length;i++) {
			//conArray[i] += conArray[i-1];
			conArray[i] = conArray[i] + conArray[i - 1];
			System.out.println(conArray[i]);
		}
	}

}
