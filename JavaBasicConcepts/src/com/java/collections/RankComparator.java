package com.java.collections;

import java.util.Comparator;

public class RankComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getRank(), o2.getRank());
	}

}
