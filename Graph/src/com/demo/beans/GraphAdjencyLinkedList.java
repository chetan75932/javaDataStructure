package com.demo.beans;

public class GraphAdjencyLinkedList {
	SinglyLinkedList[] arr;
	int vertices;
	
	public GraphAdjencyLinkedList(int vertices)
	{
		this.vertices=vertices;
		arr=new	SinglyLinkedList[vertices];
		
		for(int i=0;i<vertices;i++)
		{
			arr[i]=new 	SinglyLinkedList();
		}
		
		
	}
	
	public void addEdge(int i,int j)
	{
		//System.out.println(i+" "+j);
		arr[i].addAtStart(j);
		//arr[j].addAtStart(i);
	}
	
	public void removeEdge(int i,int j)
	{
		System.out.println(arr[i].deleteByValue(j));
		//System.out.println(arr[j].deleteByValue(i));
		
	}
	
	public void displayLL()
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				 System.out.print(i+ "-->");
				  arr[i].display();
			}
			 
			  
		}
	}
}
