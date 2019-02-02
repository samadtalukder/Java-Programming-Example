package com.array;

import java.util.Scanner;

public class FindMinimum {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Count: ");
        int countNum = scanner.nextInt();
        int[] readInputNumbers = getInputNumbers(countNum);
        int findMinimum = findMin(readInputNumbers);
        System.out.println("Minimum Number: " + findMinimum);
    }

    private static int[] getInputNumbers(int countNum) {
        int[] array = new int[countNum];
        System.out.println("Enter Number: ");
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}
