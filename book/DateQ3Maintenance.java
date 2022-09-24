package com.rays.book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateQ3Maintenance {

	public static void main(String[] args) throws ParseException {

		String today = args[0];

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(today);

		Calendar cal = Calendar.getInstance();

		cal.setTime(sdf.parse(today));

		for (int i = 1; i <= 12; i++) {

			cal.add(Calendar.DATE, 30);

			System.out.println(sdf.format(cal.getTime()));

		}

	}

}
