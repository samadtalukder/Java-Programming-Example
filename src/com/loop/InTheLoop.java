package com.loop;

public class InTheLoop {
    private static final int END = Integer.MAX_VALUE; // 2147483647
    private static final int START = END - 100; //  2147483647 -100 = 2147483547

    public static void main(String[] args) {
        int count = 0;
        for (int i = START; i < END; i++) {
            count++;
            System.out.println(count);
        }
    }
}
