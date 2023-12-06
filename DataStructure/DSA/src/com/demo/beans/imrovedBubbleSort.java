package com.demo.beans;

import java.util.Arrays;

public class imrovedBubbleSort {

	public static void main(String[] args) {
		int[]arr= {3,5,1,2,34,23,7,89,89,0,4};
		System.out.println("Given array");
		System.out.println(Arrays.toString(arr));
		improvedbubblesort(arr);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(arr));

	}

	private static void improvedbubblesort(int[] arr) {
		int n=arr.length-1;
		boolean flag;
		int swap=0;
		for(int i=0;i<n;i++)  
		{ 
			flag =false; // improved bubble sort
			for(int j=0;j<n;j++)
			{
				if(arr[j]>arr[j+1]) // sorting condition
				{  
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag =true;
					
					swap++;
					}
			}

			if(!flag)
			{
				break;
			}
		}System.out.println(" total swapping  "+swap);
		
	}

}
