package com.rays.Collectionframework;

import java.util.Comparator;

public class SortByFname implements Comparator<MarkSheet>{

	@Override
	public int compare(MarkSheet m1, MarkSheet m2) {
		// TODO Auto-generated method stub
		//return M1.getFname().compareTo(M6.getFname());
		
		if (m1.getFname()== m2.getFname()) {
			return m1.getLname().compareTo(m2.getLname());
			
			
		}else {
			return m1.getFname().compareTo(m2.getFname());
		}
	}
   
	
		

	}


