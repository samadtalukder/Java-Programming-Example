package com.collection_frameworks.arraylist.game;

public class GameModel {
	public String gameName;
	public String gamePlatform;
	
	public GameModel(String gameName, String gamePlatform) {
		super();
		this.gameName = gameName;
		this.gamePlatform = gamePlatform;
	}

	public String getGamePlatform() {
		return gamePlatform;
	}

	public void setGamePlatform(String gamePlatform) {
		this.gamePlatform = gamePlatform;
	}
	
	
	

}
