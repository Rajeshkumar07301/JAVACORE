package com.rays.polyreturntype;

public class Circle extends Shape {
	private int radius;
	

	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public double area() {
		double Carr = PI * radius * radius;
		System.out.println("Circle Area = " + Carr);
		return Carr;

	}


}
