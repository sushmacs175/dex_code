package com.def.pkg;

public class JumpGame {

	public static void main(String[] args) {
		
		int[] nums= {2,3,1,1,4};
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums)
	{
		int finalPosition=nums.length-1; //initially final position is last index
		
		//starting with 2nd last index
		
		for(int idx=nums.length-2;idx>=0;idx--)
		{
			if(idx+nums[idx]>=finalPosition)
			{
				finalPosition=idx;
			}
		}
		return finalPosition==0; //means u have traversed back till 0 means u can reach return true.
	}
}
