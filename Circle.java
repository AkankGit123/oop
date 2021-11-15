package com.rays.oop;

public class Circle extends CShapeInherit {

	public int radius;
	
	public Circle() {
	} 

	public Circle(int r) {
		radius = r;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
