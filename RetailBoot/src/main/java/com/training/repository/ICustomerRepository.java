package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{
	
/*	public ResponseEntity<Customer> addCustomer(Customer customer);

	public ResponseEntity<List<Customer>> updateCustomer(int customerId);

	public ResponseEntity<List<Customer>> deleteCustomer(int customerId);*/

}