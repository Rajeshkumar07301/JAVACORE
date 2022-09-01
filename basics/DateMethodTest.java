
package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethodTest {
	public static void main(String[]args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String sd = sdf.format(d);
		System.out.println(sd);
		String str1 = "50/10/2019";
		Date d1 = sdf.parse(str1);
	}

}
