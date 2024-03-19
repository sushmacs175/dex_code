package com.def.pkg;

public class RepeatedSubstring {

	public static void main(String[] args) {
		String s="abcdabcd";
		
		boolean b=repeatedSubstring(s);
		System.out.println(b);

	}

	public static boolean repeatedSubstring(String s)
	{
		int len=s.length();
		
		for(int i=len/2;i>=1;i++)
		{
			if(len%i==0)
			{
				int repeat=len/i;
				
				StringBuilder sb=new StringBuilder();
				String sub=s.substring(0,i);
				for(int j=0;j<repeat;j++)
				{
					sb.append(sub);
					if(sb.toString().equals(s))
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
