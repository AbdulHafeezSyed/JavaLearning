package com.psoft.JAVAabstract;

public class Commentator extends MatchParticipant {

	public Commentator(String name) {
		super(name);
	}

	void performRole() {
		System.out.println("commentator "+name+"is describing the match");

	}
}
