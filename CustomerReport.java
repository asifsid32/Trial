package javaproj;

import java.util.Scanner;

public class CustomerReport {
	
	 static int index = 0;
	Customer custList[] = new Customer[100];


	
	public Customer addCustomer(Customer c)
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter customer no");
		c.setcustNo(s.nextInt());
		s.nextLine();
		System.out.println("enter customer name");

		c.setcustName(s.nextLine());
		System.out.println("enter customer adddress");

		c.setcustAddr(s.nextLine());
		
		
	}

public void printList( )
{
int i=0;
System.out.println("CustNo\t\tCust Name\t\tCust Address");
while(i<=index)
{
	custList[i].display();
}
}
}