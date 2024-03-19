package com.def.pkg;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6};
		int n=arr.length;
		int k=5;
		
		System.out.println(findIndex(arr,n,k));	
	}
	
	public static int findIndex(int arr[],int n,int k)
	{
		int start=0;
		int end=n-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(k>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return end+1;
	}

}
