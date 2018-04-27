package com.training.dao;

import com.training.model.Customer;

public interface ICustomerDao {
	/**
	 * @param customer
	 * @return
	 */
	public Customer addCustomer(Customer customer);

	/**
	 * @param customerId
	 * @return
	 */
	public void removeCustomer(int customerId);

	/**
	 * @param customerId
	 * @return
	 */
	public Customer updateCustomer(int customerId);

}
