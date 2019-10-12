package com.string;

public class StringArray {

	public static void main(String[] args) {
		String[] strArray = new String[] {"KKR","MI","SRH","KXIP"};
		String[] strArr = new String[] {"BRA","ARG","GER","AUS"};
		// First declare String array
		String[] strArr2 = new String[3];
		// Now Assign individual String array elements
		strArr2[0] = "Shakib";
		strArr2[1] = "Mandeep";
		strArr2[2] = "Sandeep ";
		// iterate the String array using loop
		for(int i = 0 ; i < strArr.length; i++) {
			System.out.println("String Array Loop: "+strArr[i]);
		}
		//
		System.out.println("String Index[0]: "+strArray[0]);
		System.out.println("String Index[1]: "+strArray[1]);
		System.out.println("String Index[2]: "+strArray[2]);
		System.out.println("String Index[3]: "+strArray[3]);
		//
		System.out.println(""+strArr2[0]);
		System.out.println(""+strArr2[1]);
		System.out.println(""+strArr2[2]);
		
	}

}
