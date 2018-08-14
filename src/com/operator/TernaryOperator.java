package com.operator;

public class TernaryOperator {

	public static void main(String[] args) {
		int rank = 4;
		String status;
		status = (rank != 1)?"Done":"Pending";
		System.out.println(status);
	}

}
