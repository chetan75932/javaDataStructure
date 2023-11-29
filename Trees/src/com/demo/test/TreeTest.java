package com.demo.test;



import com.demo.beans.*;

public class TreeTest {

	public static void main(String[] args) {
		CustomeTree ct=new CustomeTree();
		
	    ct.insertNode(5);
		ct.insertNode(5);
		ct.insertNode(6);
		ct.insertNode(1);
		ct.insertNode(3);
		
		ct.insertNode(9);
		ct.insertNode(7);
		ct.insertNode(13);
	    ct.inOrder();
	    System.out.println();
	    System.out.println("------------");
	    ct.preOrder();
	    System.out.println();
	    System.out.println("------------");
	    ct.postOrder();
	    System.out.println();
	    
	}

}
