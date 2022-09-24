package com.rays.StrimeAPI;

import java.util.*;

public class DublicatePrint {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(15);
		li.add(25);
		li.add(35);
		li.add(35);
		li.add(55);
		li.add(5);
		
		li.stream().filter(e -> li.add(e)).distinct();
		

	}

}
