package com.training.repository;

import com.training.model.Customer;

public interface ICustomerRepository {

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