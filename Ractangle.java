package com.rays.oop;

public class Ractangle extends CShapeInherit{

	public int length;
	public int width;
	
	public Ractangle () {}
	public Ractangle (int len, int wid) {
		this.length = len;
		this.width= wid;
	}
	
	
	public double area() {
		return length*width;
	}
}
