package com.rays.Polymorphinsm;

public class MethodOverridingShape2CircleTest {

	public static void main(String[] args) {
		
		Shape2 s2 = new Circle2(50);
		double Carr =s2.area();	
		
		s2.setColor("Green");
		s2.setBorderWidth(80);
	
		System.out.println("Color = "+s2.getColor());
		System.out.println("BorderWidth ="+s2.getBorderWidth());
		System.out.println("area of circle = "+Carr);

	}
	
}