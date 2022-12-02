package com.finalpurposes;

public class FinalTestFather {
	
	//Method with 'final' cannot override
	public final String Hello() {
		String s = "Hello";
		return s;
	}
	
	public  String GoodBye() {
		String s = "GoodBye";
		return s;
	}
	
}
