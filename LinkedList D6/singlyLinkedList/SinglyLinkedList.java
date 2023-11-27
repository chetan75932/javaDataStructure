package com.demo.beans;

public class SinglyLinkedList {
	Node head=null;
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

public void addAtStart(int data)
{
	Node newnode= new Node(data);
	if(head==null)
	{
		head=newnode;
	}
	else
	{
		newnode.next=head;
		head=newnode;
	}
}

public void addAtEnd(int data)
{
	Node newnode=new Node(data);
	if (head==null)
	{
		head=newnode;
	}
	else 
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
		
	}
}
public void addAtPosition(int data,int pos)
{
	Node newnode=new Node(data);
	Node temp=head;
	int cnt=0;
	if(temp==null)
	{
		System.out.println("empty");
	}
	
	while(cnt!=pos-1)
	{
		temp=temp.next;
		cnt++;
	}
	newnode.next=temp.next;
	temp.next=newnode;
	
	

}

public void deleteAtFirst() {
	/*Node temp=head;
	head=temp.next;
	temp=null;*/
	head=head.next;

} 
public void deleteAtEnd() {
	Node temp=head;
	Node prev=null;
	while(temp.next!=null) {
		prev=temp;
		temp=temp.next;
	}
	
	prev.next=null;
	
} 
public void display() {

	Node temp=head;
	 while(temp!=null)
	 {
		 System.out.println(temp.data);
		 temp=temp.next;
	 }
	
}


}
