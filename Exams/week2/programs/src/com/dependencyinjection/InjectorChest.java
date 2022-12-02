package com.dependencyinjection;

public class InjectorChest {
	
	static Tool pickaxe = new PickaxeTool("diamond");
	static Tool axe = new AxeTool("Iron");
	static Tool hoe = new HoeTool("stone");
	
	static void toolInject(Player player, int tool) {
		
		switch(tool) {
		case 1: player.tool = pickaxe;
		break;
		case 2: player.tool = axe;
		break;
		default: player.tool = hoe;
		}	
	}
}
