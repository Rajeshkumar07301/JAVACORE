package com.rays.inheritance;

public class RectangleTest{

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		rect.setColor("black");
		rect.setBorderwidth(50);
		rect.setLength(10);
		rect.setWidth(20);
		System.out.println("area of rectangle ="+rect.area());
		System.out.println("color ="+rect.getColor());
		System.out.println("borderwidth ="+rect.getBorderwidth());
		

	}

}
