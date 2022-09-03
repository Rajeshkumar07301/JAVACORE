package com.rays.AbstractMethod;

public abstract class Shape {
	private String Color;
	private int BorderWidth;
	public static final float PI = 3.14f;
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getBorderWidth() {
		return BorderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		BorderWidth = borderWidth;
	}
	public abstract double area() ;
	
	


}
