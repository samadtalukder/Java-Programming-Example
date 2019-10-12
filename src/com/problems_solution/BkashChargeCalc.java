package com.problems_solution;

import java.util.Scanner;

public class BkashChargeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double bkashVat = 1.85;
		double bkashAppVat = 1.50;
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("Press-> 1 For bkash Cash Out Charge From Agent");
			System.out.println("Press-> 2 For bkash Cash Out Charge From App");
			System.out.println("---------------------------------------------");
			System.out.println("Your Choice: ");
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("You Choice: bkash Cash Out Charge From Agent");
				System.out.println("Enter Amount: ");
				int num = input.nextInt();
				bkashCashOutFromAgent(num, bkashVat);
				break;
			case 2:
				System.out.println("You Choice: bkash Cash Out Charge From App");
				System.out.println("Enter Amount: ");
				int num2 = input.nextInt();
				bkashCashOutFromApp(num2, bkashAppVat);
				break;
				default:
					System.out.println("Wrong Input !!");
			}
		}
	}
		
		private static void bkashCashOutFromApp(int num, double bkashVat) {
			double totalVat = (num * bkashVat / 100);
			double appVatEquation = (num * bkashVat / 100)+num;
			System.out.println("Your bkash Cash Out Charge From App: "+appVatEquation);
			System.out.println("You Total Pay Of Amount "+appVatEquation+" of "+num);
			System.out.println("Your Total Vat: "+totalVat);
		
	}

	private static void bkashCashOutFromAgent(int num, double bkashVat) {
		double totalVat = (num * bkashVat / 100);
		double vatEquation = (num * bkashVat / 100)+num;
		System.out.println("Your bkash Cash Out Charge From App: "+vatEquation);
		System.out.println("You Total Pay Of Amount "+vatEquation+" of "+num);
		System.out.println("Your Total Vat: "+totalVat);
	}

}
