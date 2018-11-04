package com.misc_program;
import java.util.Scanner;

public class BMICalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create scanner
        Scanner input = new Scanner(System.in);
      //declare variables
        double weight;
        int feet;
        int inches;
      //prompt user
        System.out.println("Enter Your Weight: ");
        weight = input.nextDouble();
        System.out.println("Enter Your Feet: ");
        feet = input.nextInt();
        System.out.println("Enter Your Inches: ");
        inches = input.nextInt();
        //convert measurements
        double weightInKilos = weight * 0.453592;
        double heightInMeters = (((feet * 12 ) + inches) * 0.254);
        //double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
        double bmi=((weightInKilos/(heightInMeters * heightInMeters))* 100);
        
      
        //display output
        System.out.println("Your BMI is: " + bmi);
      //interpret BMI
        if (bmi > 30) {
        	System.out.print("Obese");
		}
        else if (bmi >= 25 && bmi < 30) {
            System.out.print("Overweight");
        }
        else if((bmi >= 18.5) && (bmi <25)) {
        	System.out.print("Normal");
        }
        else if (bmi < 18.5 ) {
            System.out.print("Underweight");
        }
        input.close();
        
	}

}
