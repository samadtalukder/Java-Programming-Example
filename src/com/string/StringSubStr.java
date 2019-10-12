package com.string;

public class StringSubStr {

	public static void main(String[] args) {
		String robiNumber = "01892066848";
		String airtelNumber = "01692066848";
		if(robiNumber.substring(0, 2).contains("018")||airtelNumber.substring(0, 3).contains("016")) {
			System.out.println("Show Something");
		}
		else {
			System.out.println("Other Operator");
		}

	}

}
