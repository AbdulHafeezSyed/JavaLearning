package com.java.Exception;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		
		} finally {
			try
			{
			System.out.println(1);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(5);
			}
		}
		System.out.println(6);

	}

}
