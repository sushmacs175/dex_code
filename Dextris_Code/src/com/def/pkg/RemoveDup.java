package com.def.pkg;

public class RemoveDup {

	public static void main(String[] args) {
		int[] arr= {0,0,1,1,1,2,2,3,3,4};
		
		int rd=removeDuplicates(arr);
		System.out.println(rd);
		for(int i=0;i<rd;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
	
	public static  int removeDuplicates(int[] arr)
	{
		
		int rd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[rd]!=arr[i])
			{
				rd++;
				arr[rd]=arr[i];
			}
		}
		return rd+1;
	}

}
