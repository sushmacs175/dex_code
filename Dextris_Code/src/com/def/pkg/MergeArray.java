package com.def.pkg;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int nums1[]= {1,2,3,0,0,0};
		int nums2[]= {2,5,6};
		
		int[] res=new int[nums1.length+nums2.length];
		
		for(int i=0;i<nums1.length;i++)
		{
			res[i]=nums1[i];
		}
		
		for(int i=0;i<nums2.length;i++)
		{
			res[nums2.length+i]=nums2[i];
		}
		Arrays.sort(res);
		
	    int[] arr= res;
	    int start=3;
	    int end=9;
	    int newArr[] = Arrays.copyOfRange(arr, start, end);
	    System.out.println(Arrays.toString(newArr));
	}

}
