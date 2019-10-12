package com.date_time;
import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter Seconds: ");
		int seconds=inp.nextInt();
		
		int minutes= seconds / 60;
		int reamingSeconds=seconds % 60;
		System.out.println(minutes+" Minutes reaming "+reamingSeconds+" seconds");
		

	}

}
