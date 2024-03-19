package com.def.pkg;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int arr[]= {7,1,5,3,6,4};
		
		int  a=maxProfit(arr);
		
		System.out.println(a);
		
	

	}
	
	public static int maxProfit(int[]  arr)

	{
		int min=arr[0];
		int maxprofit=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]-min>maxprofit)
			{
			maxprofit=arr[i]-min;	
			}
		}
	return maxprofit;
	}
	}

