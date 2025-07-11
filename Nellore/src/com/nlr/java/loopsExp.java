package com.nlr.java;

import java.util.Scanner;

public class loopsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int secretnum=8;
		
		do {
		System.out.println("enter num value:");
	    Scanner sc =new Scanner(System.in);
	    num=sc.nextInt();
	    if(num!=secretnum) {
	    	System.out.println("wrong try again");
	    }
		
	}while(num!=secretnum);
		System.out.println("guessed right");

}
	
}