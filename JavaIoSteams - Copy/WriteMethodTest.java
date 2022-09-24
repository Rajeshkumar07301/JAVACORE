package com.rays.JavaIoSteams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteMethodTest {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\Users\\rajes\\OneDrive\\Desktop\\JavaTextFile\\helo.txt");
		out.write('R'+" ");
		out.write(55);
		out.write("Rajesh");
		out.write('\n');
		out.write("This is line one. ");
		out.write("This is line two.");
		out.close();
		System.out.println("Check C:\\\\Users\\\\rajes\\\\OneDrive\\\\Desktop\\\\JavaTextFile\\\\helo.txt");
		

	}

}
