package com.constructor.date;

public class DateMain {
	static boolean isEqual(DateClass dateClass1,DateClass dateClass2) {
		return (
				dateClass1.day == dateClass2.day 
				&& dateClass1.month == dateClass2.month
				&& dateClass1.year == dateClass2.year
				);
	}
	public static void main(String[] args) {
		DateClass daClassObj = new DateClass(10, 9, 2016);
		DateClass daClassObj2 = new DateClass(10, 9, 2018);
		
		System.out.println(daClassObj.day+"/"+daClassObj.month+"/"+daClassObj.year);
		System.out.println(isEqual(daClassObj, daClassObj2));
		DateClass def = new DateClass();
		def.setDay("Sat").setMonth("Jan").displayDate();

	}

}
