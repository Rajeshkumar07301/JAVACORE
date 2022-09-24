package com.rays.PolymorphinsimTypeCasting;

public class Circle extends Shape {
	private int radius;

	public int getRedius() {
		return radius;
	}

	public void setRedius(int redius) {
		this.radius = redius;
	}
	public double area() {
		double  Carr = Shape.PI*radius*radius;
		return  Carr;
	}


}
