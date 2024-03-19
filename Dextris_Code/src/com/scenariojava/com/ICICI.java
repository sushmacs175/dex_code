package com.scenariojava.com;

public class ICICI implements Atm{

	@Override
	public void checkBal() {
		System.out.println("balnace is 10rs");
		
	}

	@Override
	public void withDrawMoney() {
		
		System.out.println("withdrawing money from ICICI bank");
	}

	public void interestRate()
	{
		
	}
}
