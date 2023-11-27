package com.demo.beans;



public class MyLinkedLIstStack {
	
	Node top=null;
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
		if(top==null) {
			System.out.println("Stack is underFlow ");
			return true;
		}
		
		return false;
	}
	
	public boolean push(int data) {
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
		return true;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int num = top.data;
			top=top.next;
			return num;
		}
	}
	
	public void displayStack() {
		Node temp=top;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
	}
	
}
