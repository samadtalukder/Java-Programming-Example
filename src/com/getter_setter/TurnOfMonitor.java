package com.getter_setter;

import java.util.Scanner;

public class TurnOfMonitor {
	public double sleepTime;

	public void setSleepTime(double sleepTime) {
		this.sleepTime = sleepTime;
	}

	public double getSleepTime() {
		return sleepTime;
	}

	public static void main(String[] args) {
		System.out.println("Enter Your Time After Turn Off Monitor: ");
		Scanner scanner = new Scanner(System.in);
		double giveTime = scanner.nextDouble();
		TurnOfMonitor turnOfMonitor = new TurnOfMonitor();
		turnOfMonitor.setSleepTime(giveTime);
		double recieveTime = turnOfMonitor.getSleepTime();
		if (recieveTime > 2.00 ) {
			System.out.println("Turning off your monitor....");
		}else {
			System.out.println("Keep it awake..");
		}
		scanner.close();

	}

}
