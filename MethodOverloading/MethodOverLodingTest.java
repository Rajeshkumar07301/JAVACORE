package com.rays.MethodOverloading;

public class MethodOverLodingTest {
	public static void main(String[]args) {
		MethodOverLoding A =new MethodOverLoding();
		A.Addition(15, 11);
		double x=A.Addition(5.4, 8);
		System.out.println(x);
		A.Addition(11, 12, 13);
		A.Addition("RAJ ","Rajesh");
		A.sub(55, 44);
		A.multi(55.5, 66.6);
		A.Div(45.5, 1200);
	
	}
}
