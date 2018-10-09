package com.problems.solution.electricity_bill_generator;


import java.util.Scanner;

public class BillGenerator {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		ApplianceFactory apFactory = new ApplianceFactory();
		System.out.println("Input Of Applience: ");
		int inputOfApplience = scanner.nextInt();
		// String applience = "";
		// int countOfApplience;
		// int perDayOfUse;
		int unitsPerDay = 0;

		/*
		 * applience = scanner.nextLine(); countOfApplience = scanner.nextInt();
		 * perDayOfUse = scanner.nextInt(); InterfaceElectricComponent electricComponent
		 * = apFactory.getInstance(applience, countOfApplience, perDayOfUse);
		 * unitsPerDay += electricComponent.calculateUnitForSingleDay();
		 */
		for (int i = 0; i < inputOfApplience; i++) {
			System.out.println("Appliance: ");
			String applience = scanner.next();
			System.out.println("CountOfAppliance :");
			int countOfApplience = scanner.nextInt();
			System.out.println("TotalUasgePerDayInHours: ");
			int perDayOfUse = scanner.nextInt();
			InterfaceElectricComponent electricComponent = apFactory.getInstance(applience, countOfApplience,perDayOfUse);
			unitsPerDay += electricComponent.calculateUnitForSingleDay();
		}
		System.out.println("unitsPerDay: " + unitsPerDay);
		int unitsPerMonth = unitsPerDay * 30;
		System.out.println("unitsPerMonth: " + unitsPerMonth);
		PriceSlab pSlab = new PriceSlab();
		int totalBill = pSlab.calculateBill(unitsPerMonth);
		System.out.println("totalBill: " + totalBill);

	}

}
