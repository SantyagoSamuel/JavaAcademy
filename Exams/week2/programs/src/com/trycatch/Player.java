package com.trycatch;

public class Player implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Player Closed");
	}
	
	
	@Override
	public String toString() {
		return "Player []";
	}	
}
