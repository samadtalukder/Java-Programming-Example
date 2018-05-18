package com.string;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConvertDateToStringExample {

	public static void main(String[] args) {
		// create new java.util.Date object
		@SuppressWarnings("unused")
		Date date = new Date();
		//
		Date getDate = Calendar.getInstance().getTime();
		//
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		//
		String dateConvert = dateFormat.format(getDate);
		//
		System.out.println("Converted String to Date: "+dateConvert);
		//
		
		/*Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        System.out.println("Converted String: " + strDate); */ 
         

	}

}
