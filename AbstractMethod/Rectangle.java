package com.rays.AbstractMethod;

public class Rectangle {
	private int length;
	private int width;

//	public Rectangle() {
//	}
//
//	Rectangle(int l, int w) {
//		length = l;
//		width = w;
//	}

	public double area() {
		double Rarr = length * width;
		System.out.println("Rectangle Area = " + Rarr);
		return Rarr;

	}


}
