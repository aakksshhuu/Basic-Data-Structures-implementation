package heap;
import java.util.*;
class Heap
{
	void heap(int arr[],int n)
	{
		for(int i=n/2-1;i>=0;i--)
			heapify(arr,i,n);
		
	}
	
	void heapify(int arr[],int i,int n)
	{
		int current=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]<arr[current])
			current=l;
		if(r<n && arr[r]<arr[current])
			current=r;
		if(current!=i)
		{
			int temp=arr[i];
			arr[i]=arr[current];
			arr[current]=temp;
			heapify(arr,current,n);
		}
	}
	
	
}

public class heapSort 
{	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		Heap h=new Heap();
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		h.heap(arr,n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");  // this will print the min heap of entered array.
		
	}

}
