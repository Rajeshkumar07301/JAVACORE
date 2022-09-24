package com.rays.Assignment1;

public class StringCount {

	public static void main(String[] args) {
		String name = "Rajesh Kumar Sakwar";
		int count = 0;
		for (char c ='a';c<='z';c++) {
		for (int i = 0; i < name.length(); i++) {
			if(c == name.charAt(i)) {
				count++;
			}
		}
        System.out.println(c+"="+count);
        count = 0;
	}
	}
}
