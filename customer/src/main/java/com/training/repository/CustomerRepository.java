package com.training.repository;

import java.util.List;

import com.training.bean.Customer;

public interface CustomerRepository {

	public String addCustomer();
	
	public List<Customer> displayAll();
	
}
