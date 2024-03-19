package com.def.pkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProb {

	public static void main(String[] args) {
		int arr[]= {3,5,7,4};
		int target=12;	
				
		TwoSumProb a=new TwoSumProb();
		int result[] =a.twoSum(arr, target);
		System.out.println(Arrays.toString(result));
		
	}

	public static int[] twoSum(int[] arr,int target)
	{
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			int valueArr= target-arr[i];
			if(hm.containsKey(valueArr))
			{
				return new int[] {hm.get(valueArr),i};
			}
			hm.put(arr[i],i);	
		}
		return new int[] {};
	}
}
