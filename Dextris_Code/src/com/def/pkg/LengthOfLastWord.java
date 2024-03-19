package com.def.pkg;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String str=" fly me   to   the moon ";
		str=str.trim();
		int len=0;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ')
			{
				break;
			}
			else
			{
			len++;	
			}
		}
		System.out.println("length of last word in astring is "+ len);
	}
}
