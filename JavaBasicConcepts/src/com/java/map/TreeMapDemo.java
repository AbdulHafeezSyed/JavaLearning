package com.java.map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Player> m = new TreeMap<>();
		Player p1 = new Player(18, "virat", "bangalore");
		Player p2 = new Player(45, "rohit", "mumbai");
		Player p3 = new Player(8, "jadeja", "chennai");

		m.put(1, p1);
		m.put(3, p2);
		m.put(2, p3);
		for(Player p:m.values()) {
		System.out.println(p);
		}
		
		 TreeMap<String , String> tm2 = new TreeMap<>(Collections.reverseOrder());
		 
	        tm2.put("Apple", "Fruit");
	        tm2.put("Carrot", "Vegetable");
	        tm2.put("Banana", "Fruit");
	 
	        System.out.println(" tm2 - Reverse order:");
	        System.out.println(tm2);
	        
	        TreeMap<Integer,Player> t3=new TreeMap<>(m);
	        for(Player p:m.values()) {
	        System.out.println(t3);
	        }
	       
	}

}
