package com.interface_;

/*Important points about interface 
 * We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.A class can implement more than one interface.
 * An interface can extends another interface or interfaces (more than one interface) .
 * A class that implements interface must implements all the methods in interface.
 * All the methods are public and abstract. And all the fields are public, static, and final.
 * It is used to achieve multiple inheritance.
 * It is used to achieve loose coupling.
 * It is used to achieve total abstraction
 * Interfaces specify what a class must do and not how. It is the blueprint of the class.
 * */
public interface Vehicle extends TwoWheeledVehicles{
	// public, static and final
	final int a = 101;

	// public and abstract
	void ride();

	// all are the abstract methods
	void changeGear(int gear);

	void speedUp(int speed);

	void applyBreaks(int apBreak);

	// JDK 8 is that we can now define static methods in interfaces which can be
	// called independently without an object. Note: these methods are not
	// inherited.
	public static void staticDisplay() {
		System.out.println("Static Method Print");
	};

}
