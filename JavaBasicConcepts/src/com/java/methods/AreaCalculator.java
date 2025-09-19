package com.java.methods;
//Method overloading
//---------------------------
public class AreaCalculator {
	public int    calculateArea(int x) {
		System.out.println("Area of Square:" + x * x);
		return 0;

	}

	public int calculateArea(int x, int y) {
		System.out.println("Area of Rectangle:" + x * y);
		return 0;

	}

	public double calculateArea(double r) {
		System.out.println("Area of circle:" + 3.14 * r * r);
		return 0;

	}
	public double calculateArea(double h,double b) {
		System.out.println("Area of Triangle:"+0.5*h*b);
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculator area = new AreaCalculator();
		area.calculateArea(5);
		area.calculateArea(6, 8);
		area.calculateArea(4);
		area.calculateArea(5, 6);
		Student student3=new Student("virat",15,9);
	}

}
