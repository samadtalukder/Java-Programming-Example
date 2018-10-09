package com.problems.solution;

import java.util.Scanner;

//imports scanner
public class Part1 {
	enum LetterGrades {
		A_PLUS("A+", 4.33), A("A", 4), A_MINUS("A-", 3.67), B_PLUS("B+", 3.33), B("B", 3), B_MINUS("B-", 2.67),
		C_PLUS("C+", 2.33), C("C", 2), C_MINUS("C-", 1.67), D("D", 1), F("F", 0), FX("FX", 0);

		private final String grade_;
		private final double value_;

//CONSTRUCTOR
		private LetterGrades(String grade, double value) {
			grade_ = grade;
			value_ = value;
		}

		public static double getValueFromGrade(String grade) {
			for (LetterGrades letterGrade : LetterGrades.values()) {
				if (letterGrade.grade_.equals(grade)) {
					return letterGrade.value_;
				}
			}
			System.out.println("Invalid grade");
			return 0.0;
		}
	}

	public static void main(String args[]) {

		String grade = "";

		double credit1;
		double credit2;
		double credit3;
		double credit4;
		double gradeValue = 0;
//Creates 4 credits
		double totPtsClass1 = 0;
		double totPtsClass2 = 0;
		double totPtsClass3 = 0;
		double totPtsClass4 = 0;
		double totPts = 0;
		double totalCredits = 0;
		double gpa;
//Points in classes, GPA
		System.out.println("GPA Calculator!");
		String message;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		message = scan.nextLine();
		System.out.println("Enter your last name: ");
		message = scan.nextLine();
		System.out.println("Enter your major: ");
		message = scan.nextLine();
		System.out.println("Enter the number of your first class: ");
		message = scan.nextLine();

		Scanner console = new Scanner(System.in);

		System.out.println("Please enter the number of credits of the class 1 (A number)");
		credit1 = console.nextDouble();
		System.out.println("Please enter your grades for the class 1(Capital letters such as A,B+, C-)");
		grade = console.next();

		gradeValue = LetterGrades.getValueFromGrade(grade);
		totPtsClass1 = gradeValue * credit1;

		System.out.println("Please enter the number of credits of the class 2 (A number)");
		credit2 = console.nextDouble();
		System.out.println("Please enter your grades for the class 2 (Capital letters such as A,B+, C-)");
		grade = console.next();

		gradeValue = LetterGrades.getValueFromGrade(grade);
		totPtsClass2 = gradeValue * credit1;

		System.out.println("Please enter the number of credits of the class 3 (A number)");
		credit3 = console.nextDouble();
		System.out.println("Please enter your grades for the class 3 (Capital letters such as A,B+, C-)");
		grade = console.next();

		gradeValue = LetterGrades.getValueFromGrade(grade);
		totPtsClass3 = gradeValue * credit1;

		System.out.println("Please enter the number of credits of the class 4 (A number)");
		credit4 = console.nextDouble();
		System.out.println("Please enter your grades for the class 4 (Capital letters such as A,B+, C-)");
		grade = console.next();

		gradeValue = LetterGrades.getValueFromGrade(grade);
		totPtsClass4 = gradeValue * credit1;

		totPts = totPtsClass1 + totPtsClass2 + totPtsClass3 + totPtsClass4;
		totalCredits = credit1 + credit2 + credit3 + credit4;
		gpa = totPts / totalCredits;

		System.out.printf("Your GPA is: %.2f\n", +gpa);
	}
}
