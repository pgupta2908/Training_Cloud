package com.training.repository;

import java.util.List;

import com.training.bean.Customer;

/**
 * @author Pratyush Gupta
 *
 */
public interface CustomerRepository {

	public String addCustomer();

	public List<Customer> displayAll();

}
