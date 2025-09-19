package com.java.collections;
import java.util.*;
 
public class TreeSetAllScenarios {
	public static void main(String[] args) {
 
		// -----------------------------------------
		// 1. Default Constructor (Natural Ordering)
		// -----------------------------------------
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(40);
		ts1.add(10);
		ts1.add(30);
		ts1.add(20);
		ts1.add(20); // duplicate ignored
		System.out.println("Default Constructor TreeSet: " + ts1); // [10,20,30,40]
 
		// -----------------------------------------
		// 2. Constructor with Collection
		// -----------------------------------------
		List<Integer> list = Arrays.asList(5, 15, 25, 35, 15); // contains duplicates
		TreeSet<Integer> ts2 = new TreeSet<>(list); // removes duplicates, sorts
		System.out.println("Constructor with Collection: " + ts2);
 
		// -----------------------------------------
		// 3. Constructor with Comparator (Reverse Order)
		// -----------------------------------------
		TreeSet<String> ts3 = new TreeSet<>(Comparator.reverseOrder());
		
		ts3.add("b");
		ts3.add("bb");
		ts3.add("c");
		ts3.add("abc");
		ts3.add("abcd");
		
		System.out.println("Constructor with Comparator (Reverse): " + ts3);
 
		// -----------------------------------------
		// 4. Constructor with another SortedSet
		// -----------------------------------------
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(100);
		sortedSet.add(200);
		TreeSet<Integer> ts4 = new TreeSet<>(sortedSet);
		System.out.println("Constructor with SortedSet: " + ts4);
 
		// -----------------------------------------
		// 5. Operations on TreeSet
		// -----------------------------------------
		System.out.println("\n---- Operations on ts1 ----");
		System.out.println("TreeSet: " + ts1);
		System.out.println("Size: " + ts1.size());
		System.out.println("Contains 20? " + ts1.contains(20));
		System.out.println("First: " + ts1.first());
		System.out.println("Last: " + ts1.last());
		System.out.println("Higher than 20: " + ts1.higher(20));
		System.out.println("Lower than 20: " + ts1.lower(20));
		System.out.println("Ceiling(25): " + ts1.ceiling(25));
		System.out.println("Floor(25): " + ts1.floor(25));
		System.out.println("HeadSet(<30): " + ts1.headSet(30));
		System.out.println("TailSet(>=20): " + ts1.tailSet(20));
		System.out.println("SubSet(10 to 40): " + ts1.subSet(10, 40));
 
		// Iterators
		System.out.print("Ascending Order: ");
		for (Integer i : ts1)
			System.out.print(i + " ");
		System.out.println();
 
		System.out.print("Descending Order: ");
		Iterator<Integer> descIt = ts1.descendingIterator();
		while (descIt.hasNext())
			System.out.print(descIt.next() + " ");
		System.out.println();
 
		// Remove
		ts1.remove(10);
		System.out.println("After removing 10: " + ts1);
 
		// Clear
		ts1.clear();
		System.out.println("After clear: " + ts1);
 
		// -----------------------------------------
		// 6. Null Insertion Case
		// -----------------------------------------
		try {
			ts1.add(null); // ❌ Will throw NullPointerException
		} catch (NullPointerException e) {
			System.out.println("Null Insertion Not Allowed in TreeSet!");
		}
	}
}