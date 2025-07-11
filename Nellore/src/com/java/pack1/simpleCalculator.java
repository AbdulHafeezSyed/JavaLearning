package com.java.pack1;

public class simpleCalculator {
	public static void add(int a, int b) {
		int c = a + b;
		System.out.println("result :" + c);
	}

	public  int subtraction(int a, int b) {
		System.out.print("sub:");
		return a - b;
	}

	public static int multiplication(int a, int b) {
		System.out.print("mul:");
		return a * b;
	}

	public static int division(int a, int b) {
		System.out.print("div:");
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(5, 6);
		simpleCalculator x=new simpleCalculator();
	 System.out.println(x.subtraction(6, 4));
		System.out.println(x.multiplication(5, 8));
		System.out.println(x.division(10, 5));
	}

}
