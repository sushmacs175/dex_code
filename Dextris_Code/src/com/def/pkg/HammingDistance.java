package com.def.pkg;

public class HammingDistance {

	public static void main(String[] args) {
	
		int x=1;
		int y=4;
		
		int count=hammingDistance(x,y);
		System.out.println(count);

	}

	public static int hammingDistance(int x, int y) {
		
		int xorResult=x^y; // 0001 or 
						   //  0100  = 5
		int count=0;
		while(xorResult>0)
		{
			xorResult=xorResult&(xorResult-1); //5 & (5-1) // 0101 & 0100   (perform AND operation)   //4&(4-1) // 0100 &0011 = 0
			count++; //1 //2
		}
		
		return count;
	}
}
