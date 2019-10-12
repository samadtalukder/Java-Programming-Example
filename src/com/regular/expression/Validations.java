package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	private Pattern regexPattern;
	private Matcher regexMatcher;
	// check valid email
	public String validateEmail(String email) {
		regexPattern = Pattern.compile("^[(a-zA-z-0-9-\\_//+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
		regexMatcher = regexPattern.matcher(email);
		if (regexMatcher.matches()) {
			System.out.println("Valid Email Address");
		} else {
			System.out.println("Invalid");
		}
		return email;
	}
	// check valid mobile number
	public String validateMobileNumber(String mobileNo) {
		regexPattern = Pattern.compile("^\\+[0-9]{2,3}+[0-9]{10}$");
		regexMatcher = regexPattern.matcher(mobileNo);
		if (regexMatcher.matches()) {
			System.out.println("Valid Mobile No");
		}else {
			System.out.println("Invalid");
		}
		return mobileNo;
	}

	public static void main(String[] args) {
		Validations validations = new Validations();
		String email = "Asif12-@yahoo.com";
		String mobileNo = "+8801792066848";
		validations.validateEmail(email);
		validations.validateMobileNumber(mobileNo);

	}

}
