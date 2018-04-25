package com.training.service;

import java.util.List;

import com.training.bean.Customer;

/**
 * @author Pratyush Gupta
 *
 */
public interface CustomerService {

	public String addCustomer();

	public List<Customer> displayAll();
}
