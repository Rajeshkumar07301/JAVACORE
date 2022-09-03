package com.rays.AbstractMethod;

public  class Circle extends Shape{
private int radius;

	
//	public Circle() {
//	}
//
//	Circle(int rd) {
//		radius = rd;
//	}

	
	public double area() {
		double Carr = PI * radius * radius;
		System.out.println("Circle Area = " + Carr);
		return Carr;

	}

	

}

