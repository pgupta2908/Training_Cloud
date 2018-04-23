package com.training.service;

import java.util.List;

import com.training.bean.Customer;
import com.training.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	
	CustomerRepository dao;
				
		@Override
		public String addCustomer(Customer customer) {
			return dao.addCustomer(customer);
		}

		@Override
		public List<Customer> displayAll() {
			return dao.displayAll();
		}
	
}
