/*package com.cg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.controller.applicationConfig;
import com.cg.entity.Customer;
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;

public class CustomerTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(applicationConfig.class);

	CustomerService customerService = context.getBean("customerService", CustomerServiceImpl.class);

	@Test
	public void addCustomerTest() {

		Customer customer = new Customer(101, "prat", "delhi", "cash");
		Customer value = customerService.addCustomer(customer);

		assertEquals(customer, value);
	}

	@Test
	public void deleteCustomerTest() {
		Customer customer = new Customer(101, "prat", "delhi", "cash");
		customerService.addCustomer(customer);
		String value = customerService.deleteCustomer(101);

		assertEquals(null, value);
	}

	@Test
	public void updateCustomerTest() {
		Customer customer = new Customer(101, "prat", "delhi", "cash");
		customer.setPaymentMode("card");
		Customer updatedCustomer = customer;
		Customer serviceCustomer = customerService.updateCustomer(updatedCustomer);

		assertEquals(updatedCustomer, serviceCustomer);
	}

}
*/