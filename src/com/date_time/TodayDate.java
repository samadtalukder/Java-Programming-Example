package com.date_time;

import java.time.LocalDate;
import java.time.MonthDay;

public class TodayDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today's Local Date: " + localDate);
        // get current day, month and year
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getDayOfMonth();
        int day = today.getDayOfMonth();
        System.out.println("Year: " + year + " Month: " + month + " Day: " + day);
        // check if two dates are equal
        LocalDate date = LocalDate.of(2019, 9, 6);
        if (date.isEqual(localDate)) {
            System.out.println("today " + localDate + " date " + date + " are same date");
        } else {
            System.out.println("Today are not same date");
        }
        // check for recurring events e.g. birthday
        LocalDate dateOfBirth = LocalDate.of(1995, 9, 6);
        MonthDay birthDay = MonthDay.of(dateOfBirth.getMonthValue(), dateOfBirth.getDayOfMonth());
        MonthDay currentDay = MonthDay.from(date);
        if (currentDay.equals(birthDay)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry, today is not your birthday");
        }
        // find Date after 1 week
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Today is: " + today);
        System.out.println("Date after 1 week: " + nextWeek);
        // Date before and after 1 year
        LocalDate previousYear = today.minusYears(1);
        System.out.println("Date before 1 year: "+previousYear);
        LocalDate afterYear = today.plusYears(1);
        System.out.println("Date after 1 year: "+afterYear);
    }
}
