package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Customer;
import com.training.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepository customerRepo;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> updateCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
