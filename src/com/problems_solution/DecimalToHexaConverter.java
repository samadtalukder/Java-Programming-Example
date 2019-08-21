package com.problems_solution;

import java.util.Scanner;

public class DecimalToHexaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Decimal Number: ");
        int num = input.nextInt();
        // Store reminder
        int reminder;
        // Store Result
        //StringBuilder result = new StringBuilder();
        String result="";
        // Digits in hexadecimal number system
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            reminder = num % 16;
            result = hexa[reminder]+result;
            //result.insert(0, hexa[reminder]);
            num /= 16;
        }
        System.out.println("Decimal to hexadecimal: " + result);
    }
}
