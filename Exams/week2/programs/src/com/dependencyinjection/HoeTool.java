package com.dependencyinjection;

public class HoeTool extends Tool{

	public HoeTool(String material) {
		super(material);
	}

	@Override
	void using() {
		System.out.println("Is using " + material + " hoe...\n\n");	
	}
	
}
