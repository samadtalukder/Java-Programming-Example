package com.problems.solution.electricity_bill_generator;

public class Fan implements InterfaceElectricComponent {
	private int numOfComponents;
	private int perDayOfUsage;

	public Fan(int numOfComponents, int perDayOfUsage) {
		this.numOfComponents = numOfComponents;
		this.perDayOfUsage = perDayOfUsage;
	}

	@Override
	public int calculateUnitForSingleDay() {

		return numOfComponents * perDayOfUsage * Unit.FAN.getValue();
	}

}
