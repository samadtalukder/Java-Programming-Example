package com.collection_frameworks.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysExample {
    public static void main(String[] args) {
        /*Ascending Order*/
        int[] array = {23, 2, 5, 6, 8};
        System.out.println("Representation of array is: " + Arrays.toString(array));
        System.out.println("Before Sorting");
        for (int sort : array) {
            System.out.println(sort);
        }

        Arrays.sort(array);
        System.out.println("After Sorting");
        for (int afterSort : array) {
            System.out.println(afterSort);
        }
        /*Descending Order*/
        // Arrays.sort accept wrapper array in the first argument not primitive
        // Arrays.sort(array, Collections.reverseOrder());
        Integer[] numArray = {23, 2, 5, 6, 8};
        System.out.println("Before Sorting");
        for (int sort : numArray) {
            System.out.println(sort);
        }

        Arrays.sort(numArray, Collections.reverseOrder());
        System.out.println("After Sorting");
        for (int afterSort : numArray) {
            System.out.println(afterSort);
        }
        // sorts the specified range of the specified array
        int[] sortArrayRange = {5, 3, 2, 1, 7};
        System.out.println("Before Sorting");
        for (int sort : sortArrayRange) {
            System.out.println(sort);
        }

        Arrays.sort(sortArrayRange, 1, 3);
        System.out.println("After sorted values(1 to 3)");
        for (int afterSort : sortArrayRange) {
            System.out.println(afterSort);
        }
        // The specified int value to each element of the specified array of ints.
        int[] intValue = new int[]{4, 7, 9};
        Arrays.fill(intValue, 4);
        System.out.println("Fill: " + Arrays.toString(intValue));
        // the array to be filled fromIndex the index of the first element to be filled with the specified value
        // toIndex the index of the last element to be filled with the specified value
        int[] intSpecificValue = new int[]{4, 7, 9, 5, 8};
        Arrays.fill(intSpecificValue, 1, 4, 2);
        System.out.println("Fill FromIndex To LastIndex: " + Arrays.toString(intSpecificValue));
        // Two array references are considered equal if both are null
        int[] arr1 = new int[] { 10, 12, 5, 6 };
        int[] arr2 = new int[] { 10, 12, 5, 6 };
        boolean checkArrayEqual = Arrays.equals(arr1,arr2);
        System.out.println("arr1 and arr2 equal: "+checkArrayEqual);
    }
}
