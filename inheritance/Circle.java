package com.rays.inheritance;

public class Circle extends Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		double arr = Shape.PI*radius*radius;
		return arr;
	}


}
