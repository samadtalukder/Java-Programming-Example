package com.inheritance.box;

public class ReferenceBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;
		
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is "+vol);
		System.out.println("Weight of weightbox is " +weightbox.weight);
		System.out.println();
		//
		
		plainbox = weightbox;
		vol = plainbox.volume();
		System.out.println("Volume of plainbox is " + vol);
		/* The following statement is invalid because plainbox
		does not define a weight member. */
		//System.out.println("Weight of plainbox is " + plainbox.weight);
	}

}
