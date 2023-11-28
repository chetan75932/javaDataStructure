package com.demo.test;

import com.demo.beans.Hashing;

public class TestHashTable {

	public static void main(String[] args) {
		Hashing[] arr=new Hashing[5];
        
		for(int i=0;i<arr.length;i++)
			arr[i]=new Hashing();
		
		int values[] = {1,2,324,5,67,76,44,34,345,676,3232,754,324,124};
		
		
		
		//adding the value
		for(int i=0;i<values.length;i++)
		{
			int idx=0;
			idx = values[i]%arr.length;
			
			arr[idx].addValue(values[i]);
			
		}
		
		//print the table with each linked list
		for(int i=0;i<arr.length;i++)
		arr[i].display();
		
		
		//searching the value
		/*int key=3244;
		int idx = key%arr.length;
		boolean found = arr[idx].searchKey(key);
		if(found) {
			System.out.println("Key found at "+idx);
		}else {
			System.out.println("Key not found");
		}*/
		
		
		//delete the key
		int dltKey[] = {23,67,76,44,34,345,676};
		
		for(int i=0;i<dltKey.length;i++)
		{
			
		
			int idx = dltKey[i]%arr.length;
			boolean found = arr[idx].searchKey(dltKey[i]);
			if(found) {
				   boolean status = arr[idx].deleteKey(dltKey[i]);
				   System.out.println("Deleted Succesfully");
			}else {
				System.out.println("Key not found");
			}
		
		}
		
		for(int i=0;i<arr.length;i++)
			arr[i].display();
		
	}

}
