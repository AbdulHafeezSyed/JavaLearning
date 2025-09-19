package com.konic.jdbc.main;

import java.util.List;

import com.konic.Dao.PlayerDAO;
import com.konic.model.Player;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerDAO dao=new PlayerDAO();
		
		dao.addPlayer(new Player(1,"siraj",40000));
		dao.addPlayer(new Player(2,"shami",50000));
		dao.addPlayer(new Player(3,"rahane",60000));
		dao.addPlayer(new Player(4,"pujara",70000));
		
		List<Player> player=dao.getAllPlayers();
		player.forEach(System.out::println);

	}

}
