package com.operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        // num1 = 5 -> 101 (In Binary)
        int num1 = 5;
        // num2 = 7 -> 111 (In Binary)
        int num2 = 7;
        /*
        Bitwise OR operation of num1 & num2
          101
        | 111
        -----------
          111 (7) (In Decimal)
        */
        System.out.println("num1 | num2: " + (num1 | num2));
        /*
        Bitwise AND operation of num1 & num2
          101
        & 111
        -----------
          101 (5) (In Decimal)
        */
        System.out.println("num1 & num2: " + (num1 & num2));
        /*
        Bitwise XOR operation of num1 & num2
          101
        ^ 111
        -----------
          010 (5) (In Decimal)
        */
        System.out.println("num1 ^ num2: " + (num1 ^ num2));
    }

}
