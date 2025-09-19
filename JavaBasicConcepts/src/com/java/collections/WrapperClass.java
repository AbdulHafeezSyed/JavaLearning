package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10;
      Integer integer=new Integer(a);
      Integer obj=Integer.valueOf(a);
      Integer obj2=a;//auto boxing
      List<Float> list=new ArrayList<Float>();
      //unboxing
      int b=integer;
      int c=integer.intValue();
      System.out.println(integer +" "+obj+" "+obj2);
      System.out.println(b+" "+c);
	}

}
