package com.def.pkg;

public class FourSum {

	void findFourElements(int arr[], int n, int X) 
    {
        // Fix the first element and find other three
        for (int i = 0; i < n - 3; i++) 
        {
            // Fix the second element and find other two
            for (int j = i + 1; j < n - 2; j++) 
            {
                // Fix the third element and find the fourth
                for (int k = j + 1; k < n - 1; k++) 
                {
                    // find the fourth
                    for (int l = k + 1; l < n; l++) 
                    {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == X) 
                        {
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[k] +" "+arr[l]);
                        }   
                    }
                   
                }
            }
        }
    }
 
    public static void main(String[] args) 
    {
        FourSum findfour = new FourSum();
        int arr[] = {1, 0, -1, 0, -2, 2};
        int n = arr.length;
        int X = 0;
        findfour.findFourElements(arr, n, X);
    }

}
