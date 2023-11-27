package com.demo.test;

import com.demo.beans.*;

public class MyLinkedListStackTest {

	public static void main(String[] args) {
		MyLinkedLIstStack ls=new MyLinkedLIstStack();
		
		ls.push(10);
		ls.push(52);
		ls.push(6);
        ls.displayStack();
        ls.pop();
        ls.displayStack();
        ls.pop();
        ls.displayStack();
        ls.pop();
        ls.displayStack();
        ls.pop();
        
        
    }

}
