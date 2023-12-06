package com.demo.Test;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.beans.QueLinkedlistEmp;
public class TestEmp {

	public static void main(String[] args) {
		QueLinkedlistEmp q1=new QueLinkedlistEmp();
		Employee e1=new Employee(2,"Atharva","Male");
		Employee e3=new Employee(4,"Bansode","female");

		int choice;
		do {
			System.out.println("1.Insert emp\n2.remove emp\n3.Display queue\n");
			System.out.println("4.Display all female employee\n5.Display all male employees\n6 empty queue\n7.queue in reverse order ");
			System.out.println("Enter the choice\n");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				q1.insertemp(e1);
				//q1.insertemp(e2);
				q1.insertemp(e3);
				break;
			case 2:
				q1.removeemp();
				break;
			case 3:
				q1.toString();
				break;
			case 4:
				q1.displayfememp();
				break;
			case 5:	
				q1.displaymaleemp();
		}}
		while(choice!=8);
	}

}
