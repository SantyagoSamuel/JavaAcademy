package com.dependencyinjection;

public abstract class Tool {
	
	String material;
	
	public Tool(String material) {
		this.material = material;
	}
	
	abstract void using();
}
