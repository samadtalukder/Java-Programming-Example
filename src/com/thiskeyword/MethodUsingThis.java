package com.thiskeyword;

public class MethodUsingThis {
	String stdName;
	int stdRollNo;
	double stdTotalMarks;

	public MethodUsingThis(String stdName, int stdRollNo, double stdTotalMarks) {
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdTotalMarks = stdTotalMarks;
	}

	public String getStdName() {
		return this.stdName;
	}

	public int getStdRollNo() {
		return this.stdRollNo;
	}

	public double getStdTotalMarks() {
		return this.stdTotalMarks;
	}
	public void displayStudentInfo() {
		System.out.println("The Student Details \n");
		System.out.println("Student Name: "+this.stdName);
		System.out.println("Student Roll No: "+this.stdRollNo);
		System.out.println("Student Total Marks: "+this.stdTotalMarks);
	}
	public static void main(String[] args) {
		MethodUsingThis mThis = new MethodUsingThis("Tamim Khan", 9, 90.89);
		mThis.displayStudentInfo();
	}

}
