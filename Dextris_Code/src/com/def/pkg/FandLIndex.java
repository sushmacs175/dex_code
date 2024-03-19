package com.def.pkg;

import java.util.Arrays;

public class FandLIndex {

	public static void main(String[] args) {
		int arr[]= {5,7,7,7,8,10};
		int target=7;
		System.out.println(Arrays.toString(findPosition(arr,target)));

	}

	public static int[] findPosition(int[] arr,int target)
	{
		int firstindex=-1;
		int lastindex=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target && firstindex==-1)
			{
				firstindex=i;
			}
			
			if(arr[i]==target && firstindex!=-1)
			{
				lastindex=i;
			}
			
		}
		return new int[]{firstindex,lastindex};
	}
}
