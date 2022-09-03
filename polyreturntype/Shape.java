package com.rays.polyreturntype;

public class Shape {
	private String color;
	private int borderwidth;
	public static final float PI =3.14f;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public double area() {
	return 0;
	}
	public Shape getShape(int i) {
		if (i==1) {
		return new Circle();
		}
		if (i==2) {
			return new Rectangle();
		}
		if (i==3) {
			return new Triangle();
		}
		return new Shape();
			
		
	}

}