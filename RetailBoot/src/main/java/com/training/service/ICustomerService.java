package com.training.service;

import java.util.List;

import com.training.model.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);

	public List<Customer> updateCustomer(int customerId);

	public List<Customer> deleteCustomer(int customerId);

}