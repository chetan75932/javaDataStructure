package com.demo.beans;

public class SinglyLinkedList {
	Node head;
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

public SinglyLinkedList()
{
	head=null;
}

public void addAtStart(int data)
{
	Node newnode= new Node(data);
	if(head==null)
	{
		//System.out.print(data+" "+"head");
		head=newnode;
	}
	else
	{
		//System.out.print(data+" ");
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

public boolean deleteByValue(int val) {
	if(head==null) {
		System.out.println("list is empty");
	}
	else {
		//delete from the begining
		if(head.data==val) {
			Node temp=head;
			head=head.next;
			//it will make the temp ready for garbage collection
			temp.next=null;
			return true;
		}else {
			Node prev=head;
			Node current=prev.next;
			while(current!=null && current.data!=val) {
				prev=prev.next;
				current=current.next;
				
			}
			if(current!=null) {
				prev.next=current.next;
				current.next=null;
				current=null;
				return true;
			}else {
				System.out.println(val+" not found");
				return false;
			}
		}
	}
	return false;
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
		 System.out.print(temp.data+"------->");
		 temp=temp.next;
	 }
	
	 System.out.println();
}


}
