package com.training.service;

import com.training.model.Customer;

public interface ICustomerService {

	/**
	 * @param customer
	 * @return
	 */
	public Customer addCustomer(Customer customer);

	/**
	 * @param customerId
	 * @return
	 */
	public Customer updateCustomer(int customerId);

	/**
	 * @param customerId
	 * @return
	 */
	public String deleteCustomer(int customerId);

}