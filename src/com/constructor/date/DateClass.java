package com.constructor.date;
// A class for storing dates with a constructor method
public class DateClass {
	public int day;
	public int month;
	public int year;
	String days;
	String months;
	// Constructor
	public DateClass(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public DateClass() {}
	public DateClass setDay(String Day) {
		this.days = Day;
		return this;
	
	}
	public DateClass setMonth(String Month) {
		this.months = Month;
		return this;
		
	}
	public void displayDate() {
		System.out.println("Day:"+days+" Month: "+months);
	}
}
