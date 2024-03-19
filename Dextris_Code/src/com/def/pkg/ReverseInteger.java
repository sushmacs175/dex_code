package com.def.pkg;

public class ReverseInteger {

	public static void main(String[] args) {
	

		int x=120;
	    System.out.println(reverse(x));
	    
	}

	
	 public static int reverse(int x) {
	    long rev = 0;

	    while (x != 0) {
	      rev = rev * 10 + x % 10;
	      x /= 10;
	    }

	    return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int) rev;
	 }
}
