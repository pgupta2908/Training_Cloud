package com.training.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.training.bean.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;

@Controller
public class CustomerController {
	@Autowired
	static
	CustomerService service;
public static void main (String [] args)
{
	
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
				Customer customer = null;
				//Customer customer = new Customer();
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
