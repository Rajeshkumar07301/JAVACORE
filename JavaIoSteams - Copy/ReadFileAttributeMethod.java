package com.rays.JavaIoSteams;

import java.io.File;
import java.util.Date;

public class ReadFileAttributeMethod {

	public static void main(String[] args) {
		File f = new File("C:\\\\Users\\\\rajes\\\\OneDrive\\\\Desktop\\\\JavaTextFile\\\\helo.txt");
		if(f.exists()) {
			System.out.println("Name "+f.getName());
			System.out.println("Absolute path: "+f.getAbsolutePath());
			System.out.println("Is writeble: "+f.canWrite());
			System.out.println("IsReadable:"+f.canRead());
			System.out.println("Is File"+f.isFile());
			System.out.println("Is Directory"+f.isDirectory());
			System.out.println("Last Modified at "+ new Date(f.lastModified()));
			System.out.println("Size "+f.length()+"bytes long");
		}

	}

}
