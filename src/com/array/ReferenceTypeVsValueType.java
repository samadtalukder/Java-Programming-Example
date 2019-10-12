package com.array;

import java.util.Arrays;

public class ReferenceTypeVsValueType {
    public static void main(String[] args) {
        int value = 10;
        int copyValue = value;
        System.out.println("Print Value: " + value);
        System.out.println("Print Copy Value: " + copyValue);
        int[] array = new int[5];
        int[] copyArray = array;
        System.out.println("Print Array Data: "+ Arrays.toString(array));
        System.out.println("Print Copy Array Data: "+ Arrays.toString(copyArray));
        copyArray[0] = 24;
        System.out.println("After change Print Array Data: "+ Arrays.toString(array));
        System.out.println("After change Print Copy Array Data: "+ Arrays.toString(copyArray));
        array[1] = 20;
        System.out.println("After change Print Array Data: "+ Arrays.toString(array));
        System.out.println("After change Print Copy Array Data: "+ Arrays.toString(copyArray));
        modifyArray(array);
        System.out.println("After change Print Array Data: "+ Arrays.toString(array));
        System.out.println("After change Print Copy Array Data: "+ Arrays.toString(copyArray));
    }
    private static void modifyArray(int[] array){
        array[0] = 14;
        array = new int[]{11,12,13,15,16};
    }
}
