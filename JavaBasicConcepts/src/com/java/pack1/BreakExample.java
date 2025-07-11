package com.java.pack1;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("input:");
		
		while(true) {
			x=sc.nextInt();
			if(x==0) {
				System.out.println("input must be other than zero");
				break;
			}System.out.println("given input:"+x);
		}
		
		sc.close();
	}

}
