package com.psoft.arrays;

public class ArraysSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,11,12,13,14,15};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum+=a[i];
			
		}
			
		    System.out.println("sum:"+sum);
		    System.out.println((double)(sum/a.length));

	}
}
