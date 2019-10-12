package com.inheritance.box;

public class MainBox {

	public static void main(String[] args) {
		Box box = new Box(20, 20, 20);
		//
		BoxWeight boxWeight = new BoxWeight(10, 20, 30, 34.5);
		BoxWeight bWeight = new BoxWeight(2, 3, 4, 0.076);
		//
		ColorBox cBox = new ColorBox(5, 5, 5, 12);
		//
		double vol;
		//
		double vol2;
		//
		double vol3;
		//
		
		vol2 = box.volume();
		vol = boxWeight.volume();
		vol3 = bWeight.volume();
		
		System.out.println("Volume of Box Weight is " + vol);
		System.out.println("Volume of Box is " + vol2);
		System.out.println("Weight of mybox1 is "+boxWeight.weight);
		System.out.println("Volume of Box Weight is "+vol3);
		System.out.println("Weight of mybox1 is "+bWeight.weight);

	}

}
