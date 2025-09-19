package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobile> m = new ArrayList<>();

		m.add(new Mobile(2, "one plus", 12, 30000));
		m.add(new Mobile(1, "iqoo", 16, 45000));
		m.add(new Mobile(4, "vivo", 8, 30000));
		m.add(new Mobile(3, "samsung", 12, 30000));
		

		System.out.println("Mobile List\n");
		for (Mobile e : m) {
			System.out.println(e);
		}
		Collections.sort(m);
		System.out.println("\nsorted by price");
		for (Mobile e : m) {
			System.out.println(e);
		}
		Collections.sort(m, new brandComparator());
		System.out.println("\nsorted by Brand comparator");
		for (Mobile e : m) {
			System.out.println(e);
		}
		Collections.sort(m, new ramComparator());
		System.out.println("\nsorted by RAM comparator");
		for (Mobile e : m) {
			System.out.println(e);
		}
		Collections.sort(m, new RankComparator());
		System.out.println("\nsorted by rank");
		for (Mobile e : m) {
			System.out.println(e);
		}
	}
}
