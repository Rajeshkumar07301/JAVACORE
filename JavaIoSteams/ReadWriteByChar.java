package com.rays.JavaIoSteams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.concurrent.ArrayBlockingQueue;

public class ReadWriteByChar {

	public static void main(String[] args) throws IOException {
	   FileReader r = new FileReader("C:\\Users\\rajes\\OneDrive\\Desktop\\JavaTextFile\\helo.txt");
      //  int ch = r.read();
        //while(ch!=-1) {
        	//System.out.println((char)ch);
        	//ch = r.read();
        	//}
        //r.close();
        BufferedReader b = new BufferedReader(r);
        String s = b.readLine();
        while (s!=null) {
        	System.out.println(s);
        	s = b.readLine();
			
		}
//        r.close();
//        b.close();
	}

}

