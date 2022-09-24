package com.rays.StrimeAPI;

import java.util.*;

public class OddSortByAPI {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(5);
		a.add(3);
		a.add(15);
		a.add(8);
		a.add(10);
		a.add(8);
		
		a.stream().filter(e -> e%2!=0).distinct().forEach(e -> System.out.println(e));
	

	}

}
