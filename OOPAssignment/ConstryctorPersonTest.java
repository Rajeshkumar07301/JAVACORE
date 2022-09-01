package com.rays.OPPAssignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConstryctorPersonTest {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		String s = sdf.format(d);
		ConstructorPersonGS sp = new ConstructorPersonGS("rajesh", "nanda nagar",d);
		String cal = sp.getName();
		String sal = sp.getAddress();
		System.out.println(s);
		//System.out.println(sp.getDob());
		System.out.println(cal);
		System.out.println(sal);
	}

}
