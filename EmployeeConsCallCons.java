package com.rays.oop;

public class EmployeeConsCallCons extends ExpPerson {
	
	private String designation;
	
	public EmployeeConsCallCons () {
		System.out.println("This is Employee's default contructor");
	}
	
	public EmployeeConsCallCons (String fn, String ln , String des) {
		super(fn,ln);
		designation = des;
		System.out.println("This is Employee's 3 paramt contructor" +" "+ "Developer");
	}
	
	public static void main(String[] args) {
		
		EmployeeConsCallCons eep = new EmployeeConsCallCons ("Vijay","Chohan","Developer");
		System.out.println(eep.fname);
		System.out.println(eep.lname);
		System.out.println(eep.designation);
		
         
	}

}
