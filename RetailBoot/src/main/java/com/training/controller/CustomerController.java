package com.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Customer;

@RestController
public class CustomerController {

//	@PostMapping("/addCustomer")
	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public Customer addCustomer(Customer customer)
	{
		/*int customerId=1;
		String customerName="thor";
		String customerAddress="jaipur";
		String paymentMode="cash";
		customer.setCustomerId(customerId);
		customer.setCustomerName(customerName);
		customer.setCustomerAddress(customerAddress);
		customer.setPaymentMode(paymentMode);*/
		return customer;
	}
	
	@RequestMapping(value="updateCustomer", method=RequestMethod.PUT)
	public int updateCustomer(int customerId)
	{
		List<Customer> list = new ArrayList<>();
		Customer cust1 = new Customer(1, "sohan", "goa", "card");
		Customer cust2 = new Customer(2, "taimur", "konkan", "gold");
		Customer cust3 = new Customer(3, "mohan", "bangladesh", "change");
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		return customerId;
	}
	
	@RequestMapping(value="/deleteCustomer/{customerId}", method=RequestMethod.DELETE)
	public List<Customer> deleteCustomer(@PathVariable("customerId")/* @RequestBody @RequestParam("customerId" )*/ int customerId) {
		List<Customer> list = new ArrayList<>();
		Customer cust1 = new Customer(1, "sohan", "goa", "card");
		Customer cust2 = new Customer(2, "taimur", "konkan", "gold");
		Customer cust3 = new Customer(3, "mohan", "bangladesh", "change");
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		System.out.println(customerId);
		System.out.println(list.size());
		
		/*list.set(1, cust1);
		list.set(2, cust2);
		list.set(3, cust3);*/
		list.remove(customerId);
		//System.out.println(list);
		//System.out.println(customerId);
		System.out.println(list.size());
		
		return list;
	}
	
	@RequestMapping(value="displayAll", method=RequestMethod.GET)
	public List<Customer> displayAllCustomers() {
	
		List<Customer> list = new ArrayList<>();
		Customer cust1 = new Customer(1, "sohan", "goa", "card");
		Customer cust2 = new Customer(2, "taimur", "konkan", "gold");
		Customer cust3 = new Customer(3, "mohan", "bangladesh", "change");
		Customer cust4 = new Customer(4, "prabhat", "goa", "cash");
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		list.add(cust4);
		
		return list;
	}
}
