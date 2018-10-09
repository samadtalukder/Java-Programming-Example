package com.problems.solution.electricity_bill_generator;

public class Light implements InterfaceElectricComponent{
	private int numOfLight;
	private int perDayUse;
	public Light(int numOfLight,int perDayUse) {
		this.numOfLight = numOfLight;
		this.perDayUse = perDayUse;
	}

	@Override
	public int calculateUnitForSingleDay() {
		
		return numOfLight * perDayUse * Unit.LIGHT.getValue();
	}

}
