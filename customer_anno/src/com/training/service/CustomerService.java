package com.training.service;

import java.util.List;

import com.training.bean.Customer;

public interface CustomerService {

	public String addCustomer(Customer customer);
	public List<Customer> displayAll();

}
