package com.def.pkg;

import java.util.HashMap;
import java.util.Map;

public class isomorphicMap {

	public static void main(String[] args) {
		
		String s="foo";
		String t="bar";
		System.out.println(isIsomorphic(s,t));
	}

	public static boolean isIsomorphic(String s,String t)
	{
		if(s.length()!=t.length())
		{
			return false;
		}
		Map<Character, Character> map = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ss = s.charAt(i);
		    char tt = t.charAt(i);
		    
		    if((map.containsKey(ss) && map.get(ss)!=tt) ||
		    (!map.containsKey(ss) && map.values().contains(tt)))
		    	{
		    		return false;
		    	}
		    	
		    map.put(ss, tt);
		    
		}
		return true;
	}
}
