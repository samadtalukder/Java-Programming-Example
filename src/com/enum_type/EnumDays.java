package com.enum_type;

public class EnumDays {
	Days days;
	public EnumDays(Days days) {
		this.days = days;
	}
	public void choseDay() {
		switch (days) {
		case SATURDAY:
			System.out.println("Saturday are better");
			break;
		case SUNDAY:
			System.out.println("Sunday are good");
			break;
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so");
			break;
			
		}
	}

	public static void main(String[] args) {
		String strDay = "FRIDAY";
		EnumDays enumDays = new EnumDays(Days.valueOf(strDay));
		enumDays.choseDay();

	}

}
