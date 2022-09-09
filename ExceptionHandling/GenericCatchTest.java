package com.rays.ExceptionHandling;

public class GenericCatchTest {

	public static void main(String[] args) {
		String name = "Viajy";
		try {
			System.out.println("lenth of name is "+name.length());
			System.out.println("Charter at 7th postion is "+name.length());
		}catch(Exception e) {
			System.out.println("error "+e.getMessage());
		}

	}

}
