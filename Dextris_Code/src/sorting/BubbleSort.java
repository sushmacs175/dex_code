package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,1,4,2,8};

		bubbleSort(arr);  
         
        for(int a:arr)
        {
        	System.out.print(a+" ");
        }
	}

	public static void bubbleSort(int[] arr) { 
        
         for(int i=0; i < arr.length; i++)
         {  
           for(int j=0; j < arr.length-i-1; j++)
           {  
        	   if (arr[j] > arr[j + 1]) 
        	   {
        		   int  temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }             
            } 
         }
	}
}
