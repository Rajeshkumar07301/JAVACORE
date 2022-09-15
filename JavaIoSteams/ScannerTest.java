package com.rays.JavaIoSteams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) throws Exception {
		FileReader Red = new FileReader("C:\\Users\\rajes\\OneDrive\\Desktop\\JavaTextFile\\helo.txt");
		Scanner sc =new Scanner(Red);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());	
		}
		Red.close();
	}

}
