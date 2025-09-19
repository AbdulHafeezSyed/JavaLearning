package com.psoft.jbc.interfaces;

public class PlayStation implements PowerControl, OnlineMultiplayer {
	String Model;

	public PlayStation(String model) {
//		super();
		Model = model;
	}

	public void powerOn() {
		System.out.println("Playstation "+Model+" is on");

	}

	public void powerOff() {
		System.out.println("Playstation "+Model+" is off");

	}

	public void connectToNetwork(String network) {
		System.out.println("Playstation is connected to network"+network);

	}

	public void startMultiplayerSession(String game) {
		System.out.println("Starting multiplayergame "+game+"on playstation");

	}

}
