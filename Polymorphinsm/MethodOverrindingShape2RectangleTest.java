package com.rays.Polymorphinsm;

public class MethodOverrindingShape2RectangleTest {

	public static void main(String[] args) {
			
			Shape2 s2 = new Rectangle2(50,60);
			double Rarr =s2.area();	
			
			s2.setColor("Green");
			s2.setBorderWidth(80);
		
			System.out.println("Color = "+s2.getColor());
			System.out.println("BorderWidth ="+s2.getBorderWidth());
			System.out.println("area of Rectangle = "+Rarr);
	}

}
