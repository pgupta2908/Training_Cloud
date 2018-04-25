package com.training.controller;

import java.util.Scanner;

import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;

public class CustomerController {

	static CustomerService service = new CustomerServiceImpl();

	public static void main (String [] args)
	{

		while (true)

		{
			System.out.println("Please enter a choice");
			System.out.println("1. Add a person");
			System.out.println("2. Display all persons");
			System.out.println("3. Exit");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			if(choice<1 || choice>3)
				System.out.println("Invalid input");
			else
			{
				switch(choice)
				{
				case 1:
				{
					String msg=service.addCustomer();
					System.out.println(msg);
				}
					break;

				case 2:
					service.displayAll();
					break;
					
				case 3:
					System.out.println("GoodBye");
					System.exit(0);
				}
			}
			//scanner.close();
		}
	}			

}
