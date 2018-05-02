package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.cg.entity.Customer;
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;

public class CustomerTest {

	@Test
	public void addCustomerTest() {
		CustomerService test = new CustomerServiceImpl();
		Customer customer=new Customer(101,"prat","delhi","cash");
		Customer value=test.addCustomer(customer);
		assertEquals(customer, value);
	}
}
