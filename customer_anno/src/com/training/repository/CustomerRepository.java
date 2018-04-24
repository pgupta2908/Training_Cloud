package com.training.repository;

import java.util.List;

import com.training.bean.Customer;

public interface CustomerRepository {

	public String addCustomer(Customer customer);
	
	public List<Customer> displayAll();
	
}