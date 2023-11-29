package com.demo.beans;

public class CustomeTree 
{
     /*class Node{
    	 int data;
    	 Node left;
    	 Node right;
    	 
    	 public Node(int data){
    		 this.data=data;
    		 left=null;
    		 right=null;
    		 
    	 }
     }
     
    Node root;
     
     public CustomeTree()
     {
    	 root=null;
     }
     public void insertNode(int key)
     {
    	 root=insertNode(root,key);
    	// System.out.println("bfdhf");
     }
     private Node insertNode(Node root,int data)
     {
    	 
    	 if(root==null)
    	 {
    		 Node newNode=new Node(data);
    		 root=newNode;
    		 return root;
    	 }
    	 
    	 if(data<root.data)
    		 root.left=insertNode(root.left,data);
    	 else
    		root.right=insertNode(root.right,data);
    	 
    	 
    	 return root;
     }
     
     public void inOrder()
     {
    	 inOrder(root);
     }
     
     private void inOrder(Node root)
     {
    	 if(root!=null) {
    		 inOrder(root.left);
    		 System.out.print(root.data+" ");
    		 inOrder(root.right);
    	 }
     }
     public void preOrder()
     {
    	 preOrder(root);
     }
     
     private void preOrder(Node root)
     {
    	 if(root!=null) {
    		 System.out.print(root.data+" ");
    		 preOrder(root.left);
    		 preOrder(root.right);
    	 }
     }
     
     public void postOrder()
     {
    	 postOrder(root);
     }
     
     private void postOrder(Node root)
     {
    	 if(root!=null) {
    		 postOrder(root.left);
    		 postOrder(root.right);
    		 System.out.print(root.data+" ");
    	 }
     }*/
     
	
	public class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	Node root;
	 
	public CustomeTree() {
		root=null;
	}
	
	public void insertNode(int key) {
		root=insertNode(root,key);
	}
	
	private Node insertNode(Node root,int key) {
		if(root==null) {
			Node newNode=new Node(key);
		    root=newNode;
		    return root;
		}
		if(key<root.data)
			root.left=insertNode(root.left,key);
		else
			root.right=insertNode(root.right,key);
		
		return root;
	}
	 
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node root) {
		if(root==null)
			return;
			
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(Node root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}
