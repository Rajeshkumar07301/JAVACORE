package com.rays.JavaIoSteams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLByL {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\Users\\rajes\\OneDrive\\Desktop\\JavaTextFile\\helo.txt");
		PrintWriter pw = new PrintWriter(out);

		for (int i = 0; i < 5; i++) {
			pw.println(i + ":Line");

		}
		pw.close();
		out.close();
		System.out.println("Check C:\\\\Users\\\\rajes\\\\OneDrive\\\\Desktop\\\\JavaTextFile\\\\helo.txt");
	}

}
