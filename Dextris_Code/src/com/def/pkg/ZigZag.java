package com.def.pkg;

public class ZigZag {

	public static void main(String[] args) {
		 String str = "PAYPALISHIRING";
	        int n = 3;
	        System.out.println(convert(str, n));;

	}

	 public static String convert(String s, int numRows) {
	        String ans="";
	        if(numRows==1) return s;
	        for (int i=0;i<numRows;i++) {
	            int incr=2*(numRows-1);
	            for (int j=i;j<s.length();j+=incr) {
	                ans+=s.charAt(j);
	                if(i>0 && i<numRows-1 && j+incr-(2*i)<s.length()) 
	                	{
	                	ans+=s.charAt(j+incr-(2*i));
	                	}
	            } 
	        }
	        return ans;
	    }
}
