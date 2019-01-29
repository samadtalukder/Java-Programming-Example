package com.method;

public class Swap {
    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 25;
        swapNumber(num1,num2);
        swapNumber(15,25);
    }

    private static void swapNumber(int num1,int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" <-> "+num2);
    }
}
