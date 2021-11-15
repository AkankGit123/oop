package com.rays.oop;

public abstract class CShapeInherit {
	
	public String color;
	public int borderwidth;
	
	public CShapeInherit() {}
	
	public CShapeInherit(String color, int borderwidth) {
		this.color = color;
		this.borderwidth = borderwidth;
		
	}
	
	public String getColor() {
		return color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public abstract double area();
	
}
