package com.inheritance.box;

public class ColorBox extends Box{
	int color;

	public ColorBox(double width, double height, double depth, int color) {
		//super(width, height, depth, weight);
		this.width = width;
		this.height = height;
		this.depth = depth;
	
		this.color = color;
		
	}

}
