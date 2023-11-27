package com.demo.test;

import com.demo.beans.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack ob=new MyStack(5);
		ob.push(10);
		ob.push(54);
		ob.push(65);
		System.out.println(ob.toString());
		ob.pop();
		
		System.out.println(ob.toString());
		ob.push(231);
		System.out.println(ob.toString());
	}
}
