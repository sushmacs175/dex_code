package com.def.pkg;

public class MoveZeroes {

	public static void main(String[] args) {
		
		int arr[]= {0,1,0,3,12};
		int[] output=moveZeros(arr);
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]+" ");
		}
		
	}

	public static int[] moveZeros(int arr[])
	{
		int insertPosition=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[insertPosition]=arr[i];
				insertPosition++;
			}
		}
		
		while(insertPosition<arr.length)
		{
			arr[insertPosition]=0;
		}
		return arr;
	}
}
