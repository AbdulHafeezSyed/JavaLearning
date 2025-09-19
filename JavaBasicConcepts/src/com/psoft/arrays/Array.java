package com.psoft.arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4,4,4,5,5,6,6 };
		System.out.print(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				System.out.print(a[i]);

			}
		}
	}
}
