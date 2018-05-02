package com.cg.service;

import com.cg.entity.Customer;

/**
 * @author trainee
 *
 */
public interface CustomerService {

	/**
	 * @param customer
	 * @return
	 */
	public Customer addCustomer(Customer customer);

	/**
	 * @param customer
	 * @return
	 */
	public Customer updateCustomer(Customer customer);

	/**
	 * @param customerId
	 * @return
	 */
	public Customer deleteCustomer(int customerId);
}
