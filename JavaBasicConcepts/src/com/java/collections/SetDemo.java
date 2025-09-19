package com.java.collections;
 
import java.util.*;
 
public class SetDemo {
	public static void main(String[] args) {
 
		// 🔹 HashSet Constructors
		Set<String> hs1 = new HashSet<>(); // default
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");
 
		Set<String> hs2 = new HashSet<>(20); // with capacity
		hs2.add("X");
		hs2.add("Y");
		//hs2.add("z");
		
		Set<String> hs3 = new HashSet<>(30, 0.9f); // capacity + load factor
		hs3.add("P");
		hs3.add("Q");  
 
		List<String> fruits = Arrays.asList("Mango", "Apple", "Banana");
		HashSet<String> hs4 = new HashSet<>(fruits); // from Collection
 
		System.out.println("HashSet hs1: " + hs1);
		System.out.println("HashSet hs2: " + hs2);
		System.out.println("HashSet hs3: " + hs3);
		System.out.println("HashSet hs4: " + hs4);
 
		// 🔹 LinkedHashSet Constructors
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>(); // default
		lhs1.add("Dog");
		lhs1.add("Cat");
		lhs1.add("Elephant");
 
		LinkedHashSet<String> lhs2 = new LinkedHashSet<>(15); // with capacity
		lhs2.add("Red");
		lhs2.add("Blue");
 
		LinkedHashSet<String> lhs3 = new LinkedHashSet<>(25, 0.75f); // capacity + load factor
		lhs3.add("One");
		lhs3.add("Two");
 
		LinkedHashSet<String> lhs4 = new LinkedHashSet<>(fruits); // from Collection
 
		System.out.println("\nLinkedHashSet lhs1: " + lhs1);
		System.out.println("LinkedHashSet lhs2: " + lhs2);
		System.out.println("LinkedHashSet lhs3: " + lhs3);
		System.out.println("LinkedHashSet lhs4: " + lhs4);
 
		// 🔹 Common Operations
		System.out.println("\nCheck contains 'Cat' in lhs1: " + lhs1.contains("Cat"));
		lhs1.remove("Cat");
		System.out.println("After removing Cat: " + lhs1);
 
		System.out.println("Size of lhs1: " + lhs1.size());
 
		System.out.println("Looping lhs1:");
		for (String s : lhs1) {
			System.out.println(s);
		}
 
		lhs1.clear();
		System.out.println("After clear lhs1: " + lhs1);
	}
}