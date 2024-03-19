package com.def.pkg;

public class TwoSum {

		public static int[] twoSum(int[] arr,int target) {
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]+arr[j]==target)
					{
						return new int[] {i,j};
						
					}
				}
			}
			return arr;
	}

		public static void main(String[] args)
		{
			int[] arr= {2,7,11,15};
			int output[]=twoSum(arr,9);
			for(int i=0;i<output.length;i++)
			{
				System.out.println(output[i]+" ");
			}
			
		}
		
}
