package com.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {66, 55, 33, 5};
        System.out.println("Array: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reverse Array: " + Arrays.toString(array));

    }

    private static void reverseArray(int[] array) {
        int mixIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[mixIndex - i];
            array[mixIndex - i] = temp;
        }
    }
}
