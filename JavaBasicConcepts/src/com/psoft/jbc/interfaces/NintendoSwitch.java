package com.psoft.jbc.interfaces;

public class NintendoSwitch implements PowerControl, OnlineMultiplayer {
	boolean isdoked;

	public NintendoSwitch(boolean isduked) {
//		super();
		this.isdoked = isduked;

	}

	public void powerOn() {
		if(isdoked) {
			System.out.println("\nNintendoSwitch is ON is doked mode");
		}
		else {
			System.out.println("NintendoSwitch is ON is in handheld mode");
		}

	}

	public void powerOff() {
		System.out.println("NintendoSwitch is turning off\n ");
	}

	public void connectToNetwork(String network) {

	}

	public void startMultiplayerSession(String game) {
	}

}
