package com.inner_class;

public class GearBoxMain {

	public static void main(String[] args) {
		GearBox gearBox = new GearBox(5);
		gearBox.addGear(1, 5.3);
		gearBox.addGear(2, 10.6);
		gearBox.addGear(3, 15.9);
		gearBox.operateClutch(true);
		gearBox.changeGear(2);
		gearBox.operateClutch(false);
		System.out.println(gearBox.wheelSpeed(1000));
		gearBox.changeGear(3);
		System.out.println(gearBox.wheelSpeed(1000));
		gearBox.operateClutch(true);
		gearBox.changeGear(3);
		gearBox.operateClutch(false);
		System.out.println(gearBox.wheelSpeed(1000));
		//GearBox.Gear first = gearBox.new Gear(1, 12.3);
		//System.out.println(first.driveSpeed(1000));

	}

}
