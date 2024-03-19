package com.def.pkg;

public class LiscenceKeyFormatting {

	public static void main(String[] args) {
		String s="2-5g-3-J";
		int k=2;
		System.out.println(licenseKeyFormatting(s, k));

	}

	public static String licenseKeyFormatting(String s,int k)
	{
		StringBuilder sb=new StringBuilder(s.replaceAll("-","").toUpperCase());
		StringBuilder result=new StringBuilder();
		
		sb.reverse();
		
		int n=sb.length();
		
		for(int i=0;i<n;i=i+k)
		{
			if(i+k<=n)
			{
				result.append(sb.substring(i, i+k));
			}
			else
			{
				result.append(sb.substring(i));
			}
			
			if(i+k<n)
			{
				result.append("-");
			}
		}
		
		return result.reverse().toString();//return string instead of sb
	}
}
