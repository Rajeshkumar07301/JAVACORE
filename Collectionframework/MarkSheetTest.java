package com.rays.Collectionframework;

import java.util.*;

public class MarkSheetTest {

	public static void main(String[] args) {
		MarkSheet M1 = new MarkSheet();
		M1.setRollnumber("01");
		M1.setFname("Anil");
		M1.setLname("Varma");
		M1.setPhysics(68);
		M1.setChemistry(72);
		M1.setMaths(88);

		MarkSheet M2 = new MarkSheet();
		M2.setRollnumber("03");
		M2.setFname("Rajesh");
		M2.setLname("Sakwar");
		M2.setPhysics(55);
		M2.setChemistry(62);
		M2.setMaths(72);

		MarkSheet M3 = new MarkSheet();
		M3.setRollnumber("06");
		M3.setFname("Anil");
		M3.setLname("Sahu");
		M3.setPhysics(78);
		M3.setChemistry(70);
		M3.setMaths(68);

		MarkSheet M4 = new MarkSheet();
		M4.setRollnumber("02");
		M4.setFname("Rahul");
		M4.setLname("Verma");
		M4.setPhysics(55);
		M4.setChemistry(69);
		M4.setMaths(80);

		MarkSheet M5 = new MarkSheet();
		M5.setRollnumber("05");
		M5.setFname("Priya");
		M5.setLname("Jain");
		M5.setPhysics(68);
		M5.setChemistry(75);
		M5.setMaths(82);

		MarkSheet M6 = new MarkSheet();
		M6.setRollnumber("04");
		M6.setFname("Shiv");
		M6.setLname("sahu");
		M6.setPhysics(65);
		M6.setChemistry(74);
		M6.setMaths(90);

		ArrayList list = new ArrayList();
		list.add(M1);
		list.add(M2);
		list.add(M3);
		list.add(M4);
		list.add(M5);
		list.add(M6);

		SortByLname lname = new SortByLname();

		Collections.sort(list);
//		Collections.sort(list,new SortByFname());
//		Collections.sort(list, lname);
//		Collections.sort(list,new SortByPhy());

		for (Object object : list) {

			System.out.println(object);

		}

	}

}
