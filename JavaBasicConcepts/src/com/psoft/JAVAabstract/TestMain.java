package com.psoft.JAVAabstract;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchParticipant cricket=new Player(" Rohit sharma");
		cricket.performRole();
		MatchParticipant ump=new Umpire("Dharmasena");
		ump.performRole();
		MatchParticipant com=new Commentator("Ravi shahtri");
		com.performRole();
		
	}

}
