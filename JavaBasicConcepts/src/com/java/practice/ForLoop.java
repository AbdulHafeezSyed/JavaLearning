package com.java.practice;

import java.util.Scanner;

public class ForLoop {
//for loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int n=10;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num value:");
		num=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(num +"x" +i+"="+num*i);
			
		}

	}

}
