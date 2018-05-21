package com.inheritance.cycle;

public class Bicycle {
	// the Bicycle class has three fields
	public int candence;
	public int gear;
	public int speed;
	// the Bicycle class has one constructor
	public Bicycle(int candence, int gear, int speed) {
		this.candence = candence;
		this.gear = gear;
		this.speed = speed;
	}
	// the Bicycle class has four methods
	public void setCandence(int newCandence) {
		candence = newCandence;
	}
	public void setGear(int newGear) {
		gear = newGear;
	}
	public void applyBreake(int decrement) {
		speed -= decrement;
		System.out.println(speed);
	}
	public void speedUp(int increment) {
		speed += increment;
		System.out.println(speed);
	}
}
