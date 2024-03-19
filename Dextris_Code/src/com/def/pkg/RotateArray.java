package com.def.pkg;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5,6,7};
		int k=3;
		int[] output=rotateArray(arr1,3);
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]+" ");
		}
	   
	}
	
	public static int[] rotateArray(int arr1[],int k)
	{
		for(int i=0;i<k;i++)
		{
		int temp=arr1[arr1.length-1];
		//System.out.println(temp);
		
		for(int j=arr1.length-2;j>=0;j--)
		{
			
			arr1[j+1]=arr1[j];
		}
		arr1[0]=temp;
		}
		return arr1;
	}
	
}
