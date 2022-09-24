package com.rays.Assignment1;

public class OneNameRevers {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java").intern();
		System.out.println((s1==s2)+",String are equal");
		System.out.println((s2==s3)+",String are not equal");
		System.out.println((s3==s4)+",String are equal");

	}

}
