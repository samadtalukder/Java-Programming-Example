package com.method.overloading;

public class FeetInchesCentimetersConversion {
    private static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet and inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " Feet " + inches + " inches " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calculateFeetAndInchesToCentimeters(feet, inches);
    }

    public static void main(String[] args) {
        calculateFeetAndInchesToCentimeters(5, 6);
        calculateFeetAndInchesToCentimeters(12);
    }
}
