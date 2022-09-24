package com.rays.JavaIoSteams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboardTest {

	public static void main(String[] args) throws IOException {
		InputStreamReader isRed =new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isRed);
		
		PrintWriter out = new PrintWriter(new FileWriter("D:\\new.txt"));
		String line = in.readLine();
		
		while(!line.equals("quit")){
		out.println(line);
		
		line = in.readLine();
	}
		in.close();
		isRed.close();
		out.close();
	
	}
}
