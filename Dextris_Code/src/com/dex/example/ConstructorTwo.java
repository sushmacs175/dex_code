package com.dex.example;

public class ConstructorTwo extends ConstructorOne {
	
	public ConstructorTwo(String s) {
		super(s);
	}
	
	public static void main(String[] args) {
		ConstructorTwo two = new ConstructorTwo("hello");
		
	}

}
