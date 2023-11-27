package com.demo.beans;

public class DoubleLinkedList {
     Node head;
     public class Node{
    	 int data;
    	 Node next;
    	 Node prev;
    	 
    	 public Node(int data) {
    		 this.data=data;
    		 next=null;
    		 prev=null;
    	 }
     }
     
     public DoubleLinkedList() {
    	 head=null;
     }
     public void addAtFirstPosition(int data) {
    	 Node newNode=new Node(data);
    	 if(head==null) {
    		 head=newNode;
    	 }
    	 else {
    		 newNode.next=head;
    		 head.prev=newNode;
    		 head=newNode;
    	 }
     }
     
     
 
	public void displayLinkedList() {
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void addAtEnd(int data)
     {
    	 Node newNode=new Node(data);
    	 Node temp=head;
    	 
    	 while(temp.next!=null)
    	 {
    		 temp=temp.next;
    	 }
    	 
    	 temp.next=newNode;
    	 newNode.prev=temp;
    	 
    	 
     }
     public void addAtPosition(int data,int position)
     {
    	 Node newNode=new Node(data);
    	 int count=1;
    	 
    	 Node temp=head;
    	 
    	 
    	 while(count!=position-1)
    	 {
    		 temp=temp.next;
    		 count++;
    	 }
    	 
    	 newNode.next=temp.next;
    	 temp.next.prev=newNode;
    	 temp.next=newNode;
    	 newNode.prev=temp;
     }
     
     public void dltAtPosition(int position)
     {
    	 if(position==1)
    	 {
    		 head=null;
    	 }else {
    		int count=0;
    		Node temp=head;
    		while(temp!=null && count!=position-1)
    		{
    			temp=temp.next;
    			++count;
    			
    		}
    		if(temp==null)
    		{
    			System.out.println("position is not found");
    			return;
    		}
    		if(temp.next!=null)
    		{
    			if(temp.next.next!=null) {
    				temp.next=temp.next.next;
    				temp.next.next.prev=temp;
    			}else {
    				temp.next.prev=null;
    				temp.next=null;
    			}
    		}
    	 }
     }
}
