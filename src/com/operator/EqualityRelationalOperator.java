package com.operator;

public class EqualityRelationalOperator {
    public static void main(String[] args) {
        int x = 19;
        int y = 20;
        int arr[] = {1, 3, 5};
        int arr2[] = {2, 4, 6};

        System.out.println("x == y =" + (x == y));
        System.out.println("x != y =" + (x != y));
        System.out.println("x > y =" + (x > y));
        System.out.println("x >= y =" + (x >= y));
        System.out.println("x < y =" + (x < y));
        System.out.println("x <= y =" + (x <= y));
        System.out.println("arr == arr2 :" + (arr == arr2));

    }
}
