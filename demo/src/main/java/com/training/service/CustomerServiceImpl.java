package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Customer;
import com.training.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
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
