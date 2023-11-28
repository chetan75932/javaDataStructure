package com.demo.beans;

public class Hashing {

	
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
	
	Node head;
	
	public Hashing() 
	{
		head=null;
	}

	
	public void display() 
	{

		 Node temp=head;
		 while(temp!=null)
		 {
			 System.out.print(temp.data+"---->");
			 temp=temp.next;
		 }
		 
		 System.out.println();
		
	}


	public void addValue(int data) {
		Node newNode=new Node(data);
		
		if(head==null)
			 head=newNode;
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}


	public boolean searchKey(int key) {
		// TODO Auto-generated method stub
		Node temp=head;
		 while(temp!=null)
		 {
			 if(temp.data==key)
				 return true;
			 
			 temp=temp.next;
		 }
		 
		return false;
	}


	public boolean deleteKey(int key) {
		Node temp=head;
		Node prev=null;
		
		if(head.data==key)
		{
			head=head.next;
			return true;
		}else {
			while(temp!=null)
			{
				if(temp.data==key)
				{
					prev.next=temp.next;
					return true;
				}
				prev=temp;
				temp=temp.next;
			}
			
			return false;
		}
		
	}

}
