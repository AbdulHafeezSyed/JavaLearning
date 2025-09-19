package com.psoft.jbc.interfaces;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayStation pc =new PlayStation("PS5");
		pc.powerOn();
		pc.powerOff();
		pc.connectToNetwork("Home_Wifi");
		pc.startMultiplayerSession("Real cricket");
		NintendoSwitch sc=new NintendoSwitch(true);
		sc.powerOn();
		sc.powerOff();
		NintendoSwitch ns=new NintendoSwitch(false);
		ns.powerOn();
		ns.powerOff();
	}

}
 