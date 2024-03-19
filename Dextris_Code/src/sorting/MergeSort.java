package sorting;

public class MergeSort {

	public static void main(String[] args)
	{
		int arr[]= {6,3,9,5,2,8};
		int n=arr.length;
		
		divide(arr,0,n-1);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void divide(int arr[],int si,int ei)
	{
		if(si>=ei) 
		{
			return;
		}
		int mid=si+(ei-si)/2;  
		
		divide(arr,si,mid); //1st part
		
		divide(arr,mid+1,ei); //2nd part
		
		conquer(arr,si,mid,ei);
		
	}

	public static void conquer(int[] arr, int si, int mid, int ei) {
		
		int merged[]=new int[ei-si+1]; //+1 bcz index starts from zero
		
		int idx1=si;
		int idx2=mid+1;
		
		int x=0;
		
		while(idx1<=mid && idx2<=ei) //keep sorting
		{
			if(arr[idx1]<=arr[idx2])
			{
				merged[x]=arr[idx1];
				x++;
				idx1++;
			}
			else
			{
				merged[x]=arr[idx2];
				x++;
				idx2++;
			}		
		}
		//put remaining element if left in array 
		while(idx1<=mid)
		{
			merged[x++]=arr[idx1++]; //1st array
		}
		while(idx2<=ei)
		{
			merged[x++]=arr[idx2++]; //2nd array
		}
		
		//inside original array - copy merged array elements into it
		
		for(int i=0 ,j=si; i<merged.length;i++,j++)
		{
			arr[j]=merged[i];
		}
	}
} 	
