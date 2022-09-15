package com.rays.Collectionframework;

import java.util.Comparator;

public class SortByLname implements Comparator<MarkSheet> {

	@Override
	public int compare(MarkSheet m1, MarkSheet m2) {

		if (m1.getFname() == m2.getFname()) {
			return m2.getLname().compareTo(m1.getLname());

		} else {
			return m1.getFname().compareTo(m2.getFname());
		}
	}

}
