package com.psoft.JAVAabstract;

public class Player extends MatchParticipant {

	public Player(String name) {
		super(name);
	
	}

	void performRole() {
		System.out.println("Player"+name+"is playeing on the field");

	}
}
