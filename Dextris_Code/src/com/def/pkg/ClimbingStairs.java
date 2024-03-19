package com.def.pkg;

public class ClimbingStairs {

	public static void main(String[] args) {
		
    int n=3;
    
	System.out.println(climbingStairs(n));
    
	}

	public static int climbingStairs(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		int[] a=new int[n+1];
		a[1]=1;
		a[2]=2;
		
		for(int i=3;i<=n;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		
		return a[n];
	}
}


