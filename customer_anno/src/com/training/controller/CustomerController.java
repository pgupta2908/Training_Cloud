package com.training.controller;

import java.util.List;
import java.util.Scanner;

import com.training.bean.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;

public class CustomerController {

	public static void main(String [] args)
	{
		CustomerService service;
		while (true)

		{
			System.out.println("Please enter a choice");
			System.out.println("1. Add a person");
			System.out.println("2. Display all persons");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			if(choice<1 || choice>2)
				System.out.println("Invalid input");
			else
			{
				switch(choice)
				{
				case 1:
					service=new CustomerServiceImpl();
					Customer customer = new Customer();
					service.addCustomer(customer);
					break;
					
				case 2:
					service=new CustomerServiceImpl();
					service.displayAll();
					break;
				}
			}
		}

	}
}