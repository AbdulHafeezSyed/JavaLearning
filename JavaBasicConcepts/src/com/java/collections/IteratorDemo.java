package com.java.collections;

/*
* Iterator in Java
* -----------------
* - Introduced in JDK 1.2
* - Universal Cursor → works on ALL Collection classes (ArrayList, HashSet, LinkedList, etc.)
* - Direction: Only Forward
* - Methods:
*      1) boolean hasNext() → check if next element exists
*      2) Object next() → returns next element
*      3) void remove() → removes current element
* - Limitations:
*      ❌ Cannot move backward
*      ❌ Cannot add/replace element
* - Advantage: Can remove elements safely while iterating
*/

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");

		// Create Iterator cursor
		Iterator<String> itr = list.iterator();

		System.out.println("Using Iterator:");
		while (itr.hasNext()) {
			String fruit = itr.next();
			System.out.println(fruit);

			// Removing Banana while iterating
			if (fruit.equals("Banana")) {
				itr.remove();
			}
		}

		System.out.println("After removal: " + list);
	}
}
