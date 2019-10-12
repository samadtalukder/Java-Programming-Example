package com.method;

public class ReturnMultipleValues {
    private static int[] getSumAndSub(int num1, int num2) {
        int[] ans = new int[4];
        ans[0] = num1 + num2;
        ans[1] = num1 - num2;

        return ans;
    }

    public static void main(String[] args) {
        int[] ans = getSumAndSub(20,10);
        System.out.println("Sum: "+ans[0]);
        System.out.println("Sub: "+ans[1]);

    }
}
