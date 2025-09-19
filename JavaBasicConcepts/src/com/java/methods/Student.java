package com.java.methods;

public class Student {

	public Student(String Name) {
		System.out.println(Name);

	}

	public Student(String Name, int age) {
		System.out.println(Name+" "+age);

	}
	public Student(String Name,int age,int study) {
		System.out.println(Name+" "+age+" "+study);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("virat");
		Student student2=new Student("virat",15);
		Student student3=new Student("virat",15,9);
	    
		
	}

}
