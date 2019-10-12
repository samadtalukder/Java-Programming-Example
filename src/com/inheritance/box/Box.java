package com.inheritance.box;

public class Box {
	double width;
	double height;
	double depth;
	
	// construct clone of an object
	public Box(Box box) {
		width = box.width;
		height = box.height;
		depth = box.depth;
	}
	// constructor used when all dimensions specified
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	// constructor used when no dimensions specified
	public Box() {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	}
	// constructor used when cube is created
	public Box(double len) {
		width = height = depth = len;
	}
	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}
