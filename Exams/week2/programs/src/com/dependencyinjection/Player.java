package com.dependencyinjection;

public class Player {
	
	String nickname;
	Tool tool;
	
	public Player(String nickname) {
		this.nickname = nickname;
	}
	
	void useTool() {
		System.out.println(nickname+":");
		tool.using();
	}
}
