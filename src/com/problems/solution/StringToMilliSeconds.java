package com.problems.solution;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class StringToMilliSeconds {

	public static void main(String[] args) throws ParseException {
		String flcDate = "2018-09-07 05:45:00.0";
		String geofenceDate = "2018-09-10 12:42:20";
		stringToMilliSeconds(geofenceDate);
		

	}

	private static long stringToMilliSeconds(String string) throws ParseException {
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		TimeZone fromTimeZone = calendar.getTimeZone();
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		calendar.setTimeZone(fromTimeZone);
		calendar.setTime(sDateFormat.parse(string));
		
		System.out.println(calendar.getTime().toString());
		return calendar.getTime().getTime();
		
		
	}

}
