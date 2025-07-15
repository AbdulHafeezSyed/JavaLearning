package com.java.methods;

public class StudentDetails {
	String Name;
	int age;
	String study;
    String school;
    int rollNumber;
    //constructor
    public StudentDetails(String x,int y,String z,String a,int r) {
    	this.Name=x;
    	this.age=y;
    	this.study=z;
    	this.school=a;
    	this.rollNumber=r;
    	System.out.println("Name:"+Name+"\nAge:"+age+"\nClass:"+study+"\nSchool:"+school+"\nRollNumber:"+rollNumber);
		 
	}

	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("STUDENTS DETAILS");
		System.out.println("-------------------------------");
		StudentDetails c=new StudentDetails("Virat",20,"x","NARESH IT",21);
		
//		System.out.println("Name"+c.Name);
			
		}

	}


