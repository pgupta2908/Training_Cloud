package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Customer;
import com.training.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepository dao;

	@Override
	public Customer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(int customerId) {
		return dao.updateCustomer(customerId);
	}

	@Override
	public String deleteCustomer(int customerId) {
		return dao.deleteCustomer(customerId);
	}

}
