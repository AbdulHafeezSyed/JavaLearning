package com.java.Exception;

class Test {
	public static void main(String[] args) {
		System.out.println(m1());
	}

	public static int m1() {
		try {
			System.out.println( );
			int y=777;
			return y;
		} catch (ArithmeticException e) {
			return 888;
		} finally {
			int y=999;
			return y;
		}
	}
}