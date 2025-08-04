package com.psoft.arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sorting array in descending order
		int a[] = { 8, 5, 6, 2, 3, 4, 1, 7 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int n : a) {
			System.out.print(n);
		}
		// sorting in ascending order
		int b[] = { 8, 5, 6, 2, 3, 4, 1, 7 };
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[j] < b[i]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}

		}
		System.out.println();
		for (int n : b) {
			System.out.print(n);
		}
	}

}
