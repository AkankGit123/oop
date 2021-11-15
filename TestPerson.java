package com.rays.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAddress("123, abc , mp");
		p.setName("Vijay");
		
		Date d = new Date(); SimpleDateFormat sdf = new
		SimpleDateFormat("dd/MM/yyyy"); String str = sdf.format(d);
		System.out.println("Today's Date is : " +str);
		
		System.out.println("Person's Name is: " +p.getName());
		System.out.println("Person's Address is: " +p.getAddress());
		System.out.println("Persons Average Age is: " + p.AVG_AGE);
	}

}
