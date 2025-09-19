package com.java.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayList1checkExample {
	 public void nameExists(List<String>neededList) {
  	   for(String name:neededList) {
  		   if(name.contains("bumrah")) {
  			   System.out.println("yes name exist");
  			   return;
  		   }
  	   }System.out.println("Nope!");
     }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> names=Arrays.asList("virat","rohit","bumrah","siraj","pant");
      ArrayList1checkExample example=new ArrayList1checkExample();
      example.nameExists(names);
}
}