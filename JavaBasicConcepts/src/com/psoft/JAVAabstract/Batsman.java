package com.psoft.JAVAabstract;

public class Batsman extends CricketPlayer {

	Batsman(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("Batsman" + Name);

	}

}

