package com.rays.StrimeAPI;

import java.util.*;
import java.util.stream.Stream;

public class HowToCreateAStream {

	public static void main(String[] args) {
		List<String> item = Arrays.asList("Aman","Sahil","Gopal","Rajesh");
		Stream<String> Stream = item.stream();
		Stream.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("<==================>");
//	some operation
		item.stream().sorted().forEach(e -> {
			System.out.println(e);
		});
		System.out.println("<================>");
		item.stream().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});
		System.out.println("<================>");
		item.stream().filter(e -> e.startsWith("R")).distinct().map(e -> e.toUpperCase()).sorted().forEach(e -> {System.out.println(e);
		
		});
	
	}
}
