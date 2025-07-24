package com.psoft.JAVAabstract;

public abstract class MatchParticipant {
	String name;

	public MatchParticipant(String name) {
		super();
		this.name = name;
	}

	abstract void performRole();

}
