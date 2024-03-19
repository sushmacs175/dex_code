package com.def.pkg;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {
	int n=2;
	
	System.out.println(grayCode(n));
	}

	public static List<Integer> grayCode(int n) {
        // Initialize an empty list to hold the Gray code sequence
        List<Integer> list = new ArrayList<>();
      
      
		list.add(0);
        
        if(n==0) return list;
        list.add(1);
        
        int curr=1;
        
        for(int i=2;i<=n;i++)
        {
        	curr=curr*2;
        	for(int j=list.size()-1;j>=0;j--)
        	{
        		list.add(curr+list.get(j));
        	}
        }
        return list;
        
       
       
    }
	
}
