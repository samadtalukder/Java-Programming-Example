package com.conditional;

public class SwitchExample {

	public static void main(String[] args) {
		int num = 3;
		switch (num) {
		case 1:
			System.out.println("Fan On");
			break;
		case 2:
			System.out.println("Light On");
			break;
		case 3:
			System.out.println("Lamp On");
			break;
		case 4:
			System.out.println("Dim Light On");
			break;
		default:
			System.out.println("All Off");
			break;
		}
	}

}
