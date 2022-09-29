package crudOperationUsingCollection;

import java.util.Scanner;

public class CustomerApp
{
	public static void main(String[] args)
	{
		CustomerService service = new CustomerService();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("--------------------------");
			System.out.println("1: Insert Customer Record");
			System.out.println("2: Show Customer Record");
			System.out.println("3: Delete Customer Record");
			System.out.println("4: Show Customer List");
			System.out.println("5: Exitt");
			System.out.println("--------------------------");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			if(ch==1)
			{
				service.insertRecord();
			}
			if(ch==2)
			{
				service.showRecord();
			}
			if(ch==3)
			{
				service.deleteRecord();
			}
			if(ch==4)
			{
				service.showAllRecord();
			}
			if(ch==5)
			{
				System.out.println("------------------------");
				System.out.println("Your session is over");
				break;
			}
		}
		while(true);
	}
}
