package com.java.practice;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1;
		int s2;
		int s3;
		int t;
		int p;
		int pm=35;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks s1:");
		s1= sc.nextInt();
		System.out.println("enter marks s2:");
	   s2=sc.nextInt();
	   System.out.println("enter marks s3:");
	   s3=sc.nextInt();
	    t=s1+s2+s3;
		p=(t/300)*100;
		if(s1<pm) {
			System.out.println("failed in s1");
		}
		if(s2<pm) {
			System.out.println("failed in s2");
		}
		if(s3<pm) {
			System.out.println("failed in s32");
		}
		if(s1>=pm && s2>=pm && s3>=pm) {
			System.out.println("passed in all the subjets");
			if(pm>90) {
				System.out.println("Grade A");
			}
			else if(pm>=80) {
				System.out.println("Grade B");
				}
			else if(pm>=70) {
					System.out.println("Grade c");
				}
			else if (pm >= 70) {
	            System.out.println("Grade: C");
	        } 
			else if (pm>= 60) {
	            System.out.println("Grade: D");
	        } 
			else if (pm>= 40) {
	            System.out.println("Grade: E");
	        } 
			
			}
		else {
			
			System.out.println("failed in one or more subjects");
		
		}

	}

}
