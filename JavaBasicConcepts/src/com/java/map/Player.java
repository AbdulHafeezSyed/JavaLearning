package com.java.map;

public class Player {
  int id;
  String name;
  String team;
public Player(int id, String name, String team) {
	super();
	this.id = id;
	this.name = name;
	this.team = team;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getTeam() {
	return team;
}
@Override
public String toString() {
	return "Player [id=" + id + ", name=" + name + ", team=" + team + "]";
}
  
}
