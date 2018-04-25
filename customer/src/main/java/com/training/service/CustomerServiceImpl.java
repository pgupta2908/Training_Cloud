package com.training.service;

import java.util.List;

import com.training.bean.Customer;
import com.training.repository.CustomerRepository;
import com.training.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository dao= new CustomerRepositoryImpl();
				
		@Override
		public String addCustomer() {
			return dao.addCustomer();
		}

		@Override
		public List<Customer> displayAll() {
			return dao.displayAll();
		}
	
}
