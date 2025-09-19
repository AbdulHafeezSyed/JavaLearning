package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExampleHashmap {
	Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();

	public void addData() {
		map.put(1, "virat");
		map.put(2, "rohit");
		map.put(3, "bumrah");
		map.put(4, "pant");
		map.put(5, "siraj");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ")" + entry.getValue());
		}

	}

	/*
	 * if we use hashmap its give error because it stops the multithreading we use
	 * concurrent class for multiathreading
	 */
//	public void removeData() {
//		for (Integer key : map.keySet()) {
//			if (key.equals(2)) {
//				map.remove(3);
//			}
//
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleHashmap m = new ExampleHashmap();
		m.addData();
		//m.removeData();

	}

}
