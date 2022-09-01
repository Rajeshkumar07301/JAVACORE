package com.rays.basics;

public class StringSplitMethodTest {

	public static void main(String[] args) {
		String name = "Rajesh Anil Jashwant";
		String []str = name.split(" ");
		for (String s:str) {
			System.out.println(s);
		}

	}

}
