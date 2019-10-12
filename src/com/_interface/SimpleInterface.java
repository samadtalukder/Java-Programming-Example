package com._interface;

import com._interface.vehicle.Bike;
import com._interface.vehicle.Car;
import com._interface.vehicle.TwoWheeledVehicles;
import com._interface.vehicle.Vehicle;

public class SimpleInterface {
	/*
	 * Loose coupling is a design goal that seeks to reduce the inter-dependencies
	 * between components of a system with the goal of reducing the risk that
	 * changes in one component will require changes in any other component. Loose
	 * coupling is much more generic concept intended to increase the flexibility of
	 * system, make it more maintainable and makes the entire framework more stable
	 */
	public static void main(String[] args) {
		Car car = new Car();
		car.ride();

		Vehicle vehicleBike = new Bike();
		Vehicle vehicleCar = new Car();
		// Vehicle Bike
		vehicleBike.ride();
		// Vehicle Car
		vehicleCar.ride();
		vehicleCar.changeGear(8);
		vehicleCar.speedUp(80);
		vehicleCar.applyBreaks(20);
		vehicleCar.category();
		vehicleCar.isTwoWheeled(false);
		// Interface Vehicle staticDisplay() method print
		Vehicle.staticDisplay();
		
		/*
		 * Bike bike = new Bike(); bike.isTwoWheeled(); bike.category(); bike.ride();
		 */
		TwoWheeledVehicles bike = new Bike();
		bike.category();
		bike.isTwoWheeled(true);

	}

}
