package com.java.pack1;

//import java.util.Scanner;

public class StudentGrade {
	public static int getmarks( ) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("GET MARKS");
		return 0;
		
	}
	
	public static double Average(double m,double p,double c) {
		return (m+p+c)/3.0;
		
	}
	
	public static String Grade(double avg) {
		if(avg>=90) {
			System.out.println("Grade=A" );
		} 
		else if(avg>=80) {
			System.out.println("Grade=B " );
		}
		else if(avg>=70) {
			System.out.println("Grade=C" );
		}
		else if(avg>=60) {
			System.out.println("Grade=D" );
		}
		else  {
			System.out.println("Grade=F ! Fail" );
		}
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		StudentGrade z= new StudentGrade();
		z.Average(80, 80, 90);
		
		
	}

}
