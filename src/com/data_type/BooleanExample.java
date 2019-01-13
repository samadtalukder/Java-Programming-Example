package com.data_type;

public class BooleanExample {
    private static boolean defaultValueOfBoolean;

    public static void main(String[] args) {
        System.out.println("Default value of Short: " + defaultValueOfBoolean);
        boolean test = 10 > 2 ? true : false;
        boolean anothertest = 10 < 2;
        System.out.println(test);
        System.out.println(anothertest);
    }
}
