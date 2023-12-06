package com.demo.beans;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[]arr= {3,5,1,2,34,23,7,89,89,0,4};
		System.out.println("Given array");
		System.out.println(Arrays.toString(arr)); // given array
		selectionsort(arr);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(arr)); // sorted array by selection sort
	}

	private static void selectionsort(int[] arr) {
	int n=arr.length-1;
	
	//int i;// end of sorted portion
	
	for(int i=0;i<n;i++)
	{ int minindex=i; //end of sorted portion
	  int j=i+1;// begin of unsorted portion
	  for(;j<=n;j++)
	  { // finding out minimim index from unsorted portion if get it then swap min index with i
		  if(arr[j]<arr[minindex])   
		 {  
			  minindex=j;
		  }
	  }  
	     int temp=arr[i];
	     arr[i]=arr[minindex];
	     arr[minindex]=temp;
	 }
	System.out.println(Arrays.toString(arr));
}

}
