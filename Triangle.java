package com.rays.oop;

public class Triangle extends CShapeInherit{
	public int base;
	public int height;
	
	public Triangle() {}
	public Triangle(int bs, int ht) {
		this.base = bs;
		this.height = ht;
	}
	
	public double area() {
		return  (height*base)/2;
	}
	
	

}
