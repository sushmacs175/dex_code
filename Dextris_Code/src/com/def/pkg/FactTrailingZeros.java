package com.def.pkg;

public class FactTrailingZeros {

	public static void main(String[] args) {
		int n=5;
		System.out.println(trailingZeros(n));
	}

	public static int trailingZeros(int n)
	{
		int result=0;
		
		while(n>0)
		{
			n=n/5;
			result=result+n;
		}
		return result;
	}
}
