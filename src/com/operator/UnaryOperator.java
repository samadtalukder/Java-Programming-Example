package com.operator;

public class UnaryOperator {
    public static void main(String[] args) {
        int preInc = 20;
        int postInc = 25;
        int preDec = 5;
        int postDec = 15;
        int count = 0;
        // pre-increment operator
        count = ++preInc;
        System.out.println("Value of count (++preInc) =" + count);
        // post-increment operator
        count = postInc++;
        System.out.println("Value of count (postInc++) =" + count);
        // pre-decrement operator
        count = --preDec;
        System.out.println("Value of count (--preDec) =" + count);
        // post-decrement operator
        count = postDec--;
        System.out.println("Value of count (postDec--) =" + count);

    }
}
