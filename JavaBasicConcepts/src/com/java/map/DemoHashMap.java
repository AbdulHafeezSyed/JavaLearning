package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,Player> player= new HashMap();
      Player p1=new Player(18, "virat", "banglore");
      Player p2=new Player(9,"faf du plesis","delhi");
      
      player.put(1, p1);
      player.put(2, p2);
      
      //System.out.println(player);
      for(Player p: player.values()) {
    	  System.out.println(p);
      }
      
	}
}
