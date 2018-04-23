package com.training.repository;

import java.util.ArrayList;
import com.training.bean.Customer;

public interface CustomerRepository {

	public String addCustomer(Customer customer);
	
	public ArrayList<Customer> displayAll();
	
}
