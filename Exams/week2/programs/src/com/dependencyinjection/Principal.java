package com.dependencyinjection;

public class Principal {

	public static void main(String[] args) {
		
		Player player1 = new Player("ElRichMC");
		InjectorChest.toolInject(player1, 1);
		player1.useTool();
		
		Player player2 = new Player("SamuelSantyago");
		InjectorChest.toolInject(player2, 2);
		player2.useTool();
		
		Player player3 = new Player("Thomas Shelby");
		InjectorChest.toolInject(player3, 0);
		player3.useTool();

	}

}
