package com.abstraction;

public class AbstractClassMain extends AbstractClass{
	@Override
	void abstractMethod() {
		System.out.println("Abstract Method Implement");
	}
	public static void main(String[] args) {
		// AbstractClassMain implements abstract method,
        // so we can create object to AbstractClassMain
		AbstractClassMain absMain = new AbstractClassMain();
		
		// Can't create objects to Abstract class
		// AbstractClass abs = new AbstractClass();
		
		// AbstractClassMain object is auto-upcasted to AbstractClass
		AbstractClass abs1 = absMain;
		abs1.abstractMethod();
	}

	

}
