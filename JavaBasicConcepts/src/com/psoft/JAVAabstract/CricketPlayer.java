package com.psoft.JAVAabstract;

public abstract class CricketPlayer {
	String Name;

	public CricketPlayer(String name) {
		super();
		Name = name;
	}

	abstract void play();
	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		CricketPlayer bat = new Batsman("Virat");
//		bat.play();
		CricketPlayer ball=new Bowler("shami");
		ball.play();
	}
	} 


class Bowler extends CricketPlayer {

	public Bowler(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("Bowler" + Name);

	}
}

//class AllRounder extends CricketPlayer {
//
//	public AllRounder(String name) {
//		super(name);
//
//	}
//
//	@Override
//	public void play() {
//		System.out.println("AllRounder" + Name);
//
//	}
//}

	

