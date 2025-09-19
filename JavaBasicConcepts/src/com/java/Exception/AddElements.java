package com.java.Exception;

import java.util.ArrayList;
import java.util.List;

public class AddElements { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList();
		//  arrayList.addLast(10);
		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
		arrayList.addFirst(11);
		arrayList.add(1, 3);
		System.out.println(arrayList);
	}

}
