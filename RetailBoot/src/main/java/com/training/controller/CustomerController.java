package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Customer;
import com.training.service.ICustomerService;
import com.training.service.IGoodsService;
import com.training.service.IRetailerService;
import com.training.service.ISupplierService;

@RestController
public class CustomerController {

	@Autowired
	ICustomerService customerService;

	@Autowired
	ISupplierService supplierService;

	@Autowired
	IGoodsService goodsService;

	@Autowired
	IRetailerService retailerService;

	// @PostMapping("/addCustomer")
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		/*
		 * int customerId=1; String customerName="thor"; String
		 * customerAddress="jaipur"; String paymentMode="cash";
		 * customer.setCustomerId(customerId); customer.setCustomerName(customerName);
		 * customer.setCustomerAddress(customerAddress);
		 * customer.setPaymentMode(paymentMode);
		 */
		//Customer customer = new Customer(1, "asd", "sd", "sd");
//		customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(customerService.addCustomer(customer), HttpStatus.OK);
	}

/*	@RequestMapping(value = "updateCustomer", method = RequestMethod.PUT)
	public ResponseEntity<List<Customer>> updateCustomer(int customerId) {

		customerService.updateCustomer(customerId);
		return new ResponseEntity<List<Customer>>(List<Customer>, HttpStatus.OK);
	}*/

/*	@RequestMapping(value = "/deleteCustomer/{customerId}", method = RequestMethod.DELETE)
	public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable("customerId") int customerId) {
		
		 * List<Customer> list = new ArrayList<>(); Customer cust1 = new Customer(1,
		 * "sohan", "goa", "card"); Customer cust2 = new Customer(2, "taimur", "konkan",
		 * "gold"); Customer cust3 = new Customer(3, "mohan", "bangladesh", "change");
		 * list.add(cust1); list.add(cust2); list.add(cust3);
		 * System.out.println(customerId); System.out.println(list.size());
		 * 
		 * list.set(1, cust1); list.set(2, cust2); list.set(3, cust3);
		 * list.remove(customerId); //System.out.println(list);
		 * //System.out.println(customerId); System.out.println(list.size());
		 

		return customerService.deleteCustomer(customerId);
	}

	@RequestMapping(value = "displayAll", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> displayAllCustomers() {

		
		 * List<Customer> list = new ArrayList<>(); Customer cust1 = new Customer(1,
		 * "sohan", "goa", "card"); Customer cust2 = new Customer(2, "taimur", "konkan",
		 * "gold"); Customer cust3 = new Customer(3, "mohan", "bangladesh", "change");
		 * Customer cust4 = new Customer(4, "prabhat", "goa", "cash"); list.add(cust1);
		 * list.add(cust2); list.add(cust3); list.add(cust4);
		 

		return retailerService.viewAllCustomers();
	}*/
}
