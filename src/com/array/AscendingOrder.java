package com.array;

import java.util.Scanner;

public class AscendingOrder {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] inputArray = getInputArraySize(5);
        int[] sortedArray = sortData(inputArray);
        printArrayData(sortedArray);

    }

    private static int[] getInputArraySize(int array) {
        int[] arrayElement = new int[array];
        System.out.println("Enter " + array + " integer values\n");
        for (int i = 0; i < arrayElement.length; i++) {
            arrayElement[i] = input.nextInt();
        }
        return arrayElement;
    }

    private static void printArrayData(int[] arrayData) {
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println("Element " + i + " data " + arrayData[i]);
        }
    }

    private static int[] sortData(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
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
