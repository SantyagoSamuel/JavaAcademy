package com.dependencyinjection;

public class AxeTool extends Tool{
	
	public AxeTool(String material) {
		super(material);
	}

	@Override
	void using() {
		System.out.println("Is using " + material + " axe...\n\n");	
	}
}
