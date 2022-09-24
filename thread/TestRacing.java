package com.rays.thread;

public class TestRacing {

	public static void main(String[] args) throws Exception {

		Racing r1 = new Racing("Ramu");

		Racing r2 = new Racing("Shyamu");

		r1.start();

		r2.start();

	}

}
