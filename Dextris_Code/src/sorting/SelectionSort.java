package sorting;

public class SelectionSort {

	public static void main(String[] args) {
	   int arr[]= {64,25,12,22,11};
	   
	   for(int i=0;i<arr.length-1;i++)
	   {
		   int min_index=i;
		   for(int j=i+1;j<arr.length;j++)
		   {
			  if( arr[min_index]>arr[j])
			  {
				 min_index=j;
			  }
		   }
		   
		   int temp=arr[min_index];
		   arr[min_index]=arr[i];
		   arr[i]=temp;
	   }

	   for(int a:arr)
	   {
		   System.out.print(a+" ");
	   }
	}

}
