package com.problems_solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GPACalculation {

	public static void main(String[] args) {
		GPACalculation gpa = new GPACalculation();
		gpa.startInteraction();
	}

	/* Data Model Class */
	public static class Student {
		public String stdName;
		public String major;
		public String numFirstClass;
		public final List<Double> credits = new ArrayList<>();
		public final List<Double> points = new ArrayList<>();
	}

	/* PROPERTIES & CONSTRUCTOR */
	private final Map<String, Double> gradeToScore = new HashMap<>();

	public GPACalculation() {
		gradeToScore.put("A+", 4.00);
		gradeToScore.put("A", 3.75);
		gradeToScore.put("A-", 3.50);
		gradeToScore.put("B+", 3.25);
		gradeToScore.put("B", 3.00);
		gradeToScore.put("B-", 2.75);
		gradeToScore.put("C+", 2.50);
		gradeToScore.put("C", 2.25);
		gradeToScore.put("D", 2.00);
		gradeToScore.put("Fail", 0.00);
	}
	//
	public void startInteraction() {
		System.out.println("GPA Calculator");
		try (Scanner scanner = new Scanner(System.in);){
			Student student = new Student();
			//
			loadStudentInfo(student, scanner);
			//
			loadCreaditsAndPoints(student, scanner, 1);
			//
			double gpa = calculateGPA(student);
			System.out.println(gpa);
		}
	}
	private void loadStudentInfo(Student student, Scanner scanner) {
		System.out.println("Enter Your First Name: ");
		student.stdName = scanner.nextLine();
		System.out.println("Enter Your Major: ");
		student.major = scanner.nextLine();
		System.out.println("Enter the number of your first class: ");
		student.numFirstClass = scanner.nextLine();
	}
	private double calculateGPA(Student student) {
		double totalCredits = getTotal(student.credits);
		double totalPoints = getTotal(student.points);
		double gpa = totalPoints / totalCredits;
		return gpa;
	}
	private double getTotal(List<Double> dbl) {
		double total = 0;
		for(Double d: dbl) {
			total += d;
		}
		return total;
	}
	private void loadCreaditsAndPoints(Student student, Scanner scanner, int classNumber) {
		System.out.println("Please enter the number of credits of the class "+classNumber+" (A Number)");
		double credit = scanner.nextDouble();
		student.credits.add(credit);
		System.out.println("Please enter your grades for the class "+classNumber+" (Capital letters such as A,B+, C-)");
		String grade = scanner.nextLine();
		double gradeValue = 0;
		if (gradeToScore.containsKey(grade)) {
			gradeValue = gradeToScore.get(grade);
		}else {
			System.out.println("Invalid Grade");
		}
		double classTotalPoints = gradeValue * credit;
		student.credits.add(classTotalPoints);
	}
	
}
