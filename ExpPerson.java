package com.rays.oop;

public class ExpPerson {
	
	protected String fname;
	protected String lname;
	protected String address;
	
	public ExpPerson () {
		System.out.println("This is perons's default contructor");
	}
	
	public ExpPerson (String fn, String ln) {
		fname = fn;
		lname = ln;
		
		System.out.println("This is perons's 2 Paramt contructor");
	}
	
	public ExpPerson (String fn, String ln, String add) {
		/*
		 * fname = fn; 
		 * lname = ln;
		 */
		this(fn,ln);
		address = add;
		
		System.out.println("This is perons's 3 Paramt contructor");
	}
}
