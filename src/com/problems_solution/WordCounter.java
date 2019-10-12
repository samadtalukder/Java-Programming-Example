package com.problems_solution;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = "";
        System.out.println("Please Enter Any String: ");
        myString = input.nextLine();
        int line = 0, letter = 0;
        System.out.println("\nThe Words Are:");
        for (int i = 0; i < myString.length(); i++) {
            char chLetter = myString.charAt(i);
            boolean ch = Character.isWhitespace(chLetter);
            if (ch || myString.length() - 1 == i) {
                System.out.print(chLetter);
                System.out.println();
                letter = myString.length();
                line++;
            } else {
                System.out.print(chLetter);
            }
        }
        System.out.println("\nLines: " + line);
        System.out.println("How Many Words: " + letter);
    }
}
