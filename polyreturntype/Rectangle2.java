package com.rays.polyreturntype;

public class Rectangle2 extends ConsShape{
	private int length;
	private int width;

	public Rectangle2() {
	}

	Rectangle2(int l, int w) {
		length = l;
		width = w;
	}

	public double area() {
		double Rarr = length * width;
		System.out.println("Rectangle Area = " + Rarr);
		return Rarr;

	}


}
