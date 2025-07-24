package com.psoft.JAVAabstract;

public class Umpire extends MatchParticipant {

	public Umpire(String name) {
		super(name);
	}

	void performRole() {
		System.out.println("umpire "+name+" is making decision");
		

	}
}
