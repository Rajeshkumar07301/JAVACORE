package com.rays.polyreturntype;

public class Circle2 extends ConsShape {
	private int radius;

	
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
