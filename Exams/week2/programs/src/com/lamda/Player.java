package com.lamda;

public class Player {
	
	private String nickname;
	private String playerId;
	private int level;
	
	public Player(String nickname, String playerId, int level) {
		super();
		this.nickname = nickname;
		this.playerId = playerId;
		this.level = level;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Player [player ID=" + playerId + ", nickname=" + nickname + ", level=" + level + "]";
	}
	
}
