package com.object;

public class SwapObject {
    String str;

    public SwapObject(String str) {
        this.str = str;
    }

    public static void swap(SwapObject swObj1, SwapObject swObj2) {
        String temp = swObj1.str;
        swObj1.str = swObj2.str;
        swObj2.str = temp;

    }

    public static void main(String[] args) {
        SwapObject swObject1 = new SwapObject("HEllo");
        SwapObject swObject2 = new SwapObject("Hllo");

        swap(swObject1, swObject2);
        System.out.println("" + swObject1.str);
        System.out.println("" + swObject2.str);
    }

}
