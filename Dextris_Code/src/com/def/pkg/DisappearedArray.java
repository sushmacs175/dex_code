package com.def.pkg;

import java.util.ArrayList;
import java.util.List;

public class DisappearedArray {

	public static void main(String[] args) {
		int[] arr= {4,3,2,2};
		System.out.println(disappearedArray(arr));

	}

	public static List<Integer> disappearedArray(int[] arr)
	{
		List<Integer> result=new  ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			int index=Math.abs(arr[i])-1;
			if(arr[index]<0)
			{
				continue;
			}
			else
			{
				arr[index]=arr[index]*-1;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				result.add(i+1);
			}
		}
		return result;
	}
	
}
