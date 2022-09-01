package com.rays.OPPAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PersonTest {

	public static void main(String[] args) throws ParseException {
		PersonSG p = new PersonSG();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		p.setName("Rajesh kumar");
		p.setDob("30/07/1996");
		p.setAddress("Tilak Nagar");
	System.out.println(p.getName());
	String str=sdf.format(p.getDob());
	System.out.println(str);
	System.out.println(p.getAdd());

	}

}
