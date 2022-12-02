package com.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal2 {

	public static void main(String[] args) {
		
		List<Player> PlayerList = new ArrayList<>();
		PlayerList.add(new Player("ElRichMC","id1",100));
		PlayerList.add(new Player("Shadoune666","id23",93));
		PlayerList.add(new Player("SpreenMC","id66",40));
		PlayerList.add(new Player("SamuelSantyago","id1243",7));
			
		showPlayers(PlayerList,y -> y.getLevel() > 30);
		showPlayers(PlayerList,x -> x.getPlayerId().length() > 50);
		showPlayers(PlayerList,w -> w.getLevel() > 70);		
	
	}
	
	static void showPlayers(List<Player> playerList, Predicate<Player> player ) {

		for(Player p :playerList) {
			if (player.test(p)) 
				System.out.println(p);
		}
	}

}
