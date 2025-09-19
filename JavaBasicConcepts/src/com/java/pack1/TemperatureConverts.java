package com.java.pack1;

import java.util.Scanner;

public class TemperatureConverts {

	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (celsius * 9.0 / 5.0) + 32;
		System.out.println("fahrenheit:" + fahrenheit);
		return 0;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		System.out.println("celsius:" + celsius);
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TemperatureConverts t = new TemperatureConverts();
		/*
		 * t.celsiusToFahrenheit(20); t.FahrenheitToCelsius(50);
		 */
		Scanner sc = new Scanner(System.in);
		// System.out.println("enter temperature :");
		System.out.println("enter the choice(1 or 2):");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("enter temp:");
			double fahrenheit = sc.nextDouble();
			fahrenheitToCelsius(fahrenheit);
		} else if (choice == 2) {
			System.out.println("enter temp2:");
			double celsius = sc.nextDouble();
			celsiusToFahrenheit(celsius);
		} else {
			System.out.println("invalid choice! please select right choice");
		}
		sc.close();
	}

}
