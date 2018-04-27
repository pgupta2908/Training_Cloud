package com.training.service;

import com.training.model.Customer;

/**
 * @author Pratyush Gupta
 *
 */
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
	public void removeCustomer(int customerId);

	/**
	 * @param customerId
	 * @return
	 */
	public Customer updateCustomer(int customerId);

}
