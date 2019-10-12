package com.problems_solution;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class EpochConverter {
    public static void main(String[] args){
        long epoch = 1554812212;
        Date date=new Date(epoch*1000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+6"));
        String formatDate=dateFormat.format(date);
        System.out.println(formatDate);
    }
}
