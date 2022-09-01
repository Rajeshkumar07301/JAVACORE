package com.rays.book;

import java.time.LocalDate;
import java.time.Period;

public class DateQ1EmployeeDOB {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1993, 07, 30);
		Period period = Period.between(birthday, today);
		System.out.println("days="+period.getDays());
		System.out.println("month="+period.getMonths());
		System.out.println("year="+period.getYears());

	}

}
