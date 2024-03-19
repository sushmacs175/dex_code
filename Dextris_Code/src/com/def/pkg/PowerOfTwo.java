package com.def.pkg;

public class PowerOfTwo {

	public static void main(String[] args) {
	
		int n=16;
		System.out.println(powerTwo(n));
	}

	
	public static boolean powerTwo(int n)
	{
		if(n==1) 
		{
			return true;
		}
		if(n%2!=0 || n==0)
		{
			return false;
		}
		return powerTwo(n/2);
	}
}
