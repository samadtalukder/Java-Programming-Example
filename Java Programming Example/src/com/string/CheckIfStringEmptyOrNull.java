package com.string;

public class CheckIfStringEmptyOrNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNull = null;
		String strEmpty = "";
		if (isNullOrEmpty(strNull)) {
			System.out.println("First string is null or empty.");
		}
		else {
			System.out.println("First string is not null or empty.");
		}
		if (isNullOrEmpty(strEmpty)) {
			System.out.println("Second string is null or empty.");
		}
		else {
			System.out.println("Second string is not null or empty.");
		}

	}
	public static boolean isNullOrEmpty(String str) {
		if (str != null && !str.isEmpty()) {
			return false;
		}
		return true;
	}

}
