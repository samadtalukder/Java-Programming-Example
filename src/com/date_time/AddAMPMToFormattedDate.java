package com.date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddAMPMToFormattedDate {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Print Date: " + date);

        //formatting time to have AM/PM text using 'a' format

        String strDateFormat = "HH.mm.ss a";

        SimpleDateFormat dateFormat = new SimpleDateFormat(strDateFormat);

        System.out.println("Print Time With AM/PM: " + dateFormat.format(date));
    }
}
