package com.rays.oop;

public class TestShape {
	
public static void main(String[] args) {
		
		Shape s = new Shape();
		s.setBorderWidth(12);
		s.setColor("Pink");
		
		System.out.println("BorderWidth is : " + s.getBorderWidth());
		System.out.println("Color is : " + s.getColor());
	}

}
