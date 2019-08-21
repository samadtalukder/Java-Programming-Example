package com.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class GMTtoLocal {
    public static void main(String[] args) throws ParseException {
        String serverDate = "2019-05-13 17:45:00";
        String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        String strDate;

        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Dhaka"));
        Date gmt = sdf.parse(serverDate);

        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        strDate = sdf.format(gmt);
        System.out.println(strDate);
    }
}
