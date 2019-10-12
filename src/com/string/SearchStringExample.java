package com.string;
/*
  Java Search String using indexOf Example
  This example shows how we can search a word within a String object using
  indexOf method.
*/
public class SearchStringExample {

	public static void main(String[] args) {
		String str = "Ki kujben?";
		String hello = "avengers infinity war";
		int index = str.indexOf("Ki kujo");
		 /*
	      To search a particular word in a given string use indexOf method.
	      indexOf method. It returns a position index of a word within the string
	      if found. Otherwise it returns -1. 
	    */
		System.out.println(index);
		if (index == -1) {
			System.out.println("Error! Return -1");
		}
		else {
			System.out.println("Found at index: "+index);
		}
		 /*
	      we can also search a word after particular position using 
	      indexOf(String word, int position) method.  
	    */
		int positionIndex = hello.indexOf("in",1);
		System.out.println("Index of : "+positionIndex);
		/*
	      Use lastIndexOf method to search a last occurrence of a word within string.
	    */
		int lastIndex = hello.lastIndexOf("in",11);
		System.out.println("Last occurrence of Hello is at index: "+lastIndex);
	}

}
