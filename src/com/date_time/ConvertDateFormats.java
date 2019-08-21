package com.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateFormats {
    public static void main(String[] args) {

        String strDate = "07/09/2018 1:10:00";

        try {

            System.out.println("Current Date Time : " + strDate);

            // create SimpleDateFormat object with source string date format
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

            // parse the string into Date object
            Date date = dateFormat.parse(strDate);

            System.out.println("Before Date Time: " + date);

            // create SimpleDateFormat object with desired date format
            SimpleDateFormat sdfDestination = new SimpleDateFormat("MM-dd-yy HH:mm:ss a");

            // parse the date into another format
            strDate = sdfDestination.format(date);

            System.out.println("After Date Time Converted : " + strDate);


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
