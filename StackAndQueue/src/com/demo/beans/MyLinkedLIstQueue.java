package com.demo.beans;

import com.demo.beans.MyLinkedLIstStack.Node;

public class MyLinkedLIstQueue {
	
	Node front=null;
	Node rear=null;
	public class Node
	{
		int data;
		Node next;
		public Node(int data) 
		{
			this.data = data;
			next=null;
		}
		
	}
	
	public boolean isEmpty() {
		if(front==null && rear==null) {
			return true;
		}
		return false;
	}
	public void enqueue(int data) {
		Node newNode=new Node(data);
		if(front==null && rear==null)
		{
			front=newNode;
			rear=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
			
		}
		
	}
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}else {
			int num=front.data;
			front=front.next;
			return num;
		}
	}
	
	public void displayQeue() {
		Node temp=front;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
	}
	
}