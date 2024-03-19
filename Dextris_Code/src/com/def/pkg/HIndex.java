package com.def.pkg;

public class HIndex {

		static int hIndex(int[] citations, int n)
		{
		    int hindex = 0;
		    int low = 0;
		    int high = n - 1;
		 
		    while (low <= high) 
		    {
		        int mid = (low + high) / 2;
		 
		        // Check if current citations is
		        // possible
		        if (citations[mid] >= (mid + 1))
		        {
		 
		            // Check to the right of mid
		            low = mid + 1;
		 
		            // Update h-index
		            hindex = mid + 1;
		        }
		        else
		        {
		 
		            // Since current value is not
		            // possible, check to the left
		            // of mid
		            high = mid - 1;
		        }
		    }
		 
		    // Print the h-index
		    System.out.println(hindex);
		 
		    return hindex;
		}
		public static void main (String[] args)
		{
		    int n = 5;
		    int[] citations = { 3, 0, 6, 1, 5 };
		    hIndex(citations, n);
		}
}
