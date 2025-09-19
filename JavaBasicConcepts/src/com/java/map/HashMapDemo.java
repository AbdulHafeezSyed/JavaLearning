package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashmap = new ConcurrentHashMap<Integer, String>();
		
		hashmap.put(18,"virat");
		hashmap.put(45, "rohit");
		hashmap.put(77, "gill");
		hashmap.put(27, "siraj");
		hashmap.put(25, "pant");
		
		//System.out.println("Map Data: "+hashmap);
		
		//System.out.println("get77: "+hashmap.get(77));
		System.out.println("containsKey(18): "+hashmap.containsKey(18));
		System.out.println("ContainsValue('siraj'): " + hashmap.containsValue("siraj"));
		 
		// --- Iteration (keySet) ---
		System.out.println("\nIterating using keySet():");
		for (Integer key : hashmap.keySet()) {
			if(key.equals(18)) {
				hashmap.remove(45);
			}
			System.out.println("Key: " + key + ", Value: " + hashmap.get(key));
		}
 
		// --- Iteration (values) ---
		System.out.println("\nIterating using values():");
		for (String value : hashmap.values()) {
			System.out.println(value);
		}
 
		// --- Iteration (entrySet) ---
		System.out.println("\nIterating using entrySet():");
		for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
 
		// --- Update / Replace ---
		hashmap.replace(1, "Green Apple");
 
		// --- Remove ---
		hashmap.remove(3);
 
 
		// --- Null handling ---
//		hashmap.put(null, "NullKey"); // 1 null key allowed
		hashmap.put(5, null); // multiple null values allowed
 
		// --- Size & Clear ---
		System.out.println("\nSize before clear: " + hashmap.size());
		hashmap.clear();
		System.out.println("Size after clear: " + hashmap.size());
	}


	}


