package crudOperationUsingCollection;

import java.util.Scanner;

public class CustomerService 
{
	 CustomerRepository repo=new CustomerRepository();
	 Scanner sc = new Scanner(System.in);
	public void insertRecord()
	{
		System.out.println("-------------------------");
		System.out.println("Enter customer id :");
		int v1=sc.nextInt();
		System.out.println("Enter customer name :");
		sc.nextLine();
		String v2=sc.nextLine();
		System.out.println("Enter customer city :");
		String v3=sc.nextLine();
		System.out.println("Enter customer phone :");
		String v4=sc.nextLine();
		System.out.println("-------------------------");
		Customer cust=new Customer(v1,v2,v3,v4);
		repo.saveRecord(cust);
	}
	public void showRecord() 
	{	
		System.out.println("-------------------------");
		System.out.println("Enter customer id :");
		int v1=sc.nextInt();
		repo.showRecord(v1);
	}
	public void deleteRecord()
	{
		System.out.println("-------------------------");
		System.out.println("Enter customer id :");
		int cid=sc.nextInt();
		repo.deleteRecord(cid);
	}
	public void showAllRecord()
	{
		repo.showCustomerList();
	}	 
}
