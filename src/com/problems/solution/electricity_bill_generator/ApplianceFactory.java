package com.problems.solution.electricity_bill_generator;

public class ApplianceFactory {
	public static InterfaceElectricComponent getInstance(String applience, int countOfApplience, int perDayOfUse) {
		switch (applience) {
		case ApplienceConstants.FAN:
			return new Fan(countOfApplience, perDayOfUse);
		case ApplienceConstants.LIGHT:
			return new Light(countOfApplience, perDayOfUse);

		default:
			return new InterfaceElectricComponent() {

				@Override
				public int calculateUnitForSingleDay() {
					// TODO Auto-generated method stub
					return countOfApplience * perDayOfUse;
				}

			};
		}

	}

}
