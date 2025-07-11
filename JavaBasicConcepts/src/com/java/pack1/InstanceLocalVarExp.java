package com.java.pack1;

public class InstanceLocalVarExp {
	int age=20;
	
	public  void method1()
	{
		int age2=28;
		System.out.println("age : "+age);
		System.out.println("age2 : "+age2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceLocalVarExp m=new InstanceLocalVarExp();
		m.method1();
		System.out.println(m.age);
				
	}

}
