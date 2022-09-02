package com.rays.Polymorphinsm;

public class MethodOverridingShape2TriangleTest {

	public static void main(String[] args) {
			
			Shape2 s2 = new Triangle2(50,40);
			double Tarr =s2.area();	
			
			s2.setColor("Green");
			s2.setBorderWidth(80);
		
			System.out.println("Color = "+s2.getColor());
			System.out.println("BorderWidth ="+s2.getBorderWidth());
			System.out.println("area of triangle = "+Tarr);
	}

}
