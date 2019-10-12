package com.method.overloading;

public class HoursMinutesSeconds {
    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        //getTimeDuration(70, 65);
        System.out.println(getTimeDuration(86, 59));
        System.out.println(getTimeDuration(34500L));
        System.out.println(getTimeDuration(-345));
    }


    private static String getTimeDuration(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds >= 60)) {
            return INVALID_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getTimeDuration(long seconds) {
        if (seconds < 0) {
            return INVALID_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getTimeDuration(minutes, remainingSeconds);
    }
}
