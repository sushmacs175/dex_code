package com.def.pkg;

public class Palindrome {

	public static void main(String[] args) {
		String str="race a car";
		
		Palindrome p=new Palindrome();
		System.out.println(p.isPalindrome(str));
	}

	public  boolean isPalindrome(String str) {
		str=str.toLowerCase();
		str=str.replaceAll("[^a-zA-Z0-9]","");
		int start=0;
		int end=str.length()-1;
		
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
			return false;
			}
			start++;
			end--;		
		}
	return true;
	}
}
