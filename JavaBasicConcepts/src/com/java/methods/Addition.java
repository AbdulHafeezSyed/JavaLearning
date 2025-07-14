package com.java.methods;

public class Addition {
	public int add(int x, int y) {
		int z = x + y;
		return z;

	}
	public int sub(int x, int y) {
		int z = x + y;
		return z;

	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		int result = addition.add(5, 6);
		System.out.println("result " + result);
	}

}
