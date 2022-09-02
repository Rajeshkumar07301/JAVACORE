package com.rays.Polymorphinsm;

public class Circle2 extends Shape2 {
	private int radius;
	public static final float PI = 3.14f;

	public Circle2() {
	}

	Circle2(int rd) {
		radius = rd;
	}

	public double area() {
		double Carr = PI * radius * radius;
		System.out.println("Circle Area = " + Carr);
		return Carr;

	}

}
