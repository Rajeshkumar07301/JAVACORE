package com.rays.JavaIoSteams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyBinaryFileTest {

	public static void main(String[] args) throws Exception {
		String source = "C:\\Users\\rajes\\OneDrive\\Desktop\\JavaTextFile\\raysteclogo.jpg";
		String Target = "C:\\Users\\rajes\\OneDrive\\Desktop\\JavaTextFile\\rays.jpg";
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(Target);
		
		int ch = in.read();
		while(ch!=-1) {
			 out.write(ch);
			 ch = in.read();
		}
		in.close();
		out.close();
		System.out.println(source+"is copied to "+Target);
	}

}
