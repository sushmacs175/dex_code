package com.def.pkg;

public class RemoveChar {

	public static void main(String[] args)
	{
		String str="greeksofgreeks";
		
	    String result=" "; 	
	    
	    for(int i=0;i<str.length();i++)
	    {
	        String  ch=" "+str.charAt(i);
	        if(result.contains(ch)) //if ch is present in result dont add
	        {
	        continue;
	        }
	        result=result+ch;
	    }
	    System.out.println(result);
	}
}
