package com.arraylist;

import java.util.ArrayList;

public class GetSizeArrayListBeforeAndAfter {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		System.out.println("Initial Size of ArrayList: "+arrayList.size());
		
		arrayList.add("Bangla");
		arrayList.add("English");
		arrayList.add("Spanish");
		arrayList.add("Arabic");
		
		System.out.println("Contents of ArrayList: "+arrayList);
		System.out.println("Size of ArrayList after additions: "+arrayList.size());
		
		arrayList.remove(2);
		arrayList.remove("English");
		System.out.println("Afetr Delate of ArrayList: "+arrayList);
		System.out.println("Size of ArrayList after remove:"+arrayList.size());
	}

}
