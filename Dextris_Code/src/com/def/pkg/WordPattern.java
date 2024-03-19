package com.def.pkg;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		String pattern="abba";
		String s="dog cat cat dog";

		System.out.println(wordPattern(pattern,s));
		
	}

	public static boolean wordPattern(String pattern,String s)
	{
		Map<Character, String> map=new HashMap<>();
		
		String[] arr=s.split(" ");
		
		if(arr.length!=pattern.length())
		{
			return false;
		}
		
		for(int i=0;i<pattern.length();i++)
		{
		char c = pattern.charAt(i);
	    String  word = arr[i];
		if((map.containsKey(c) && !map.get(c).equals(word)) ||
			    (!map.containsKey(c) && map.values().contains(word)))
			    	{
			    		return false;
			    	}
	    map.put(c, word);
		}
		return true;
	}
}
