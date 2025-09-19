package com.java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class subStringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		word = sc.nextLine();
		try {
             System.out.println(word.length());
			System.out.println("Enter 1st index:");
			int index = sc.nextInt();
			System.out.println("Enter end index:");
			int index2 = sc.nextInt();
			if(index<index2) {
			System.out.println(word.substring(index, index2));
			}else {
				throw new IllegalArgumentException("Start index cannot be greater than end index");
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid substring range");

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

		}catch(InputMismatchException e) {
			System.out.println("Invalid Index Number!");
		}
		finally {
			//System.out.println();
			System.out.println("Operation complete");
		}

	}

}
