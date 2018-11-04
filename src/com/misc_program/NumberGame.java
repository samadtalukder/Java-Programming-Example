package com.misc_program;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		//
		int randomNumber = (int) (Math.random() * 100 +1);
		boolean hasWon = false;
		//
		System.out.println("I have randomely chosen a number between 1 to 100");
		//System.out.println("Try to guess it");
		//
		Scanner sc = new Scanner(System.in);
		//
		for(int i= 5;i > 0;i--) {
			System.out.println("You have "+i+" guess left. Chose again: ");
			int guess = sc.nextInt();
			//
			if (randomNumber < guess) {
				System.out.println("It is smaller than "+guess+" .");
			}
			else if (randomNumber > guess) {
				System.out.println("It is greater than "+guess+" .");
			}
			if (randomNumber == guess) {
				hasWon = true;
				break;
			}
		}
		if (hasWon) {
			System.out.println("Correct...You Win!!!");
		}
		else {
			System.out.println("Game Over...You Lose!!!");
			System.out.println("The number was : "+randomNumber);
		}

	}

}
