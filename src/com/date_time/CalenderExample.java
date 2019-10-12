package com.date_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // get the year from Calendar
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        // get the month from Calendar
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        // get the Day of month from Date and Calendar
        System.out.println("Day of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
        // get the Day of week from Date and Calendar
        System.out.println("Day of Week: " + calendar.get(Calendar.DAY_OF_WEEK));
        // get the Day of year from Date and Calendar
        System.out.println("Day of Year: " + calendar.get(Calendar.DAY_OF_YEAR));
        // get the Week of month from Calendar
        System.out.println("Week of Month :" + calendar.get(Calendar.WEEK_OF_MONTH));
        // get the Week of year from Calendar
        System.out.println("Week of Year :" + calendar.get(Calendar.WEEK_OF_YEAR));
        // get the hour from time
        System.out.println("Hour :" + calendar.get(Calendar.HOUR));
        // get the minute from time
        System.out.println("Minute :" + calendar.get(Calendar.MINUTE));
        // get the second from time
        System.out.println("Second :" + calendar.get(Calendar.SECOND));
        // get the AM PM from time
        System.out.println("AM/PM: " + calendar.get(Calendar.AM_PM));
        // get the hour of the day from Calendar
        System.out.println("Hour of the Day: " + Calendar.HOUR_OF_DAY);
        // converting Date to Calendar
        Date date = new Date();
        calendar.setTime(date);
        // Creating GregorianCalendar of specific date
        Calendar gregorianCalendar = new GregorianCalendar(2019, Calendar.SEPTEMBER, 6);
        // Converting Calendar to Date
        Date date1 = gregorianCalendar.getTime();
        System.out.println("date from Calendar: " + date1);
        // adding 1 month into date
        gregorianCalendar.add(Calendar.MONTH, 1);
        date1 = gregorianCalendar.getTime();
        System.out.println("date after adding one month (next month): " + date1);
        // subtracting 2 month into date
        gregorianCalendar.add(Calendar.MONTH, -2);
        date1 = gregorianCalendar.getTime();
        System.out.println("date after subtracting two month (previous month): " + date1);
    }
}
