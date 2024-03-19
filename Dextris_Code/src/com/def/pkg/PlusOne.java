package com.def.pkg;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
	
		int [] digits = {4,3,2,1}; 
        int[]a=plusOne(digits); 
        System.out.println(Arrays.toString(a));
	}

	public static int[] plusOne(int[] digits)
	{
		for(int i=digits.length-1;i>=0;i--)
		{
			if(digits[i]==9)
			{
				digits[i]=0;
			}
			else
			{
				digits[i]++;
				return digits;
			}
		}
		digits=new int[digits.length+1];
		digits[0]=1;
		return digits;
	}
}
