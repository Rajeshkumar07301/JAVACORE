package com.rays.Collectionframework;

import java.util.Comparator;

public class SortByPhy implements Comparator<MarkSheet> {

	@Override
	public int compare(MarkSheet M1, MarkSheet M6) {
	
		return M1.getPhysics()- M6.getPhysics();
	}
	

}
