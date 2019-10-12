package com.array;

import java.util.Scanner;

public class DescendingOrder {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] inputArray = getInputArraySize(5);
        int[] sortedArray = sortData(inputArray);
        printArrayData(sortedArray);

    }

    private static int[] getInputArraySize(int arrSize) {
        int[] array = new int[arrSize];
        System.out.println("Enter " + arrSize + " integer values\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private static void printArrayData(int[] arrayData) {
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println("Element " + i + " data " + arrayData[i]);
        }
    }

    private static int[] sortData(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;

    }
}
