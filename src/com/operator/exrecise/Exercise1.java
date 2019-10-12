package com.operator.exrecise;

public class Exercise1 {
    public static void main(String[] args) {
        int result = 8 + 3;
        System.out.println("8+3= " + result);
        int previousResult = result;
        result -= 2;
        System.out.println(previousResult + "-2= " + result);
        previousResult = result;
        result *= 5;
        System.out.println(previousResult + "*5= " + result);
        previousResult = result;
        result /= 5;
        System.out.println(previousResult + "/5= " + result);
        previousResult = result;
        result %= 2;
        System.out.println(previousResult+"%2= "+result);
        result += 1;
        System.out.println("+1= "+result);
        result++;
        System.out.println("=++ "+result);
        ++result;
        System.out.println("++= "+result);
        boolean isAlien = false;
        if (!isAlien){
            System.out.println("It is not a alien");
        }

    }
}
