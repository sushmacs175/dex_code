package com.def.pkg;

public class ArrEx {

	public static void main(String[] args)
	{
	int nums[]= {3,2,2,3,5,6};
	int val=2;
	int count=0;
	
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]!=val)
		{
			count++;
		
		}
	}
	System.out.println(count);
	
	}
}
