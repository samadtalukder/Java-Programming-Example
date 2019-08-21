package com.problems_solution;

import java.text.DecimalFormat;

public class ConvertToKBMBGB {
    public static void main(String[] args) {
        // find TB
        long size = 1100000000000L;
        convertToKBMBGB(size);
        // find GB
        size = 2000000000L;
        convertToKBMBGB(size);
        // find MB
        size = 258400000;
        convertToKBMBGB(size);
        // find KB
        size = 195950;
        convertToKBMBGB(size);
        // find Bytes
        size = 990;
        convertToKBMBGB(size);
    }

    private static String convertToKBMBGB(long size) {
        String hrSize = null;
        double kb = size / 1024.00;
        double mb = ((size / 1024.00) / 1024.00);// (size / 1048576.0)
        double gb = (((size / 1024.00) / 1024.00) / 1024.00); // (size / 1073741.0)
        double tb = ((((size / 1024.00) / 1024.00) / 1024.00) / 1024.00); // (size / 1099511.0)
        DecimalFormat decimalFormat = new DecimalFormat();
        if (tb > 1) {
            hrSize = decimalFormat.format(tb).concat(" TB");
            System.out.println(hrSize);
        } else if (gb > 1) {
            hrSize = decimalFormat.format(gb).concat(" GB");
            System.out.println(hrSize);
            //System.out.println(gb + " GB");
        } else if (mb > 1) {
            hrSize = decimalFormat.format(mb).concat(" MB");
            System.out.println(hrSize);
        } else if (kb > 1) {
            hrSize = decimalFormat.format(kb).concat(" KB");
            System.out.println(hrSize);

        } else {
            System.out.println((double) size + " Bytes");
        }
        return hrSize;
    }
    /*
    public static String getSize(long size) {
        String s = "";
        double kb = size / 1024;
        double mb = kb / 1024;
        double gb = kb / 1024;
        double tb = kb / 1024;
        if(size < 1024) {
            s = size + " Bytes";
        } else if(size >= 1024 && size < (1024 * 1024)) {
            s =  String.format("%.2f", kb) + " KB";
        } else if(size >= (1024 * 1024) && size < (1024 * 1024 * 1024)) {
            s = String.format("%.2f", mb) + " MB";
        } else if(size >= (1024 * 1024 * 1024) && size < (1024 * 1024 * 1024 * 1024)) {
            s = String.format("%.2f", gb) + " GB";
        } else if(size >= (1024 * 1024 * 1024 * 1024)) {
            s = String.format("%.2f", tb) + " TB";
        }
        return s;
    }
    */
}
