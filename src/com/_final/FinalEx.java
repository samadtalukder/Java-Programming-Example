package com._final;

public class FinalEx {
    // final variable direct initialize
    final int NUM = 5;
    // blank final variable
    // final int CAPACITY;

    // final static variable direct initialize
    static final double PI = 3.141592;

    public static void main(String[] args) {
        int arr[] = {2,1,5,6};
        for (final int i:arr){
            System.out.println(i);
        }
    }
}
