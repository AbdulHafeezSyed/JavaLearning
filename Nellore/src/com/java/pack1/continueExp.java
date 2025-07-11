package com.java.pack1;

public class continueExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x=20;
 System.out.println("printing even numbers:");
 for(int i=1;i<=x;i++) {
	 if(i%2!=0) {
	 continue;
	 }System.out.println(i);
 }
 System.out.println("printing odd numbers:");
 for(int i=1;i<=x;i++) {
	 if(i%2==0) {
		continue;
	 }System.out.println(i);
 }

	}

}
