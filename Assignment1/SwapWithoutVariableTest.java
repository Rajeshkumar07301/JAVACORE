package com.rays.basics;

public class SwapWithoutVariableTest {

	public void swap() {
		int a = 10;
		int b = 20;
		System.out.println(a+" "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);

	}
	public static void main(String[]args) {
		SwapWithoutVariableTest m = new SwapWithoutVariableTest();
		m.swap();
		
	}

}
