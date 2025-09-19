package com.psoft.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {243,141,82,149};
		for(int i=0;i<=a.length-1;i++) {
			int n=a[i];
			int sum=0;
		
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
		}
      
	}
}


