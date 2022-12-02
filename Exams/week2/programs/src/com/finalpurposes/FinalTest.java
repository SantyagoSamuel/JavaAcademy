package com.finalpurposes;

//a class with 'final keyword' cannot inherit
public final class FinalTest extends FinalTestFather{
	
	//a variable with 'final keyword' is a constant
	final int x = 1;
	int w = 2;
	//'x' is final and y 'w' is not final
	
	final int ChangeValueOfX() {		
		//we cannot change the value of X
		//x = 2;
		return x;
	}	
	
	int ChangeValueOfW() {
		//'w' unlike 'x' can change its value because don't have the 'final keyword'
		w = 1;
		return w;
	}
	
	//CANNOT OVERRIDE THE METHOD Hello() BECAUSE IT IS FINAL METHOD
	
//	@Override
//	public final String Hello() {
//		String s = "Hello World";
//		return s;
//	}
	
	@Override
	public  String GoodBye() {
		String s = "GoodBye World";
		return s;
	}
}