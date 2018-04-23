package com.training.repository;

import java.util.ArrayList;
import java.util.Scanner;

import com.training.bean.Customer;

public class CustomerRepositoryImpl implements CustomerRepository{

	Scanner scanner = new Scanner(System.in);
	@Override
	public String addCustomer(Customer customer) {
		System.out.println("Please enter first name");
		customer.setFirstName = scanner.next()
		customer.setFirstName(firstName);
		
	}

	@Override
	public ArrayList<Customer> displayAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
