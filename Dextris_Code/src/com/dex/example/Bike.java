package com.dex.example;

public class Bike extends Motor {

	public void engine() {
		System.out.println("Bike engine started");
	}
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.engine();
		bike.m1();
	}
	
	
}
