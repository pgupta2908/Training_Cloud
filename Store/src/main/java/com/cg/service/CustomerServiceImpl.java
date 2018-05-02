package com.cg.service;

import com.cg.dao.CustomerDao;
import com.cg.entity.Customer;

/**
 * @author trainee
 *
 */
public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerDao;

	/**
	 * @param customerDao
	 */
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public CustomerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param customerDao
	 */
	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	@Override
	public Customer deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(customerId);
	}

}
