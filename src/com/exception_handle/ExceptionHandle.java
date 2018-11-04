package com.exception_handle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Month:");
		try {
			
			int month = in.nextInt();
			System.out.println(months[month]);
		}
		catch (IndexOutOfBoundsException index) {
			System.out.println("Index is out of bounds");
		}
		catch (InputMismatchException mismatch) {
			System.out.println("Input mismatch");
		}
		in.close();
	}

}
