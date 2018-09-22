package com.interface_;

public class Car implements Vehicle{
	int speed;
	int gear;

	@Override
	public void ride() {
		System.out.println("Ride By Car,"+" Dha-L"+a);
		
	}

	@Override
	public void changeGear(int newGear) {
		gear = newGear;
		System.out.println("Car Gear:"+gear);
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
		System.out.println("Car Speed:"+speed);
	}

	@Override
	public void applyBreaks(int decrement) {
		speed -= decrement;
		System.out.println("Car Breaks:"+speed);	
	}

	@Override
	public void category() {
		System.out.println("Four Wheeled Vehicles");
		
	}

	@Override
	public boolean isTwoWheeled(boolean wheel) {
		System.out.println("It's Two Wheeled Vehicle: "+wheel);
		return wheel;
	}

	
	

}
