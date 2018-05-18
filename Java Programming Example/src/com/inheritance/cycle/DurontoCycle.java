package com.inheritance.cycle;

public class DurontoCycle extends Bicycle{
	// the DurontoCycle subclass adds one field
	public int setHeight;
	
	public DurontoCycle(int candence, int gear, int speed,int setHeight) {
		super(candence, gear, speed);
		this.setHeight = setHeight;
		
	}
	// the DurontoCycle subclass adds one method
	public void setHeightMethod(int newSetHeight) {
		this.setHeight = newSetHeight;
		System.out.println(""+newSetHeight);
	}
	
	public static void main(String[] args) {
		DurontoCycle dCycle = new DurontoCycle(250, 5, 60, 170);
		dCycle.setHeightMethod(150);
		dCycle.applyBreake(10);
		dCycle.speedUp(20);
		//System.out.println();
	}

}
