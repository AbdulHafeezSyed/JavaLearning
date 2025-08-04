package com.psoft.arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				evenSum += a[i];
			} else {
				oddSum += a[i];
			}

		}
		System.out.println("evenSum:" + evenSum);
		System.out.println("oddSum:" + oddSum);
		
	}

}
