package com.rays.JavaIoSteams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTest {

	public static void main(String[] args) throws IOException {
		try(FileReader r = new FileReader("C:\\Users\\rajes\\OneDrive\\Desktop\\JavaTextFile\\helo.txt") ){
		 int ch = r.read();
	        while(ch!=-1) {
	        	System.out.println((char)ch);
	        	ch = r.read();
	        	}
	        r.close();
	        

	}
	}//try end...
}
