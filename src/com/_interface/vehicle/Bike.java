package com._interface.vehicle;

public class Bike extends Car implements TwoWheeledVehicles{
	boolean isTwoWheeled = true;
	@Override
	public void ride() {
		System.out.println("Ride By Bike");
	}

	@Override
	public void category() {
		System.out.println("Two Wheeled Vehicles");
	}

	@Override
	public boolean isTwoWheeled(boolean wheel) {
		System.out.println("It's Two Wheeled Vehicle: "+wheel);
		return wheel;
	}

}
