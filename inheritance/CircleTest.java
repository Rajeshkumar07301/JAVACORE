package com.rays.inheritance;

public class CircleTest {

	public static void main(String[] args) {
		Circle cr = new Circle();
		
		cr.setRadius(2);
		cr.setColor("red");
		cr.setBorderwidth(20);
		System.out.println("radius = "+cr.getRadius());
		System.out.println("color = "+cr.getColor());
		System.out.println("borderwidth = "+cr.getBorderwidth());
		System.out.println("area = "+cr.area());
			
		

	}

}
