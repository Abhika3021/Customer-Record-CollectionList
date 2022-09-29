package crudOperationUsingCollection;

import java.util.Collection;
import java.util.HashMap;

public class CustomerRepository 
{
	HashMap<Integer,Customer> list = new HashMap<Integer,Customer>();

	public void saveRecord(Customer cust)
	{
		list.put(cust.getCid(), cust);
		System.out.println("---------------------------");
		System.out.println("Record has been Inserted..");
		System.out.println("---------------------------");
	}

	public void showRecord(int cid) 
	{
		Customer cust=list.get(cid);
		System.out.println("---------------------------");
		if(cust==null)
		{
			System.out.println("Record not found..");
		}
		else
		{
			showRecord(cust);
		}
		System.out.println("---------------------------");
	}

	public void deleteRecord(int cid)
	{
		Customer cust=list.remove(cid);
		System.out.println("---------------------------");
		if(cust==null)
		{
			System.out.println("Record not found..");
		}
		else
			System.out.println("Customer Record Deleted...");
		System.out.println("-----------------------------");
	}

	public void showCustomerList() 
	{	
		Collection <Customer> c=list.values();
		System.out.println("-----------------------------");
		if(c.isEmpty())
		{
			System.out.println("Customer List is Empty");
			System.out.println("-----------------------------");
		}
		for(Customer cust:c)
		{
			showRecord(cust);
			System.out.println("-----------------------------");
		}
	}
	private void showRecord(Customer cust)
	{
		System.out.println("Customer Id   :"+cust.getCid());
		System.out.println("Customer name :"+cust.getName());
		System.out.println("Customer City :"+cust.getCity());
		System.out.println("Customer Phone:"+cust.getPhone());
	}
	}	 

