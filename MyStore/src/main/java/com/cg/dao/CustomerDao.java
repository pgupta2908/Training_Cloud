package com.cg.dao;

import com.cg.entity.Customer;

/**
 * @author trainee
 *
 */
public interface CustomerDao {

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
	public String deleteCustomer(int customerId);
}
