package com.rays.IOSerialization;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteSerilizationObjectTest {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream ("d:/raj.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		MarkSheet m = new MarkSheet();
		m.setName("rajesh");
		m.setMaths(60);
		m.setPhysics(84);
		m.setChemistry(86);
		
		out.writeObject(m);
		
		FileOutputStream file2 = new FileOutputStream ("d:/app.ser");
		ObjectOutputStream out2 = new ObjectOutputStream(file2);
		
		
		MarkSheet2TransientAttributes t = new MarkSheet2TransientAttributes("Ram",66,88,55,209,70.2);
		
		out2.writeObject(t);
		
		file.close();
		out.close();
		file2.close();
		out2.close();

	}

}
