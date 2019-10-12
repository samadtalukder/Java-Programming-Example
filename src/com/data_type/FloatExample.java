package com.data_type;

public class FloatExample {
    private static float defaultValueOfFloat;

    public static void main(String[] args) {
        float flt = 65.22f;
        float castfloat = (float) 99.99;
        float q = 506.12789f;

        System.out.println("Print Float Value: " + flt);
        System.out.println("Print Cast Float Value: " + castfloat);
        System.out.println("Print Cast Float Value: " + q);
        System.out.println("Default value of Float: " + defaultValueOfFloat);
        System.out.println("Maximum value of Float: " + Float.MAX_VALUE);
        System.out.println("Minimum value of Float : " + Float.MIN_VALUE);


    }
}
