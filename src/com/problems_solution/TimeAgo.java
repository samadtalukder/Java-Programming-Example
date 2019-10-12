package com.problems_solution;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeAgo {


    public static String covertTimeToText(String dataDate) {

        String convertTime = null;
        String suffix = "Ago";

        try {
            //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
            Date pasTime = dateFormat.parse(dataDate);

            Date nowTime = new Date();

            long dateDiff = nowTime.getTime() - pasTime.getTime();

            long second = TimeUnit.MILLISECONDS.toSeconds(dateDiff);
            long minute = TimeUnit.MILLISECONDS.toMinutes(dateDiff);
            long hour = TimeUnit.MILLISECONDS.toHours(dateDiff);
            long day = TimeUnit.MILLISECONDS.toDays(dateDiff);

            if (second < 60) {
                convertTime = second + " Seconds " + suffix;
            } else if (minute < 60) {
                convertTime = minute + " Minutes " + suffix;
            } else if (hour < 24) {
                convertTime = hour + " Hours " + suffix;
            } else if (day >= 7) {
                if (day > 30) {
                    convertTime = (day / 30) + " Months " + suffix;
                } else if (day > 360) {
                    convertTime = (day / 360) + " Years " + suffix;
                } else {
                    convertTime = (day / 7) + " Week " + suffix;
                }
            } else if (day < 7) {
                convertTime = day + " Days " + suffix;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return convertTime;

    }

    public static void main(String[] args) {

        String now = "2019-07-30T06:54:42Z";
        // String now = "2019-07-29T09:27:39Z";
        //String now = "2019-07-30T06:12:11.000Z";
        String timeAgo = covertTimeToText(now);
        System.out.println(timeAgo);

    }
}

