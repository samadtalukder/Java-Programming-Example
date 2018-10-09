package com.inner.class_;

import java.util.ArrayList;

public class GearBox {
	private ArrayList<Gear> gearArrayList;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;

	public GearBox(int maxGears) {
		this.maxGears = maxGears;
		this.gearArrayList = new ArrayList<>();
		Gear neutral = new Gear(0, 0.0);
		this.gearArrayList.add(neutral);
	}

	public void operateClutch(boolean in) {
		this.clutchIsIn = in;
	}

	public void addGear(int number, double ratio) {
		if ((number > 0) && (number <= maxGears)) {
			this.gearArrayList.add(new Gear(number, ratio));
		}
	}

	public void changeGear(int newGear) {
		if ((newGear >= 0) && (newGear <= this.gearArrayList.size()) && this.clutchIsIn) {
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected");
		} else {
			System.out.println("Grind!");
			this.currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn) {
			System.out.println("Scream!");
			return 0.0;
		}
		return revs * gearArrayList.get(currentGear).getRatio();
	}

	public class Gear {
		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public double getRatio() {
			return ratio;
		}

		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}

	}
}
