package com.java.methods;

public class Addition {
	public int add(int x, int y) {
		int z = x + y;
		return z;

	}

	public int sub(int x, int y) {
		int z = x - y;
		return z;

	}

	public int mul(int x, int y) {
		int z = x * y;
		return z;
	}

	public int div(int x, int y) {
		int z = x / y;
		return z;
	}

	public static String add(String x, int y) {
		String z = x + y;
		return z;

	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		int result = addition.add(5, 6);
		System.out.println("result " + result);
		int result2 = addition.sub(6, 3);
		System.out.println("result2 " + result2);
		int result3 = addition.mul(6, 3);
		System.out.println("result2 " + result3);
		int result4 = addition.div(6, 3);
		System.out.println("result2 " + result4);
		String result5 = addition.add("Virat ", 18);
		System.out.println(result5);
	}

}
