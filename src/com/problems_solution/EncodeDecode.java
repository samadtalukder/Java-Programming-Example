package com.problems_solution;

import java.util.Base64;

public class EncodeDecode {
    public static void main(String[] args) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode("Ql!BefW");
            System.out.println(new String(decodedBytes));
        }catch (IllegalArgumentException il){
            System.out.println("");
        }

    }
}
