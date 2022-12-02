package com.dependencyinjection;

public class PickaxeTool extends Tool{
	
	public PickaxeTool(String material) {
		super(material);
	}

	@Override
	void using() {
		System.out.println("Is using " + material + " Pickaxe...\n\n");	
	}
}
