package com.rays.polyreturntype;

public class ArrShape2Test {

	public static void main(String[] args) {
		ConsShape Cp = new ConsShape();	
		ConsShape[]s2 = new ConsShape[3];
		
		s2[0] = new Circle2(10);
		s2[1] = new Rectangle2(10, 20);
		s2[2] = new Triangle2(20, 30);
		double TotalArea = calcArea(s2);
		System.out.println("Total Area of Shape ="+TotalArea);

	}

	public static double calcArea(ConsShape[] s2) {
		double TotalArea = 0;

		for (int i = 0; i < s2.length; i++) {
			TotalArea = TotalArea + s2[i].area();
		}
		return TotalArea;
	}

		
		
}
