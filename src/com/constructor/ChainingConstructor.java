package com.constructor;

public class ChainingConstructor {
    ChainingConstructor() {
        this(5);
        System.out.println("Default Constructor");
    }

    ChainingConstructor(int num) {
        this(5, 15);
        System.out.println(num);
    }

    ChainingConstructor(int num1, int num2) {
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        new ChainingConstructor();
    }
}
