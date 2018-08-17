package com.abstraction;
/* Abstract Class
 * Abstraction is a process of hiding the implementation details from the user
 * Оnly the functionality will be provided to the user
 * An abstract class is a class that is declared abstract
 * it may or may not include abstract methods
 * Abstract classes cannot be instantiated, but they can be subclassed
 * An abstract class may have static fields and static methods
 * When an abstract class is subclassed, the subclass usually provides implementations for all 
 * of the abstract methods in its parent class
 * Constructors and fields can not be declared as abstract
 * Abstract methods can not be static
 * Abstract methods can not be private
 * You can’t create objects to abstract class even though it does not contain any abstract methods
 * 
 * */
public abstract class AbstractClass {
	// Compile time error, field can not be abstract
	// abstract int num;
	
	// Compile time error, constructor can not be abstract
	 /* abstract AbstractClass(){
		
	}*/
	// Compile time error, abstract methods can not be static
	// static abstract void testMethod();
	// Compile time error, abstract method can not be private.
	// private abstract void method();
	
	abstract void abstractMethod();
}
