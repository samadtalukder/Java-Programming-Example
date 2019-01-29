package com.misc_program;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(0);
    }

    private static int checkNumber(double number) {
        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
        /*else if (number == 0) {
            System.out.println("Zero");
        }*/
        return 0;
    }
}
