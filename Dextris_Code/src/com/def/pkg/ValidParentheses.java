package com.def.pkg;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		String str[]= {"()[]{}","(({{{}}))","(([[]]}"};
		for(String s:str)
		{
			System.out.println(isValid(s));
		}
	}
	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<Character>();
		for(char c:s.toCharArray())
		{
			if(c=='(')
			{
				stack.push(')');
			}
			else if(c=='{')
			{
				stack.push('}');
			}
			else if(c=='[')
			{
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop()!=c)
				return false;
		}
		return stack.isEmpty();
	}

}
