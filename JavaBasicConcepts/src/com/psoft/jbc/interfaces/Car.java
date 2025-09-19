package com.psoft.jbc.interfaces;

public class Car implements Controllable {
	@Override
	public void start() {
		System.out.println("car engine started");
		
	}
	public  void stop() {
		
		System.out.println("car engine stopped\n");
	}
   
}
