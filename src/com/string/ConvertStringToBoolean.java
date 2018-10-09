package com.string;

public class ConvertStringToBoolean {

	public static void main(String[] args) {
		// 
		String tr = "true";
		String fl = "false";
		// parseBoolean returns a boolean primitive value
		System.out.println("Convert String To Boolean Using parseBoolean:"+Boolean.parseBoolean(tr));
		// valueOf returns a Boolean object
		System.out.println("Convert String To Boolean Using valueOf: "+Boolean.valueOf(fl));

	}

}
