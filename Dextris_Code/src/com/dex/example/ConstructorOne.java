package com.dex.example;

public class ConstructorOne {
	
	public ConstructorOne(String name) {
		System.out.println("this is from default constructor"+name);
		
	}
	
	//public ConstructorOne() {}
	
	public static void main(String[] args) {
		new ConstructorOne("hello"); 
				
	}
}
