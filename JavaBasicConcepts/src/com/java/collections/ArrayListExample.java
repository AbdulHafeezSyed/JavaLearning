package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
   
	public void addName() {
		List<String> list=new ArrayList<String>();
		list.add("virat");
		list.add("Rohit");
		list.add("Bumrah");
		list.add("siraj");
		for(String name:list) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayListExample e=new ArrayListExample();
       e.addName();
	}

}
