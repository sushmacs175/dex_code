package com.def.pkg;

public class anagram {

	public static void main(String[] args) {
		
		String s="rat";
		
		String t="car";
		
		boolean b=anagramofstring(s,t);
		if(b==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}
	public static boolean anagramofstring(String s,String t)
	{
		if(s.contains(t))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
