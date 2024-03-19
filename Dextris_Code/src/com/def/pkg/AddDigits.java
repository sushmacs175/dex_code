package com.def.pkg;

public class AddDigits {

	public static void main(String[] args) {
		int num=38;
		
		int a=addNum(num);
		System.out.println(a);	
	}
	
	public static int addNum(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int a=num%10;
			sum=sum+a;
			num=num/10;
		}
		if(sum>9)
		{
		return  addNum(sum);
		}
		return sum;
	}
}
