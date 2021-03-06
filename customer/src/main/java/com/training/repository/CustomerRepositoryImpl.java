package com.training.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.bean.Customer;

/**
 * @author Pratyush Gupta
 *
 */
public class CustomerRepositoryImpl implements CustomerRepository {

	List<Customer> list = new ArrayList<Customer>();

	@Override
	public String addCustomer() {
		Scanner scanner = new Scanner(System.in);

		Customer customer = new Customer();

		System.out.println("Please enter first name");
		String fName = scanner.next();
		customer.setFirstName(fName);

		System.out.println("Please enter last name");
		String lName = scanner.next();
		customer.setLastName(lName);

		// scanner.close();
		list.add(customer);

		return "record added successfully";
	}

	@Override
	public List<Customer> displayAll() {

		if(list.isEmpty())
			System.out.println("List is empty currently");
		else 
		{
			for (Customer customer : list) {
				System.out.println(customer);
			}
		}
		
		return list;
	}

}
