package com.misc.program;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleCalculator {

	public static void main(String[] args) {
		String s1=getInput("Enter Numeric Value: ");
		String s2=getInput("Enter Numeric Value: ");
		String op=getInput("Enter 1 = Add, 2 = Minus, 3 = Multiplication, 4 = Divide ==");
		
		int opInt=Integer.parseInt(op);
		double result=0;
		
		switch (opInt) {
		case 1:
			result=addValues(s1, s2);
			break;
			
		case 2:
			result=subValues(s1, s2);
			break;
			
		case 3:
			result=mulValues(s1, s2);
			break;
			
		case 4:
			result=divValues(s1, s2);
			break;
			
		default:
			break;
		}
		
//		double d1=Double.parseDouble(s1);
//		double d2=Double.parseDouble(s2);
//		double result=addValues(s1, s2);
		System.out.println(result);

	}
	
	private static double addValues(String s1, String s2) throws NumberFormatException
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1+d2;
		return result;
	}
	
	private static double subValues(String s1, String s2) throws NumberFormatException
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1-d2;
		return result;
	}
	
	private static double mulValues(String s1, String s2) throws NumberFormatException
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1*d2;
		return result;
	}
	private static double divValues(String s1, String s2) throws NumberFormatException
	{
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1/d2;
		return result;
	}
	
	private static String getInput(String in)
	{
		BufferedReader stdIn=new BufferedReader(new InputStreamReader(System.in));
		System.out.print(in);
		System.out.flush();
		
		try 
		{
			return stdIn.readLine();
		} 
		catch (Exception e) 
		{
			return "Error"+e.getMessage();
		}
	}

}
