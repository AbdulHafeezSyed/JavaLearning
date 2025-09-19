package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class studentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arrayList = new ArrayList();
		arrayList.add(70);
		arrayList.add(85);
		arrayList.add(90);
		arrayList.add(75);
		arrayList.add(90);
		arrayList.add(60);
		arrayList.add(85);
//        System.out.println(arrayList);
		System.out.print("All Marks: ");
		for (int marks : arrayList) {
          System.out.print( marks+" " );
        // int highest=Collections.max(marks);
        	 
         }
		}

	}


