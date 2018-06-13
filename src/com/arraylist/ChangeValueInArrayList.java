package com.arraylist;

import java.util.ArrayList;

public class ChangeValueInArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<Integer> al = new ArrayList<>();
		aList.add("Bangladesh");
		aList.add("India");
		aList.add("Pakistan");
		aList.add("Srilanka");
		System.out.println(aList);
		aList.set(1, "Nepal");
		System.out.println(aList);
		//
		al.add(100);
		al.add(200);
		System.out.println(al);
		al.set(1, 300);
		System.out.println(al);

	}

}
