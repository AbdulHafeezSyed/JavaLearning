package com.psoft.arrays;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[][] = new int[2][3];
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i <= a.length - 1; i++) {
//			for (int j = 0; j <= a[i].length - 1; j++) {
//				System.out.println("Enter the age " + i + " studend");
//				a[i][j] = scan.nextInt();
//				
//			} 
//			
//		}
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j <= a[i].length-1; j++) {
				System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
				
			}
	}
 }
}
