package com.date_time;

import java.time.LocalTime;

public class TodayTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Today's Local Time: "+localTime);
        //  add hours in time
        LocalTime addTime = localTime.plusHours(1);
        System.out.println("Time after 1 hour :"+addTime);

    }
}
