package com.scenariojava.com;

public class ExtecuteAtm {

	public static void main(String[] args) {
	
		Atm a=new ICICI();
		a.checkBal();
		a.withDrawMoney();
		
		JpNagarAtm j=new JpNagarAtm();
		j.interestRate();
	
		

	}

}
