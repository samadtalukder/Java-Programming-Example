package com.date_time;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {
    public static void main(String[] args) {
        Date curDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("d MMM yyyy hh:mm:ss a");
        String DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        //generateCurrentDate();
    }
    public static String convertTime(long time){
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        return format.format(date);
    }
    public static String generateCurrentDate(long i) {
        Date date = new Date();
        String str = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        switch (Math.toIntExact(i)) {
            case 1:
                return new SimpleDateFormat("dd/MM/yyy").format(date);
            case 2:
                return DateFormat.getDateTimeInstance(2, 3).format(date);
            case 3:
                return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(date);
            default:
                return str;
        }
    }
}
